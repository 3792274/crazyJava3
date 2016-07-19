package chapter06_01_Java8��ǿ�İ�װ��;

/**
 * Description:�����������ͺ��ַ���֮����໥ת��
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Primitive2String
{
	public static void main(String[] args)
	{
		String intStr = "123";
		// ��һ���ض��ַ���ת����int����
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it2);
		
		String floatStr = "4.56";
		// ��һ���ض��ַ���ת����float����
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);
		
		// ��һ��float����ת����String����
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		
		// ��һ��double����ת����String����
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		
		// ��һ��boolean����ת����String����
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
