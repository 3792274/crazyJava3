package chapter06_02_处理对象;

/**
 * Description:基本类型对比值，引用类型必须存在继承关系才能比，对比队形引用是否是同一个对象 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class EqualTest {
	public static void main(String[] args) {
		int it = 65;
		float fl = 65.0f;
		// 将输出true
		System.out.println("65和65.0f是否相等？" + (it == fl));
		char ch = 'A';
		// 将输出true
		System.out.println("65和'A'是否相等？" + (it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		// 将输出false
		System.out.println("str1和str2是否相等？" + (str1 == str2));
		// 将输出true
		System.out.println("str1是否equals str2？" + (str1.equals(str2)));
		// 由于java.lang.String与EqualTest类没有继承关系，

		// 所以下面语句导致编译错误,不同类型不能对比
		// System.out.println("hello" == new EqualTest());

		Integer ii = it;
		Integer iii =65 ;
		Float ff = fl;
		System.out.println(ii + ":" + ff + ":" + ii.equals(ff));
		System.out.println(iii==ii);
	}
}
