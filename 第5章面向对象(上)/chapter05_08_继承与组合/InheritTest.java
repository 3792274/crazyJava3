package chapter05_08_继承与组合;



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
class Animal02
{
	private void beat()
	{
		System.out.println("心脏跳动...");
	}
	public void breath()
	{
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}
// 继承Animal，直接复用父类的breath()方法
class Bird02 extends Animal
{
	public void fly()
	{
		System.out.println("我在天空自在的飞翔...");
	}
}
// 继承Animal，直接复用父类的breath()方法
class Wolf02 extends Animal
{
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird02 b = new Bird02();
		b.breath();
		b.fly();
		Wolf02 w = new Wolf02();
		w.breath();
		w.run();
	}
}
