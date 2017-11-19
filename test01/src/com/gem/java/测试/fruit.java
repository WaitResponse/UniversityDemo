package com.gem.java.测试;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  fruit {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();		
		System.out.println(date);//默认类型的时间格式
		
		//1.Date->String
		SimpleDateFormat saf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now=saf.format(date);
		System.out.println(now);
		
		
		//2.String->Date
		String dateStr="2017-08-07 13:10:58";
		Date date2=saf.parse(dateStr);
		System.out.println(date2);
		
		//3.java.util.Date->java.sql.Date
		java.sql.Date date3=new java.sql.Date(date.getTime());
		System.out.println(date3);//将系统时间转换成年月日格式
	}
}
