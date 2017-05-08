package chapter04_04_控制循环结构;

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
public class BreakTest2
{
	public static void main(String[] args)
	{
		// 外层循环，outer作为标识符
		outer:
		for (int i = 0 ; i < 5 ; i++ )
		{
			// 内层循环
			for (int j = 0; j < 3 ; j++ )
			{
				System.out.println("i的值为:" + i + "  j的值为:" + j);
				if (j == 1)
				{
					// 跳出outer标签所标识的循环。
					break outer;
				}
			}
		}
	}
}
