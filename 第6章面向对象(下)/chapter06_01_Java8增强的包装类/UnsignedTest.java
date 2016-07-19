package chapter06_01_Java8��ǿ�İ�װ��;

/**
 * Description: java 8�����ģ����޷����������㹦��,����ص��ǣ����λ���ٱ���������λ
 * ����޷���������֧�ָ�������СΪ0��
 * ���磺byte -3��Դ�룺10000011(���λ1������)��
 * �䷴��Ϊ11111100,
 * ����Ϊ��11111101�������1��
 * ��������������޷��Ŵ��������λ1�Ͳ����Ƿ���λ��Ҳ����ֵλ����Ӧ253
 * 
 * �� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
		// ��byte���͵�-3ת��Ϊ�޷���������
		System.out.println("byte���͵�-3��Ӧ���޷���������" + Byte.toUnsignedInt(b)); // ���253
		
		// ָ��ʹ��16���ƽ����޷�������
		int val = Integer.parseUnsignedInt("fffffff4", 16);
		System.out.println(val); // ���171
		
		// ��-12ת��Ϊ�޷���int�ͣ�Ȼ��ת��Ϊ16���Ƶ��ַ���
		System.out.println(Integer.toUnsignedString(-12, 16)); // ���fffffff4
		
		// ��������ת��Ϊ�޷������������
		System.out.println(Integer.divideUnsigned(-2, 3));
		
		// ��������ת��Ϊ�޷����������������
		System.out.println(Integer.remainderUnsigned(-2, 7));
	}
}
