package chapter04_05_��������;

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
public class ArrayTest
{
	public static void main(String[] args)
	{
		// ����һ��int�������͵ı�����������ΪintArr.
		int[] intArr;
		// ʹ�þ�̬��ʼ������ʼ������ʱָֻ������Ԫ�صĳ�ʼֵ����ָ�����鳤�ȡ�
		intArr = new int[]{5, 6, 8 , 20};
		// ����һ��Object�������͵ı�����������ΪobjArr.
		Object[] objArr ;
		// ʹ�þ�̬��ʼ������ʼ������ʱ����Ԫ�ص�������
		// ��������ʱ��ָ��������Ԫ�����͵�����
		objArr = new String[]{"Java" , "���"};
		Object[] objArr2 ;
		// ʹ�þ�̬��ʼ��
		objArr2 = new Object[] {"Java" , "���"};


		// ����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ü򻯵ľ�̬��ʼ��д��
		int[] a = {5, 6 , 7, 9};


		//����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ö�̬��ʼ���﷨,��ʼ��Ϊ0��null��
		int[] prices = new int[5];
		// ����Ķ���ͳ�ʼ��ͬʱ��ɣ���ʼ������ʱԪ�ص������Ƕ�������ʱԪ�����͵�����
		Object[] books = new String[4];


		// ���objArr����ĵڶ���Ԫ�أ�������ַ���"���"
		System.out.println(objArr[1]);
		// ΪobjArr2�ĵ�һ������Ԫ�ظ�ֵ
		objArr2[0] = "Spring";

		// ��������Ԫ��ָ���������������鳤�ȣ�����������뽫������ʱ�����쳣
		// System.out.println(objArr2[2]);


		// ʹ��ѭ�����prices�����ÿ������Ԫ�ص�ֵ
		for (int i = 0; i < prices.length ; i ++ )
		{
			System.out.println(prices[i]);
		}

		// �Զ�̬��ʼ���������Ԫ�ؽ��и�ֵ
		books[0] = "���Java����";
		books[1] = "������Java EE��ҵӦ��ʵս";
		// ʹ��ѭ�����books�����ÿ������Ԫ�ص�ֵ
		for (int i = 0 ; i < books.length ; i++ )
		{
			System.out.println(books[i]);
		}
	}
}
