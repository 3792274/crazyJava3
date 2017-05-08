package chapter06_10_对象与垃圾回收;

import java.lang.ref.*;

/**
 * Description:虚引用引用字符串
 * 
 * <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class PhantomReferenceTest05 {
	public static void main(String[] args) throws Exception {
		
		// 创建一个字符串对象
		String str = new String("疯狂Java讲义");
		
		// 创建一个引用队列
		ReferenceQueue rq = new ReferenceQueue();
		
		// 创建一个虚引用，让此虚引用引用到"疯狂Java讲义"字符串，创建虚引用需要提供引用队列
		PhantomReference pr = new PhantomReference(str, rq);
		
		// 切断str引用和"疯狂Java讲义"字符串之间的引用
		str = null;
		
		// 取出虚引用所引用的对象，并不能通过虚引用获取被引用的对象，所以此处输出null
		System.out.println(pr.get()); // ①
		
		// 强制垃圾回收
		System.gc();
		System.runFinalization();
		
		// 垃圾回收之后，虚引用将被放入引用队列中
		// 取出引用队列中最先进入队列中的引用与pr进行比较  true
		System.out.println(rq.poll() == pr); // ②
	}
}
