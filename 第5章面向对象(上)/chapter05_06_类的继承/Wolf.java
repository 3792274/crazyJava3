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
class Creature
{
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal extends Creature
{
	public Animal(String name)
	{
		System.out.println("Animal��һ�������Ĺ�������"
			+ "�ö����nameΪ" + name);
	}
	public Animal(String name , int age)
	{
		// ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�����������Ĺ�������"
			+ "��ageΪ" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{
		// ��ʽ���ø��������������Ĺ�����
		super("��̫��", 3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args)
	{
		new Wolf();
	}
}

