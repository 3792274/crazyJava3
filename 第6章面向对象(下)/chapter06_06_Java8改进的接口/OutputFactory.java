package chapter06_06_Java8�Ľ��Ľӿ�;

 

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

//computer����ȫ��print���룬 Ҳ�����𴴽�output����	
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
		
		c.keyIn("������Java EE��ҵӦ��ʵս");
		c.keyIn("���Java����");
		c.print();
	}
}
