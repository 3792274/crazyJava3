package chapter06_01_Java8��ǿ�İ�װ��;

/**
 * Description:��װ��������ֵ���ͱȽϣ�ȡ��������ֵ���͵�ֵ <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class WrapperClassCompare {
	public static void main(String[] args) {
		
		Integer a = new Integer(6);
		System.out.println("6�İ�װ��ʵ���Ƿ����5.0" + (a > 5.0));// ���true
		System.out.println("�Ƚ�2����װ���ʵ���Ƿ���ȣ�" + (new Integer(2) == new Integer(2))); // ���false
		
		// ͨ���Զ�װ�䣬����ѻ�������ֵ��ֵ����װ���ʵ��
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("����2�Զ�װ����Ƿ���ȣ�" + (ina == inb)); // ���true
		
		Integer biga = 128;
		Integer bigb = 128;
		System.out.println("����128�Զ�װ����Ƿ���ȣ�" + (biga == bigb)); // ���false,IntegerԴ��ֻ����-128 ~ 127������
	}
}
