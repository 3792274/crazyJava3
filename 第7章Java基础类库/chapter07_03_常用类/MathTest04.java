
package chapter07_03_������;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MathTest04 {
	public static void main(String[] args) {
		/*---------��������������---------*/
		// ������ת���Ƕ�
		System.out.println("Math.toDegrees(1.57)��" + Math.toDegrees(1.57));
		// ���Ƕ�ת��Ϊ����
		System.out.println("Math.toRadians(90)��" + Math.toRadians(90));
		// ���㷴���ң����صĽǶȷ�Χ�� 0.0 �� pi ֮�䡣
		System.out.println("Math.acos(1.2)��" + Math.acos(1.2));
		// ���㷴���ң����صĽǶȷ�Χ�� -pi/2 �� pi/2 ֮�䡣
		System.out.println("Math.asin(0.8)��" + Math.asin(0.8));
		// ���㷴���У����صĽǶȷ�Χ�� -pi/2 �� pi/2 ֮�䡣
		System.out.println("Math.atan(2.3)��" + Math.atan(2.3));
		// �����������ҡ�
		System.out.println("Math.cos(1.57)��" + Math.cos(1.57));
		// ����ֵ��˫�����ҡ�
		System.out.println("Math.cosh(1.2 )��" + Math.cosh(1.2));
		// ��������
		System.out.println("Math.sin(1.57 )��" + Math.sin(1.57));
		// ����˫������
		System.out.println("Math.sinh(1.2 )��" + Math.sinh(1.2));
		// ������������
		System.out.println("Math.tan(0.8 )��" + Math.tan(0.8));
		// ����˫������
		System.out.println("Math.tanh(2.1 )��" + Math.tanh(2.1));
		// ���������� (x, y) ת���ɼ����� (r, thet));
		System.out.println("Math.atan2(0.1, 0.2)��" + Math.atan2(0.1, 0.2));
		/*---------������ȡ������---------*/
		// ȡ��������С��Ŀ���������������
		System.out.println("Math.floor(-1.2 )��" + Math.floor(-1.2));
		// ȡ�������ش���Ŀ��������С������
		System.out.println("Math.ceil(1.2)��" + Math.ceil(1.2));
		// ��������ȡ��
		System.out.println("Math.round(2.3 )��" + Math.round(2.3));
		/*---------�����ǳ˷���������ָ������---------*/
		// ����ƽ������
		System.out.println("Math.sqrt(2.3 )��" + Math.sqrt(2.3));
		// ������������
		System.out.println("Math.cbrt(9)��" + Math.cbrt(9));
		// ����ŷ���� e ��n���ݡ�
		System.out.println("Math.exp(2)��" + Math.exp(2));
		// ���� sqrt(x2 +y2)
		System.out.println("Math.hypot(4 , 4)��" + Math.hypot(4, 4));
		// ���� IEEE 754 ��׼�Ĺ涨�����������������������㡣
		System.out.println("Math.IEEEremainder(5 , 2)��" + Math.IEEEremainder(5, 2));
		// ����˷�
		System.out.println("Math.pow(3, 2)��" + Math.pow(3, 2));
		// ������Ȼ����
		System.out.println("Math.log(12)��" + Math.log(12));
		// �������Ϊ 10 �Ķ�����
		System.out.println("Math.log10(9)��" + Math.log10(9));
		// ���ز����� 1 ֮�͵���Ȼ������
		System.out.println("Math.log1p(9)��" + Math.log1p(9));
		/*---------�����Ƿ�����ص�����---------*/
		// �������ֵ��
		System.out.println("Math.abs(-4.5)��" + Math.abs(-4.5));
		// ���Ÿ�ֵ�����ش��еڶ������������ŵĵ�һ�����������
		System.out.println("Math.copySign(1.2, -1.0)��" + Math.copySign(1.2, -1.0));
		// ���ź������������Ϊ 0���򷵻� 0������������� 0��
		// �򷵻� 1.0���������С�� 0���򷵻� -1.0��
		System.out.println("Math.signum(2.3)��" + Math.signum(2.3));
		/*---------�����Ǵ�С��ص�����---------*/
		// �ҳ����ֵ
		System.out.println("Math.max(2.3 , 4.5)��" + Math.max(2.3, 4.5));
		// ������Сֵ
		System.out.println("Math.min(1.2 , 3.4)��" + Math.min(1.2, 3.4));
		// ���ص�һ�������͵ڶ�������֮�����һ���������ڵĸ�������
		System.out.println("Math.nextAfter(1.2, 1.0)��" + Math.nextAfter(1.2, 1.0));
		// ���ر�Ŀ�����Դ�ĸ�����
		System.out.println("Math.nextUp(1.2 )��" + Math.nextUp(1.2));
		// ����һ��α���������ֵ���ڵ��� 0.0 ��С�� 1.0��
		System.out.println("Math.random()��" + Math.random());
	}
}
