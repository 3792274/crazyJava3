package chapter03_04_基本数据类型;


/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class UnderscoreTest06
{
	//Java7 引入的，在数值中划线，很好解决了数值的位数。
	public static void main(String[] args)
	{
		// 定义一个32位的二进制数,最高位是符号位。
		int binVal = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		double pi = 3.14_15_92_65_36;
		System.out.println(binVal);
		System.out.println(pi);
		
		double height = 8_8_4_8.23;
		System.out.println(height);
	}
}
