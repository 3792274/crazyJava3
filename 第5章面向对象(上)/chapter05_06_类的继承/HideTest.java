package chapter05_06_��ļ̳�;



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
class Parent
{
	public String tag = "���Java����";         //��
}
class Derived extends Parent
{
	// ����һ��˽�е�tagʵ�����������ظ����tagʵ������
	private String tag = "������Java EE��ҵӦ��ʵս";         //��
}
public class HideTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		// ���򲻿ɷ���d��˽�б���tag������������佫����������
		// System.out.println(d.tag);         //��
		// ��d������ʽ������ת��ΪParent�󣬼��ɷ���tagʵ������
		// ��������������Java���塱
		System.out.println(((Parent)d).tag);         //��
	}
}
