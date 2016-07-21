package chapter18_03_ͨ������鿴����Ϣ;

import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
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
// ������ظ�ע��
@Repeatable(Annos.class)
@interface Anno {}
@Retention(value=RetentionPolicy.RUNTIME)
@interface Annos {
    Anno[] value();
}
// ʹ��4��ע�����θ���
@SuppressWarnings(value="unchecked")
@Deprecated
// ʹ���ظ�ע�����θ���
@Anno
@Anno
public class ClassTest
{
	// Ϊ���ඨ��һ��˽�еĹ�����
	private ClassTest()
	{
	}
	// ����һ���в����Ĺ�����
	public ClassTest(String name)
	{
		System.out.println("ִ���в����Ĺ�����");
	}
	// ����һ���޲�����info����
	public void info()
	{
		System.out.println("ִ���޲�����info����");
	}
	// ����һ���в�����info����
	public void info(String str)
	{
		System.out.println("ִ���в�����info����"
			+ "����str����ֵ��" + str);
	}
	// ����һ�������õ��ڲ���
	class Inner
	{
	}
	public static void main(String[] args)
		throws Exception
	{
		// ���������Ի�ȡClassTest��Ӧ��Class
		Class<ClassTest> clazz = ClassTest.class;
		// ��ȡ��Class��������Ӧ���ȫ��������
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest��ȫ�����������£�");
		for (Constructor c : ctors)
		{
			System.out.println(c);
		}
		// ��ȡ��Class��������Ӧ���ȫ��public������
		Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest��ȫ��public���������£�");
		for (Constructor c : publicCtors)
		{
			System.out.println(c);
		}
		// ��ȡ��Class��������Ӧ���ȫ��public����
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest��ȫ��public�������£�");
		for (Method md : mtds)
		{
			System.out.println(md);
		}
		// ��ȡ��Class��������Ӧ���ָ������
		System.out.println("ClassTest���һ���ַ���������info()����Ϊ��"
			+ clazz.getMethod("info" , String.class));
		// ��ȡ��Class��������Ӧ����ϵ�ȫ��ע��
		Annotation[] anns = clazz.getAnnotations();
		System.out.println("ClassTest��ȫ��Annotation���£�");
		for (Annotation an : anns)
		{
			System.out.println(an);
		}
		System.out.println("��ClassԪ���ϵ�@SuppressWarningsע��Ϊ��"
			+ Arrays.toString(clazz.getAnnotationsByType(SuppressWarnings.class)));
		System.out.println("��ClassԪ���ϵ�@Annoע��Ϊ��"
			+ Arrays.toString(clazz.getAnnotationsByType(Anno.class)));
		// ��ȡ��Class��������Ӧ���ȫ���ڲ���
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest��ȫ���ڲ������£�");
		for (Class c : inners)
		{
			System.out.println(c);
		}
		// ʹ��Class.forName��������ClassTest��Inner�ڲ���
		Class inClazz = Class.forName("ClassTest$Inner");
		// ͨ��getDeclaringClass()���ʸ������ڵ��ⲿ��
		System.out.println("inClazz��Ӧ����ⲿ��Ϊ��" +
			inClazz.getDeclaringClass());
		System.out.println("ClassTest�İ�Ϊ��" + clazz.getPackage());
		System.out.println("ClassTest�ĸ���Ϊ��" + clazz.getSuperclass());
	}
}

