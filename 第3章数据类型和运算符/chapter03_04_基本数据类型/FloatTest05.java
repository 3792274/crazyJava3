package chapter03_04_������������;


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
public class FloatTest05
{
	public static void main(String[] args)
	{
		float af = 5.2345556f;
		// ���潫����af��ֵ�Ѿ������˸ı�
		System.out.println(af);
		
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		// ����float��double�ĸ����������ȵġ�
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
		// 0.0����0.0�����ַ���
		System.out.println(a / a);
		
		// ��������֮���ǲ���ȵ�
		System.out.println(a / a == Float.NaN);
		
		// ���������������ȵ�
		System.out.println(6.0 / 0 == 555.0/0);
		
		// ��������0.0�õ��������
		System.out.println(-8 / a);
		
		
		// ������뽫�׳�����0���쳣
		// System.out.println(0 / 0);
	}
}
