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
public class ForTest
{
	public static void main(String[] args)
	{
		// 循环的初始化条件,循环条件，循环迭代语句都在下面一行,顺序为，先执行初始化只1次，然后判断，然后方法体，然后count++
		for (int count = 0 ; count < 10 ; count++)
		{
			System.out.println(count);
		}
		System.out.println("循环结束!");
	}
}

