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
interface Teachable
{
	void work();
}
public class Programmer
{
	private String name;
	//Programmer�������������
	public Programmer(){}
	public Programmer(String name)
	{
		this.name = name;
	}
	//�˴�ʡ����name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void work()
	{
		System.out.println(name + "�ڵ��������ü���...");
	}
}