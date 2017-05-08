package chapter06_07_内部类;

/**
 * Description:不允许在非静态内部类中定义静态成员，单可以包含初始化块。
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class InnerNoStatic
{
	private class InnerClass
	{
		/*
		下面三个静态声明都将引发如下编译错误:
		非静态内部类不能有静态声明
		*/
		
//		static
//		{
//			System.out.println("==========");
//		}
//		private static int inProp;
//		private static void test(){}
	}
	
	
}
