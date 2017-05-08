package chapter06_09_枚举类;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SeasonTest01 {
	
	 
	public SeasonTest01(Season01 s) {
		System.out.println(s.getName() + "，这真是一个" + s.getDesc() + "的季节");
	}

	
	
	public static void main(String[] args) {
		// 直接使用Season的FALL常量代表一个Season对象
		
		
		new SeasonTest01(Season01.FALL);
	}
}
