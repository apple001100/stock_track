package com.freedom.utils;

import org.joda.time.DateTime;


/*
 * 
 * 使用Joda-Time操作时间
 * https://www.ibm.com/developerworks/cn/java/j-jodatime.html
 */
public class Test {
	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		System.out.println(dateTime.plusDays(1).toString("yyyy-MM-dd HH:mm:ss.SSS"));
	}
}
