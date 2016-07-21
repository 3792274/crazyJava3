package chapter18_05_使用反射生成JDK动态代理.DynaProxy;


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
public class GunDog implements Dog
{
	// 实现info()方法，仅仅打印一个字符串
	public void info()
	{
		System.out.println("我是一只猎狗");
	}
	// 实现run()方法，仅仅打印一个字符串
	public void run()
	{
		System.out.println("我奔跑迅速");
	}
}

