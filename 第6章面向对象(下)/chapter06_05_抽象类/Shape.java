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
public abstract class Shape
{
	{
		System.out.println("ִ��Shape�ĳ�ʼ����...");
	}
	private String color;
	// ����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	// ����һ��������״�ĳ��󷽷�
	public abstract String getType();
	// ����Shape�Ĺ��������ù��������������ڴ���Shape����
	// �������ڱ��������
	public Shape(){}
	public Shape(String color)
	{
		System.out.println("ִ��Shape�Ĺ�����...");
		this.color = color;
	}
	// ʡ��color��setter��getter����
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
}

