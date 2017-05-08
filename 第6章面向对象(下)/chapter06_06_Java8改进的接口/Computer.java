package chapter06_06_Java8改进的接口;
 
/**
 * Description:简单工厂模式
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

//computer类完全与print类分离
public class Computer
{
	//组合一个out对象更好。面向接口编程
	private Output out;
	
	public Computer(Output out)
	{
		this.out = out;
	}
	
	// 定义一个模拟获取字符串输入的方法
	public void keyIn(String msg)
	{
		out.putData(msg);
	}
	// 定义一个模拟打印的方法
	public void print()
	{
		out.out();
	}
}
