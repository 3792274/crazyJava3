package chapter05_03_成员变量和局部变量;



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
public class ScopeTest1
{
	// 定义一个类成员变量作为循环变量
	static int i;
	public static void main(String[] args)
	{
		for ( i = 0 ; i < 10 ; i++)
		{
			System.out.println("Hello");
		}
	}
}
