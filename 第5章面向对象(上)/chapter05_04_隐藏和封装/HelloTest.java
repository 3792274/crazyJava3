package chapter05_04_隐藏和封装;


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

public class HelloTest
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		// 使用类全名的写法
		 Apple a = new  Apple();
		// 如果使用import语句来导入Apple类后，就可以不再使用类全名
		Apple aa = new Apple();
	}
}

