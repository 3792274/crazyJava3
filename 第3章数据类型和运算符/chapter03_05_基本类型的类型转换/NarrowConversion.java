package chapter03_05_�������͵�����ת��;

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
public class NarrowConversion
{
	public static void main(String[] args)
	{
		int iValue = 233;
		// ǿ�ư�һ��int���͵�ֵת��Ϊbyte���͵�ֵ
		byte bValue = (byte)iValue;
		// �����-23
		System.out.println(bValue);
		
		// ǿ�ư�һ��double���͵�ֵת��Ϊint
		double dValue = 3.98;
		int tol = (int)dValue;
		// �����3
		System.out.println(tol);
	}
}
