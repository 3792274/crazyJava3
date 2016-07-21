package chapter18_03_ͨ������鿴����Ϣ;

import java.lang.reflect.*;
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
class Test
{
	public void replace(String str, List<String> list){}
}
public class MethodParameterTest
{
	public static void main(String[] args)throws Exception
	{
		// ��ȡString����
		Class<Test> clazz = Test.class;
		// ��ȡString��Ĵ�����������replace()����
		Method replace = clazz.getMethod("replace"
			, String.class, List.class);
		// ��ȡָ�������Ĳ�������
		System.out.println("replace��������������" + replace.getParameterCount());
		// ��ȡreplace�����в�����Ϣ
		Parameter[] parameters = replace.getParameters();
		int index = 1;
		// �������в���
		for (Parameter p : parameters)
		{
			if (p.isNamePresent())
			{
				System.out.println("---��" + index++ + "��������Ϣ---");
				System.out.println("��������" + p.getName());
				System.out.println("�β����ͣ�" + p.getType());
				System.out.println("�������ͣ�" + p.getParameterizedType());
			}
		}
	}
}
