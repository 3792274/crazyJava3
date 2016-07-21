package chapter18_06_����ͷ���;

import java.util.*;
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
public class GenericTest
{
	private Map<String , Integer> score;
	public static void main(String[] args)
		throws Exception
	{
		Class<GenericTest> clazz = GenericTest.class;
		Field f = clazz.getDeclaredField("score");
		// ֱ��ʹ��getType()ȡ��������ֻ����ͨ���͵ĳ�Ա������Ч
		Class<?> a = f.getType();
		// ���潫���������java.util.Map
		System.out.println("score��������:" + a);
		// ��ó�Ա����f�ķ�������
		Type gType = f.getGenericType();
		// ���gType������ParameterizedType����
		if(gType instanceof ParameterizedType)
		{
			// ǿ������ת��
			ParameterizedType pType = (ParameterizedType)gType;
			// ��ȡԭʼ����
			Type rType = pType.getRawType();
			System.out.println("ԭʼ�����ǣ�" + rType);
			// ȡ�÷������͵ķ��Ͳ���
			Type[] tArgs = pType.getActualTypeArguments();
			System.out.println("������Ϣ��:");
			for (int i = 0; i < tArgs.length; i++)
			{
				System.out.println("��" + i + "�����������ǣ�" + tArgs[i]);
			}
		}
		else
		{
			System.out.println("��ȡ�������ͳ���");
		}
	}
}
