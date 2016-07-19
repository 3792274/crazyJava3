package chapter06_10_��������������;

import java.lang.ref.*;

/**
 * Description:ʾ�������ñ��������յĹ��� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ReferenceTest04 {
	public static void main(String[] args) throws Exception {
		
		// ����һ���ַ������󣬶����ַ���String str="���Java����"������ǿ���ã�������ַ����أ���������ա�
		String str = new String("���Java����");
		
		// ����һ�������ã��ô����������õ�"���Java����"�ַ�������strһ�����õ��ö���
		WeakReference wr = new WeakReference(str); // ��
		
		// �ж�str���ú�"���Java����"�ַ���֮�������
		str = null; // ��
		
		// ȡ�������������õĶ���
		System.out.println(wr.get()); // �� �����ûᱣ�����ַ���
		
		// ǿ����������
		System.gc();
		System.runFinalization();
		
		// �ٴ�ȡ�������������õĶ���
		System.out.println(wr.get()); // ��
	}
}
