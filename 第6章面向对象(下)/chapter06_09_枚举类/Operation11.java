package chapter06_09_ö����;


/**
 * Description:ö����ʵ�� plus,minus,times,divide
 * 
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public enum Operation11
{
	PLUS
	{
		@Override
		public double eval(double x , double y)
		{
			return x + y;
		}
	},
	
	
	MINUS
	{
		@Override
		public double eval(double x , double y)
		{
			return x - y;
		}
	},
	
	
	TIMES
	{
		@Override
		public double eval(double x , double y)
		{
			return x * y;
		}
	},
	
	
	DIVIDE
	{
		@Override
		public double eval(double x , double y)
		{
			return x / y;
		}
	};
	
	
	
	
	// Ϊö���ඨ��һ�����󷽷�
	// ������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	public abstract double eval(double x, double y);
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(Operation11.PLUS.eval(3, 4));
		System.out.println(Operation11.MINUS.eval(5, 4));
		System.out.println(Operation11.TIMES.eval(5, 4));
		System.out.println(Operation11.DIVIDE.eval(5, 4));
	}
}

