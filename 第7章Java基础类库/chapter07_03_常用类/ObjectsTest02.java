package chapter07_03_常用类;

import java.util.Objects;

/**
 * Description:java7新增的方法，空指针安全的 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ObjectsTest02 {
	// 定义一个obj变量，它的默认值是null
	static ObjectsTest02 obj;

	public static void main(String[] args) {
		// 输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));
		// 输出一个null对象的toString，输出null
		System.out.println(Objects.toString(obj));
		// 要求obj不能为null，如果obj为null则引发异常
		System.out.println(Objects.requireNonNull(obj, "obj参数不能是null！"));
	}
}
