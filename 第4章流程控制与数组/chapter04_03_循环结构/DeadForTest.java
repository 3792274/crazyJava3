package chapter04_03_循环结构;

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
public class DeadForTest
{
	public static void main(String[] args)
	{
		// 省略了for循环三个部分，循环条件将一直为true
		for (; ; )
		{
			System.out.println("=============");
		}
	}
}
