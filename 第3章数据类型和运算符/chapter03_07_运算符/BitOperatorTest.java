package chapter03_07_�����;

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
public class BitOperatorTest
{
	
	//��λ������������nλ������2�ļ��η���������nλ������2�ļ��η�
	//��������2*8=16; 2<<<3
	public static void main(String[] args)
	{
//		System.out.println(2.5 & 3.0);
		System.out.println(5 & 9); // �����1
		System.out.println(5 | 9); // �����13
		System.out.println(~-5); // �����4
		System.out.println(5 ^ 9); // �����12
		System.out.println(5 << 2); // ���20
		System.out.println(-5 << 2); // ���-20
		System.out.println(-5 >> 2); // ���-2
		System.out.println(-5 >>> 2); // ���1073741822,�з��ŵ���λ
		System.err.println(2<<3);    //���16
	}
}
