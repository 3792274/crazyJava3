
package chapter07_02_ϵͳ���;

/**
 * Description:�������Զ��� ,identityHashCode()���ص����ڴ��ַ�������Ե�ַ<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class IdentityHashCodeTest02 {
	public static void main(String[] args) {
		// ���������s1��s2��������ͬ����
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		// String��д��hashCode()����������Ϊ�����ַ����м���hashCodeֵ��
		// ��Ϊs1��s2���ַ�������ͬ���������ǵ�hashCode��������ֵ��ͬ
		System.out.println(s1.hashCode() + "----" + s2.hashCode());
		
		// s1��s2�ǲ�ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
		
		
		String s3 = "Java";
		String s4 = "Java";
		// s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3) + "----" + System.identityHashCode(s4));
	}
}
