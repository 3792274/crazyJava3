package chapter03_05_�������͵�����ת��;

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
public class PrimitiveAndString {
	public static void main(String[] args) {
		// ��������Ǵ�ģ���Ϊ5��һ������������ֱ�Ӹ���һ���ַ���
		// String str1 = 5;
		// һ����������ֵ���ַ���������������ʱ����������ֵ�Զ�ת��Ϊ�ַ���
		String str2 = 3.5f + "";
		// �������3.5
		System.out.println(str2);
		// ����������7Hello!
		System.out.println(3 + 4 + "Hello��");
		// ����������Hello!34����ΪHello! + 3���3�����ַ�������
		// �����ٰ�4�����ַ�������
		System.out.println("Hello��" + 3 + 4);
	}
}
