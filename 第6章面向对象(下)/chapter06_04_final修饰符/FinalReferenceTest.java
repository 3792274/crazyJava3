package chapter06_04_final���η�;


import java.util.*;
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
class Person01
{
	private int age;
	public Person01(){}
	// �в����Ĺ�����
	public Person01(int age)
	{
		this.age = age;
	}
	// ʡ��age��setter��getter����
	// age��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}
public class FinalReferenceTest
{
	public static void main(String[] args)
	{
		// final�������������iArr��һ�����ñ���
		final int[] iArr = {5, 6, 12, 9};
		System.out.println(Arrays.toString(iArr));
		// ������Ԫ�ؽ������򣬺Ϸ�
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		// ������Ԫ�ظ�ֵ���Ϸ�
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		// ��������iArr���¸�ֵ���Ƿ�
		// iArr = null;
		// final����Person������p��һ�����ñ���
		final Person01 p = new Person01(45);
		// �ı�Person�����ageʵ���������Ϸ�
		p.setAge(23);
		System.out.println(p.getAge());
		// ��������p���¸�ֵ���Ƿ�
		// p = null;
	}
}