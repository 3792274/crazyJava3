package chapter09_02_深入泛型;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class R<T>
{
	// 下面代码错误，不能在静态变量声明中使用类型形参
//	static T info;
	T age;
	public void foo(T msg){}
	// 下面代码错误，不能在静态方法声明中使用类型形参
//	public static void bar(T msg){}

	
	
		//系统中不存在真正生成泛型类，所以instancesof运算符后不能使用泛型，以下代码为错误
//		java.util.Collection<String> cs=new java.util.ArrayList<>();
//		if(cs instances of java.util.ArrayList<String>)	{...}
}

















