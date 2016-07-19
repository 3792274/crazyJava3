package chapter06_04_final���η�;



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
class Name
{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// ʡ��firstName��lastName��setter��getter����
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
}
public class Person
{
	private final Name name;
	public Person(Name name)
	{
		this.name = name;
	}
	public Name getName()
	{
		return name;
	}
	public static void main(String[] args)
	{
		Name n = new Name("���", "��");
		Person p = new Person(n);
		// Person�����name��firstNameֵΪ"���"
		System.out.println(p.getName().getFirstName());
		// �ı�Person����name��firstNameֵ
		n.setFirstName("�˽�");
		// Person�����name��firstNameֵ����Ϊ"�˽�"
		System.out.println(p.getName().getFirstName());
	}
}
