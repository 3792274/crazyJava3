package chapter14_04_����ʱ����Annotation;



/**
 * Description:14.4 ����ʱ����Annotation,
 * <br>����ʱ��Ҫָ��������javac -processor HibernateAnnotationProcessor Person.java
 * <br>ִ���Ժ󣬽�����Person.hbm.xml�ļ���
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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

	//�޲����Ĺ�����
	public Person()
	{
	}
	//��ʼ��ȫ����Ա�����Ĺ�����
	public Person(int id , String name , int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// ����ʡ�����г�Ա������setter��getter����

	//id��setter��getter����
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	//name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//age��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

}