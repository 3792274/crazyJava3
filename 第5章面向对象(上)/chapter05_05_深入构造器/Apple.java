package chapter05_05_���빹����;



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
public class Apple
{
	public String name;
	public String color;
	public double weight;
	public Apple(){}
	// ���������Ĺ�����
	public Apple(String name , String color)
	{
		this.name = name;
		this.color = color;
	}
	// ���������Ĺ�����
	public Apple(String name , String color , double weight)
	{
		// ͨ��this������һ�����صĹ������ĳ�ʼ������
		this(name , color);
		// ����this���øù��������ڳ�ʼ����Java����
		this.weight = weight;
	}
}
