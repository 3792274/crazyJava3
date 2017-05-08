package chapter06_01_Java8增强的包装类;

/**
 * Description:包装类型与数值类型比较，取出的是数值类型的值 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class WrapperClassCompare {
	public static void main(String[] args) {
		
		Integer a = new Integer(6);
		System.out.println("6的包装类实例是否大于5.0" + (a > 5.0));// 输出true
		System.out.println("比较2个包装类的实例是否相等：" + (new Integer(2) == new Integer(2))); // 输出false
		
		// 通过自动装箱，允许把基本类型值赋值给包装类的实例
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("两个2自动装箱后是否相等：" + (ina == inb)); // 输出true
		
		Integer biga = 128;
		Integer bigb = 128;
		System.out.println("两个128自动装箱后是否相等：" + (biga == bigb)); // 输出false,Integer源码只缓存-128 ~ 127的数。
	}
}
