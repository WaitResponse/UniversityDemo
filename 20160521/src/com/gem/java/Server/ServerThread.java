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
			is = socket.getInputStream();//��������������ȡ���ͻ��˴�������Ϣ
			BufferedReader br=new BufferedReader(new InputStreamReader(is));			
			OutputStream os=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);//������Ϣ��������
			while(true){
			String msg=br.readLine();
			String []msgArr=msg.split("___");//����Ϣ��___��Ϊ�ָ��������ָ���ַ������뵽����
			String operateStr=msgArr[0];//�ַ����ĵ�һ��Ԫ��Ϊoperate:regist
			//String []operateStrArr=operateStr.split(":");
			//String operate=operateStrArr[1];
			
			String operate=operateStr.split(":")[1];//operateΪregist
			
			
			if("regist".equals(operate)){//����������ע����Ϣ
				
				String loginIdStr=msgArr[1];//�ڶ���Ԫ��ΪloginId:loginId
				String pwdStr=msgArr[2];
				String nickNameStr=msgArr[3];
				
				String loginId=loginIdStr.split(":")[1];//��:��Ϊ�ָ�������ַ����ٴηָ�ڶ���Ԫ�ؼ�Ϊ�ͻ��˴����ĵ�¼ID
				String pwd=pwdStr.split(":")[1];
				String nickName=nickNameStr.split(":")[1];
				
				Person person=new Person(loginId,pwd,nickName);
				personList.add(person);//�����ĵõ���loginId,pwd,nickName��װ��һ��Person�࣬��person����personList
				saveDataToFile();
			
				pw.println("operate:registResult:success");//����("operate:registResult:success"���ͻ���
				pw.flush();
			}else if("login".equals(operate)){//�����һ��Ϊlogin,�����������ǵ�¼��Ϣ
				String loginIdStr=msgArr[1];
				String pwdStr=msgArr[2];
				String loginId=loginIdStr.split(":")[1];
				String pwd=pwdStr.split(":")[1];
				
				Person person=getPerson(loginId,pwd);
				StringBuilder strBuilder=new StringBuilder("operate:loginResult:");
				if(person==null){
					//�����¼ʧ�ܣ�����Person����û�ҵ��û���Ϣ����"operate:loginResult:"�������fail
					strBuilder.append("fail");//��Ϊ"operate:loginResult:fail"
				}else{
					//��¼�ɹ�
					strBuilder.append("success").append("___")
					.append(person.toString());	//��Ϊ"operate:loginResult:succesd___loginId+":::"+pwd+":::	"+nickName"								
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
				System.out.println("�������,����������!");
			}else if(!loginId.equals(person.getLoginId())&&pwd.equals(person.getPwd())){
				System.out.println("�˺Ų���ȷ,����������!");
			}
		}
		return null;
	}
	//�������ݵ��ļ�
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
	//��������	
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

