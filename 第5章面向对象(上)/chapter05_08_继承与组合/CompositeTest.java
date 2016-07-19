package chapter05_08_�̳������;



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
class Animal
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
class Bird
{
	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	// ���¶���һ���Լ���breath()����
	public void breath()
	{
		// ֱ�Ӹ���Animal�ṩ��breath()������ʵ��Bird��breath()������
		a.breath();
	}
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
class Wolf
{
	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	// ���¶���һ���Լ���breath()����
	public void breath()
	{
		// ֱ�Ӹ���Animal�ṩ��breath()������ʵ��Wolf��breath()������
		a.breath();
	}
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		// ��ʱ��Ҫ��ʽ��������ϵĶ���
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		// ��ʱ��Ҫ��ʽ��������ϵĶ���
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}
