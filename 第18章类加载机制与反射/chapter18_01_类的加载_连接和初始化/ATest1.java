package chapter18_01_类的加载_连接和初始化;


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
public class ATest1
{
	public static void main(String[] args)
	{
		// 创建A类的实例
		A a = new A();
		// 让a实例的类变量a的值自加
		a.a ++;
		System.out.println(a.a);
	}
}
