package chapter06_09_ö����;


/**
 * Description:ö����ʵ�ֽӿ�
 * �ǳ���ö����Ĭ�ϲ���final����
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public enum Gender10 implements GenderDesc09
{
	// �˴���ö��ֵ������ö�Ӧ����������������Gender10���������࣬abstract���εģ���final
	MALE("��")
	// �����Ų���ʵ������һ�����岿��
	{
		public void info()
		{
			System.out.println("���ö��ֵ��������");
		}
	},
	
	
	//��Gender10���������࣬abstract���εģ���final
	FEMALE("Ů") 
	{
		public void info()
		{
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	
	
	// ����������codes\06\6.9\best\Gender09.java�е�Gender����ȫ��ͬ
	private final String name;

	
	// ö����Ĺ�����ֻ��ʹ��private����
	private Gender10(String name)
	{
		this.name = name;
	
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	// ���������info()������ʵ��GenderDesc�ӿڱ���ʵ�ֵķ���
	public void info()
	{
		System.out.println( "����һ���������ڶ����Ա��ö����");
	}
}
