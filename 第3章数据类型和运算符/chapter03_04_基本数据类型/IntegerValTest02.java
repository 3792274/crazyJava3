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
public class IntegerValTest02
{
	public static void main(String[] args)
	{
		// �����������ȷ�ģ�ϵͳ���Զ���56����byte���ʹ���
		byte a = 56;
		/*
		��������Ǵ�ģ�ϵͳ�����9999999999999����long���ʹ���
		���Գ���int�ı�����Χ���Ӷ��������
		*/
		// long bigValue = 9999999999999;
		// �����������ȷ�ģ��ھ޴������ֵ��ʹ��L��׺��ǿ��ʹ��long����
		long bigValue2 = 9223372036854775807L;

		// ��0��ͷ������ֵ��8���Ƶ�����
		int octalValue = 013;
		System.out.println(octalValue);
		// ��0x��0X��ͷ������ֵ��16���Ƶ�����
		int hexValue1 = 0x13;
		int hexValue2 = 0XaF;

		System.out.println(hexValue1);
		System.out.println(hexValue2);

		// �������8λ�Ķ�������
		int binVal1 = 0b11010100;
		byte binVal2 = 0B01101001;
		// ����һ��32λ�Ķ�������,���λ�Ƿ���λ��
		int binVal3 = 0B10000000000000000000000000000011;
		System.out.println(binVal1); // ���212
		System.out.println(binVal2); // ���105
		System.out.println(binVal3); // ���-2147483645
		/*
		 ����һ��8λ�Ķ����ƣ�����ֵĬ��ռ32λ���������һ��������
		 ֻ��ǿ������ת����byteʱ��������������յ���binVal4�����-23
		 */
		byte binVal4 =  (byte)0b11101001;
		/*
		  ����һ��32λ�Ķ�������,���λ��1��
		  ��������ֵ�������L��׺����˸�������ʵ��ռ64λ����32λ��1���Ƿ���λ��
		  ���binVal5��ֵ����2��31�η� + 2 + 1
		 */
		long binVal5 = 0B10000000000000000000000000000011L;
		System.out.println(binVal4); // ���-23
		System.out.println(binVal5); // ���2147483651
	}
}