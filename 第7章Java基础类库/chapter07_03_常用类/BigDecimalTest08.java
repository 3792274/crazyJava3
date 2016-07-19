package chapter07_03_������;

import java.math.*;
/**
 * Description:
 * 1.double: �������С�������޷���ȷ��ʾ����Ϊ0.9*2=1.8 , 0.8*2 = 1.6 ....��Զ��������
 * 2.BigDecimal,���Ƽ�ʹ��double �Ĺ��캯����Ӧ��ʹ��"0.5" ����BigDecimal.valueOf()
 * 
 * 
 * 
 * 
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class BigDecimalTest08
{
	public static void main(String[] args)
	{
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);  //��ʧ���ȡ�����double �޷���ȷ��ʾ���㡣
		
		
		
		System.out.println("ʹ��String��ΪBigDecimal������������");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f1.divide(f2));
		
		System.out.println("ʹ��double��ΪBigDecimal������������");
		System.out.println("0.05 + 0.01 = " + f3.add(f2));
		System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f3.divide(f2));
	}
}
