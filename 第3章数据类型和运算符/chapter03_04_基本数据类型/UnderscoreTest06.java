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
public class UnderscoreTest06
{
	//Java7 ����ģ�����ֵ�л��ߣ��ܺý������ֵ��λ����
	public static void main(String[] args)
	{
		// ����һ��32λ�Ķ�������,���λ�Ƿ���λ��
		int binVal = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		double pi = 3.14_15_92_65_36;
		System.out.println(binVal);
		System.out.println(pi);
		
		double height = 8_8_4_8.23;
		System.out.println(height);
	}
}
