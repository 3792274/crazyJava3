package chapter05_08_�̳������;



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
class Base
{
	public Base()
	{
		test();
	}
	public void test()           // �ٺ�test()����
	{
		System.out.println("����������д�ķ���");
	}
}
public class Sub extends Base
{
	private String name;
	public void test()         // �ں�test()����
	{
		System.out.println("������д����ķ�����"
			+ "��name�ַ�������" + name.length());
	}
	public static void main(String[] args)
	{
		// ��������������ָ���쳣
		Sub s = new Sub();
	}
}
