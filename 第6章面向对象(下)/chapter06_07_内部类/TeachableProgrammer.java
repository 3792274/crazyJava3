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
public class TeachableProgrammer extends Programmer
{
	public TeachableProgrammer(){}
	public TeachableProgrammer(String name)
	{
		super(name);
	}
	//��ѧ������Ȼ��TeachableProgrammer�ඨ��
	private void teach()
	{
		System.out.println(getName() + "��ʦ�ڽ�̨�Ͻ���...");
	}
	private class Closure implements Teachable
	{
		/*
		�Ǿ�̬�ڲ���ص��ⲿ��ʵ��work�������Ǿ�̬�ڲ������õ����ý�����
		��ͻ����ṩһ���ص��ⲿ���;��
		*/
		public void work()
		{
			teach();
		}
	}
	//����һ���Ǿ�̬�ڲ������ã������ⲿ��ͨ���÷Ǿ�̬�ڲ����������ص��ⲿ��ķ���
	public Teachable getCallbackReference()
	{
		return new Closure();
	}
}
