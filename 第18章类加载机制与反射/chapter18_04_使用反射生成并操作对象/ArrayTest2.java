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
public class ArrayTest2
{
	public static void main(String args[])
	{
		/*
		  ����һ����ά���顣
		  ����ǰ���������ʱ���ģ���ά����Ҳ��һά���飬
		  ������Ԫ���Ƕ�ά�����һά���飬
		  ��˿�����Ϊarr�ǳ���Ϊ3��һά����
		*/
		Object arr = Array.newInstance(String.class, 3, 4, 10);
		// ��ȡarr������indexΪ2��Ԫ�أ���Ԫ��Ӧ���Ƕ�ά����
		Object arrObj = Array.get(arr, 2);
		// ʹ��ArrayΪ��ά���������Ԫ�ظ�ֵ����ά���������Ԫ����һά���飬
		// ���Դ���Array��set()�����ĵ�����������һά���顣
		Array.set(arrObj , 2 , new String[]
		{
			"���Java����",
			"������Java EE��ҵӦ��ʵս"
		});
		// ��ȡarrObj������indexΪ3��Ԫ�أ���Ԫ��Ӧ����һά���顣
		Object anArr  = Array.get(arrObj, 3);
		Array.set(anArr , 8  , "���Android����");
		// ��arrǿ������ת��Ϊ��ά����
		String[][][] cast = (String[][][])arr;
		// ��ȡcast��ά������ָ��Ԫ�ص�ֵ
		System.out.println(cast[2][3][8]);
		System.out.println(cast[2][2][0]);
		System.out.println(cast[2][2][1]);
	}
}

