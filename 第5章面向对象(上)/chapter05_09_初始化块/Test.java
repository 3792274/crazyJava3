package chapter05_09_��ʼ����;



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
class Root
{
	static{
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root()
	{
		System.out.println("Root���޲����Ĺ�����");
	}
}
class Mid extends Root
{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid()
	{
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg)
	{
		// ͨ��this����ͬһ�������صĹ�����
		this();
		System.out.println("Mid�Ĵ������������������ֵ��"
			+ msg);
	}
}
class Leaf extends Mid
{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	public Leaf()
	{
		// ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("���Java����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
public class Test
{
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}

