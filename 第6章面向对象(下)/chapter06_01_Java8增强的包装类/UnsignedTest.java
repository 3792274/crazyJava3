package chapter06_01_Java8增强的包装类;

/**
 * Description: java 8新增的，对无符号算数运算功能,最大特点是，最高位不再被当做符号位
 * 因此无符号整数不支持负数，最小为0；
 * 例如：byte -3的源码：10000011(最高位1代表负数)，
 * 其反码为11111100,
 * 补码为：11111101（反码加1）
 * 如果该数被当做无符号处理，则最高位1就不再是符号位，也是数值位，对应253
 * 
 * ， <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class UnsignedTest {
	public static void main(String[] args) {
		
		byte b = -3;
		// 将byte类型的-3转换为无符号整数。
		System.out.println("byte类型的-3对应的无符号整数：" + Byte.toUnsignedInt(b)); // 输出253
		
		// 指定使用16进制解析无符号整数
		int val = Integer.parseUnsignedInt("fffffff4", 16);
		System.out.println(val); // 输出171
		
		// 将-12转换为无符号int型，然后转换为16进制的字符串
		System.out.println(Integer.toUnsignedString(-12, 16)); // 输出fffffff4
		
		// 将两个数转换为无符号整数后相除
		System.out.println(Integer.divideUnsigned(-2, 3));
		
		// 将两个数转换为无符号整数相除后求余
		System.out.println(Integer.remainderUnsigned(-2, 7));
	}
}
