
package chapter07_02_ϵͳ���;

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
public class RuntimeTest03 {
	public static void main(String[] args) {
		// ��ȡJava�������������ʱ����
		Runtime rt = Runtime.getRuntime();
		System.out.println("������������" + rt.availableProcessors());
		System.out.println("�����ڴ�����" + rt.freeMemory());
		System.out.println("���ڴ�����" + rt.totalMemory());
		System.out.println("��������ڴ�����" + rt.maxMemory());
	}
}
