package chapter07_03_������;

import java.math.*;

/**
 * Description:
 * 
 * ������ 1.double������������BigDecimal,����ת��Ϊdouble,������
 * 
 * 
 * <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Arith08 {
	// Ĭ�ϳ������㾫��
	private static final int DEF_DIV_SCALE = 10;

	// ������˽�У�������಻��ʵ����
	private Arith08() {
	}

	// �ṩ��ȷ�ļӷ����㡣
	public static double add(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}

	// �ṩ��ȷ�ļ������㡣
	public static double sub(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}

	// �ṩ��ȷ�ĳ˷����㡣
	public static double mul(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}

	// �ṩ����ԣ���ȷ�ĳ������㣬�����������������ʱ.
	// ��ȷ��С�����Ժ�10λ�������������롣
	public static double div(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static void main(String[] args) {
		System.out.println("0.05 + 0.01 = " + Arith08.add(0.05, 0.01));
		System.out.println("1.0 - 0.42 = " + Arith08.sub(1.0, 0.42));
		System.out.println("4.015 * 100 = " + Arith08.mul(4.015, 100));
		System.out.println("123.3 / 100 = " + Arith08.div(123.3, 100));
	}
}
