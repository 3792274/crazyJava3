package chapter08_03_Set����;

import java.util.*;
/**
 * Description:HashSet �ж�����������ȵı�׼��ע�⣺equals&&hashCode��һ������
 * 1.HashSet��Hash�㷨�洢����Ԫ�أ����кܺõĴ�ȡ�Ͳ������ܡ�
 * 2.���ܱ�֤Ԫ������˳��
 * 3.����ͬ���ģ�������߳��޸�HashSet���ϣ���Ҫͨ�����뱣֤ͬ��
 * 3.����Ԫ�ؿ���Ϊnull
 * 
 * 4.���Ҫ����Ԫ�أ�Ԫ�ص�equals��hashCodeҪ��������������������
 */

// ��A��equals�������Ƿ���true����û����д��hashCode()����
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
// ��B��hashCode()�������Ƿ���1����û����д��equals()��������ʹ������ʽ����������ͬhashCode����
class B
{
	public int hashCode()
	{
		return 1;
	}
}
// ��C��hashCode()�������Ƿ���2������д��equals()�������Ƿ���true
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest1
{
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		
		// �ֱ���books�������������A��������B��������C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
	
	
	//HashSet��TreeSet��EnumSet�����̲߳���ȫ�ģ�ͨ��ͨ��Collections�������synchronizedSortedSet��������װ
	SortedSet set= Collections.synchronizedSortedSet(new TreeSet());
	
	
	
	
	
	
	
	
}
