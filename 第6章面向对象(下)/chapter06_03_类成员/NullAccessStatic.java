package chapter06_03_���Ա;



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
public class NullAccessStatic
{
	private static void test()
	{
		System.out.println("static���ε��෽��");
	}
	public static void main(String[] args)
	{
		// ����һ��NullAccessStatic��������ֵΪnull
		NullAccessStatic nas = null;
		// ʹ��null�������������ľ�̬����
		nas.test();
	}
}
