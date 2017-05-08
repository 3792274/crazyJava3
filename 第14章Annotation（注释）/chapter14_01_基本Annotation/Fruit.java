package chapter14_01_基本Annotation;



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
public class Fruit
{
	public void info()
	{
		System.out.println("水果的info方法...");
	}
}
class Apple01 extends Fruit
{
	// 使用@Override指定下面方法必须重写父类方法
	@Override
	public void info()
	{
		System.out.println("苹果重写水果的info方法...");
	}
}
