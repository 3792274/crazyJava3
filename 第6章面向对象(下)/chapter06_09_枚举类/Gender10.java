package chapter06_09_枚举类;


/**
 * Description:枚举类实现接口
 * 非抽象枚举类默认才有final修饰
 * 
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public enum Gender10 implements GenderDesc09
{
	// 此处的枚举值必须调用对应构造器来创建，是Gender10的匿名子类，abstract修饰的，非final
	MALE("男")
	// 花括号部分实际上是一个类体部分
	{
		public void info()
		{
			System.out.println("这个枚举值代表男性");
		}
	},
	
	
	//是Gender10的匿名子类，abstract修饰的，非final
	FEMALE("女") 
	{
		public void info()
		{
			System.out.println("这个枚举值代表女性");
		}
	};
	
	
	// 其他部分与codes\06\6.9\best\Gender09.java中的Gender类完全相同
	private final String name;

	
	// 枚举类的构造器只能使用private修饰
	private Gender10(String name)
	{
		this.name = name;
	
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	// 增加下面的info()方法，实现GenderDesc接口必须实现的方法
	public void info()
	{
		System.out.println( "这是一个用于用于定义性别的枚举类");
	}
}
