package chapter06_10_对象与垃圾回收;

import java.lang.ref.*;

/**
 * Description:示范弱引用被垃圾回收的过程 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ReferenceTest04 {
	public static void main(String[] args) throws Exception {
		
		// 创建一个字符串对象，定义字符串String str="疯狂Java讲义"，则是强引用，会放入字符串池，并不会回收。
		String str = new String("疯狂Java讲义");
		
		// 创建一个弱引用，让此弱引用引用到"疯狂Java讲义"字符串，和str一样引用到该对象，
		WeakReference wr = new WeakReference(str); // ①
		
		// 切断str引用和"疯狂Java讲义"字符串之间的引用
		str = null; // ②
		
		// 取出弱引用所引用的对象
		System.out.println(wr.get()); // ③ 弱引用会保留该字符串
		
		// 强制垃圾回收
		System.gc();
		System.runFinalization();
		
		// 再次取出弱引用所引用的对象
		System.out.println(wr.get()); // ④
	}
}
