package chapter06_05_������;



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
public class Triangle extends Shape
{
	// ���������ε�����
	private double a;
	private double b;
	private double c;
	public Triangle(String color , double a
		, double b , double c)
	{
		super(color);
		this.setSides(a , b , c);
	}
	public void setSides(double a , double b , double c)
	{
		if (a >= b + c || b >= a + c || c >= a + b)
		{
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// ��дShape��ĵļ����ܳ��ĳ��󷽷�
	public double calPerimeter()
	{
		return a + b + c;
	}
	// ��дShape��ĵķ�����״�ĳ��󷽷�
	public String getType()
	{
		return "������";
	}
}
