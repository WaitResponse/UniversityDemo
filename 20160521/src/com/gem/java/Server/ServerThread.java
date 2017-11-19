package com.gem.java.Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;


public class ServerThread  extends Thread{
	private List<Person>personList;
	private Socket socket;
	private List<Socket>socketList;
	private static final String PERSON_FILE="src/person01.db";
	public ServerThread(List<Person> personList,Socket socket,List<Socket>socketList){
		this.personList=personList;
		this.socket=socket;
		this.socketList=socketList;
	}
	
	public void run(){		
		InputStream is;
		try {
			loadData(PERSON_FILE);
			is = socket.getInputStream();//建立输入流，读取服客户端传来的信息
			BufferedReader br=new BufferedReader(new InputStreamReader(is));			
			OutputStream os=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);//返回信息给服务器
			while(true){
			String msg=br.readLine();
			String []msgArr=msg.split("___");//将信息以___作为分隔符，将分割的字符串放入到数组
			String operateStr=msgArr[0];//字符串的第一个元素为operate:regist
			//String []operateStrArr=operateStr.split(":");
			//String operate=operateStrArr[1];
			
			String operate=operateStr.split(":")[1];//operate为regist
			
			
			if("regist".equals(operate)){//代表传过来的注册消息
				
				String loginIdStr=msgArr[1];//第二个元素为loginId:loginId
				String pwdStr=msgArr[2];
				String nickNameStr=msgArr[3];
				
				String loginId=loginIdStr.split(":")[1];//以:作为分割符，将字符串再次分割，第二个元素即为客户端传来的登录ID
				String pwd=pwdStr.split(":")[1];
				String nickName=nickNameStr.split(":")[1];
				
				Person person=new Person(loginId,pwd,nickName);
				personList.add(person);//将所的得到的loginId,pwd,nickName封装成一个Person类，将person加入personList
				saveDataToFile();
			
				pw.println("operate:registResult:success");//返回("operate:registResult:success"给客户端
				pw.flush();
			}else if("login".equals(operate)){//如果第一个为login,代表传过来的是登录消息
				String loginIdStr=msgArr[1];
				String pwdStr=msgArr[2];
				String loginId=loginIdStr.split(":")[1];
				String pwd=pwdStr.split(":")[1];
				
				Person person=getPerson(loginId,pwd);
				StringBuilder strBuilder=new StringBuilder("operate:loginResult:");
				if(person==null){
					//如果登录失败，即在Person里面没找到用户信息则在"operate:loginResult:"后面加上fail
					strBuilder.append("fail");//即为"operate:loginResult:fail"
				}else{
					//登录成功
					strBuilder.append("success").append("___")
					.append(person.toString());	//即为"operate:loginResult:succesd___loginId+":::"+pwd+":::	"+nickName"								
				}
				String loginMsg=strBuilder.toString();
				pw.println(loginMsg);
						
				}else if("chat".equals(operate)){
				String content=msgArr[1].split	(":")[1];
														
			
				for(Socket socket:socketList){
					if(socket!=this.socket){						
						new MsgSendThread(content,socket).start();
					}
				}
				
				
				}	
			pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	private Person getPerson(String loginId,String pwd){
		for(Person person:personList){
			if(loginId.equals(person.getLoginId())&&pwd.equals(person.getPwd())){
				return person;
			}else if(loginId.equals(person.getLoginId())&&!pwd.equals(person.getPwd())){
				System.out.println("密码错误,请重新输入!");
			}else if(!loginId.equals(person.getLoginId())&&pwd.equals(person.getPwd())){
				System.out.println("账号不正确,请重新输入!");
			}
		}
		return null;
	}
	//保存数据到文件
	private void saveDataToFile(){
		OutputStream os;
		PrintWriter pw=null;
		try {
			os = new FileOutputStream(PERSON_FILE);
			pw=new PrintWriter(os);
		for(Person person:personList){
			String personStr=person.getLoginId()+"_"+person.getPwd()+"_"+person.getNickName();
			pw.println(personStr);
		}
		pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(pw!=null){
			pw.close();
			}
		}
	}
	//读出数据	
	private void loadData(String filepath) throws IOException{		
			InputStream is;
			BufferedReader br;
			try {
				is = new FileInputStream(filepath);
				br=new BufferedReader(new InputStreamReader(is));
				String str=null;
				while((str=br.readLine())!=null){
				String []personStr=str.split("_");
				String loginId=personStr[0];
				String pwd=personStr[1];
				String nickName=personStr[2];
			Person person=new Person(loginId,pwd,nickName);
			personList.add(person);
			}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

	
	
}

