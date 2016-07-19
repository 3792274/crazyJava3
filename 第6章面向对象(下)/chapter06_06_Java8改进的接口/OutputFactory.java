package chapter06_06_Java8改进的接口;

 

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

//computer类完全与print分离， 也不负责创建output对象	
public class OutputFactory
{
	public Output getOutput()
	{
//		return new Printer();
		return new BetterPrinter();
	}
	public static void main(String[] args)
	{
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		
		c.keyIn("轻量级Java EE企业应用实战");
		c.keyIn("疯狂Java讲义");
		c.print();
	}
}
