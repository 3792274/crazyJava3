package chapter06_07_�ڲ���;

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
public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp()
	{
		// System.out.println(prop1);
		// ���������ִ���Ӧ��Ϊ������ʽ��
		// ͨ���������ʾ�̬�ڲ�������Ա
		System.out.println(StaticInnerClass.prop1);
		// System.out.println(prop2);
		// ���������ִ���Ӧ��Ϊ������ʽ��
		// ͨ��ʵ�����ʾ�̬�ڲ����ʵ����Ա
		System.out.println(new StaticInnerClass().prop2);
	}
}

