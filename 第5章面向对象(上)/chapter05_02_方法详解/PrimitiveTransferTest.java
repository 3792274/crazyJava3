package chapter05_02_�������;



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
public class PrimitiveTransferTest
{
	public static void swap(int a , int b)
	{
		// �������д���ʵ��a��b������ֵ������
		// ����һ����ʱ����������a������ֵ
		int tmp = a;
		// ��b��ֵ����a
		a = b;
		// ����ʱ����tmp��ֵ����a
		b = tmp;
		System.out.println("swap�����a��ֵ��"
			+ a + "��b��ֵ��" + b);
	}
	public static void main(String[] args)
	{
		int a = 6;
		int b = 9;
		swap(a , b);
		System.out.println("���������󣬱���a��ֵ��"
			+ a + "������b��ֵ��" + b);
	}
}
