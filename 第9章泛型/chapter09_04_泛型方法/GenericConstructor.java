package chapter09_04_���ͷ���;



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

class Foo
{
	public <T> Foo(T t)
	{
		System.out.println(t);
	}
}


public class GenericConstructor
{
	public static void main(String[] args)
	{
		// ���͹������е�T����ΪString��
		new Foo("���Java����");
		
		// ���͹������е�T����ΪInteger��
		new Foo(200);
		
		// ��ʽָ�����͹������е�T����ΪString��
		// ����Foo��������ʵ��Ҳ��String������ȫ��ȷ��
		new <String> Foo("���Android����");
	
		// ��ʽָ�����͹������е�T����ΪString��
		// ������Foo��������ʵ����Double��������������
//		new <String> Foo(12.3);
	}
}
