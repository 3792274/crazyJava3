package chapter07_03_常用类;


/**
 * Description:克隆一个类，protect 只能被子类重写或者调用<br />
 * 1.自定义类实现Cloneable接口，标记接口，可以实现“自我克隆”，空方法<br />
 * 2.自定义类实现自己的clone()方法<br />
 * 3.实现clone方法，通过调用super.clone()<br />
 * 4.速度比copy快，浅克隆。<br>
 * 
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

class Address
{
	String detail;
	
	public Address(String detail)
	{
		this.detail = detail;
	}
}


// 实现Cloneable接口
class User implements Cloneable
{
	int age;
	Address address;
	
	public User(int age)
	{
		this.age = age;
		address = new Address("广州天河");
	}
	
	// 通过调用super.clone()来实现clone()方法
	@Override
	public User clone()
		throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}



public class CloneTest01
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		User u1 = new User(29);
		
		// clone得到u1对象的副本。
		User u2 = u1.clone();
		
		// 判断u1、u2是否相同
		System.out.println(u1 == u2);      //① false
		
		// 判断u1、u2的address是否相同
		System.out.println(u1.address == u2.address);     //②true
	}
}
