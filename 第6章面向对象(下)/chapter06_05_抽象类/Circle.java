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
public class Circle extends Shape
{
	private double radius;
	public Circle(String color , double radius)
	{
		super(color);
		this.radius = radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	// ��дShape��ĵļ����ܳ��ĳ��󷽷�
	public double calPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	// ��дShape��ĵķ�����״�ĳ��󷽷�
	public String getType()
	{
		return getColor() + "Բ��";
	}
	public static void main(String[] args)
	{
		Shape s1 = new Triangle("��ɫ" , 3 , 4, 5);
		Shape s2 = new Circle("��ɫ" , 3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}
