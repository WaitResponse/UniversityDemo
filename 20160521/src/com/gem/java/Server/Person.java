package com.gem.java.Server;

public class Person {
	private String loginId;
	private String pwd;
	private String nickName;
	
	public Person(String loginId, String pwd) {
		super();
		this.loginId = loginId;
		this.pwd = pwd;
	}
	public Person(String loginId, String pwd, String nickName) {
		
		this(loginId,pwd);
		this.nickName = nickName;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return loginId+":::"+pwd+":::"+nickName;
				
	}
	
	
	
	
}
