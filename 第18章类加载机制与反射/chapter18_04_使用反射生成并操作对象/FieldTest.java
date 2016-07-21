package chapter18_04_ʹ�÷������ɲ���������;

import java.lang.reflect.*;
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
class Person
{
	private String name;
	private int age;
	public String toString()
	{
		return "Person[name:" + name +
		" , age:" + age + " ]";
	}
}
public class FieldTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ����һ��Person����
		Person p = new Person();
		// ��ȡPerson���Ӧ��Class����
		Class<Person> personClazz = Person.class;
		// ��ȡPerson����Ϊname�ĳ�Ա����
		// ʹ��getDeclaredField()���������ɻ�ȡ���ַ��ʿ��Ʒ��ĳ�Ա����
		Field nameField = personClazz.getDeclaredField("name");
		// ����ͨ��������ʸó�Ա����ʱȡ������Ȩ�޼��
		nameField.setAccessible(true);
		// ����set()����Ϊp�����name��Ա��������ֵ
		nameField.set(p , "Yeeku.H.Lee");
		// ��ȡPerson����Ϊage�ĳ�Ա����
		Field ageField = personClazz.getDeclaredField("age");
		// ����ͨ��������ʸó�Ա����ʱȡ������Ȩ�޼��
		ageField.setAccessible(true);
		// ����setInt()����Ϊp�����age��Ա��������ֵ
		ageField.setInt(p , 30);
		System.out.println(p);
	}
}
