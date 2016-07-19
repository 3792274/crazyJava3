package chapter14_04_编译时处理Annotation;



/**
 * Description:14.4 编译时处理Annotation,
 * <br>编译时需要指定参数：javac -processor HibernateAnnotationProcessor Person.java
 * <br>执行以后，将生成Person.hbm.xml文件。
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Persistent(table="person_inf")
public class Person
{
	@Id(column="person_id",type="integer",generator="identity")
	private int id;
	@Property(column="person_name",type="string")
	private String name;
	@Property(column="person_age",type="integer")
	private int age;

	//无参数的构造器
	public Person()
	{
	}
	//初始化全部成员变量的构造器
	public Person(int id , String name , int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// 下面省略所有成员变量的setter和getter方法

	//id的setter和getter方法
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	//name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//age的setter和getter方法
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

}