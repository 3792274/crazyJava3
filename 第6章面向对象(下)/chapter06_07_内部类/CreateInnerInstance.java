package chapter06_07_�ڲ���;



/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Out
{
	// ����һ���ڲ��࣬��ʹ�÷��ʿ��Ʒ���
	// ��ֻ��ͬһ������������ɷ��ʸ��ڲ���
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}
public class CreateInnerInstance
{
	public static void main(String[] args)
	{
		Out.In in = new Out().new In("������Ϣ");
		/*
		�������ɸ�Ϊ�������д��룺
		ʹ��OutterClass.InnerClass����ʽ�����ڲ������
		Out.In in;
		�����ⲿ��ʵ�����Ǿ�̬�ڲ���ʵ�����Ĵ��ڸ�ʵ����
		Out out = new Out();
		ͨ���ⲿ��ʵ����new�������ڲ��๹���������Ǿ�̬�ڲ���ʵ��
		in = out.new In("������Ϣ");
		*/
	}
}
