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
abstract class Device
{
	private String name;
	public abstract double getPrice();
	public Device(){}
	public Device(String name)
	{
		this.name = name;
	}
	// �˴�ʡ����name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
public class AnonymousInner
{
	public void test(Device d)
	{
		System.out.println("������һ��" + d.getName()
			+ "��������" + d.getPrice());
	}
	public static void main(String[] args)
	{
		AnonymousInner ai = new AnonymousInner();
		// �����в����Ĺ���������Device����ʵ����Ķ���
		ai.test(new Device("����ʾ����")
		{
			public double getPrice()
			{
				return 67.8;
			}
		});
		// �����޲����Ĺ���������Device����ʵ����Ķ���
		Device d = new Device()
		{
			// ��ʼ����
			{
				System.out.println("�����ڲ���ĳ�ʼ����...");
			}
			// ʵ�ֳ��󷽷�
			public double getPrice()
			{
				return 56.2;
			}
			// ��д�����ʵ������
			public String getName()
			{
				return "����";
			}
		};
		ai.test(d);
	}
}