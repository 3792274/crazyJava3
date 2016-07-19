package chapter05_06_��ļ̳�;



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
class BaseClass
{
	public int a = 5;
}
public class SubClass extends BaseClass
{
	public int a = 7;
	public void accessOwner()
	{
		System.out.println(a);
	}
	public void accessBase()
	{
		// ͨ��super���޶����ʴӸ���̳еõ���aʵ������
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		SubClass sc = new SubClass();
		sc.accessOwner(); // ���7
		sc.accessBase(); // ���5
	}
}
