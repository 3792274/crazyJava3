package chapter06_09_枚举类;


/**
 * Description:枚举类实现 plus,minus,times,divide
 * 
 * 
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
	
	
	
	
	// 为枚举类定义一个抽象方法
	// 这个抽象方法由不同的枚举值提供不同的实现
	public abstract double eval(double x, double y);
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(Operation11.PLUS.eval(3, 4));
		System.out.println(Operation11.MINUS.eval(5, 4));
		System.out.println(Operation11.TIMES.eval(5, 4));
		System.out.println(Operation11.DIVIDE.eval(5, 4));
	}
}

