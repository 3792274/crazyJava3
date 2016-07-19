package chapter07_04_java8的日期时间类;

import java.util.*;

/**
 * Description: 推荐使用Calendar类，不使用Date<br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class DateTest01 {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		// 获取当前时间之后100ms的时间
		Date d2 = new Date(System.currentTimeMillis() + 100L);
		
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}
