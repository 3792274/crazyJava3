package chapter18_02_类加载器;


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
public class Hello
{
	public static void main(String[] args)
	{
		for (String arg : args)
		{
			System.out.println("运行Hello的参数：" + arg);
		}
	}
}
