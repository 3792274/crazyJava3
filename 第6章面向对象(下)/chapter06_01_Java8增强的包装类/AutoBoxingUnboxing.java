package chapter06_01_Java8��ǿ�İ�װ��;

/**
 * Description: jdk1.5 �Ժ��Զ����䣬װ��<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		// ֱ�Ӱ�һ���������ͱ�������Integer����
		Integer inObj = 5;
		// ֱ�Ӱ�һ��boolean���ͱ�������һ��Object���͵ı���
		Object boolObj = true;
		// ֱ�Ӱ�һ��Integer���󸳸�int���͵ı���
		int it = inObj;
		if (boolObj instanceof Boolean) {
			// �Ȱ�Object����ǿ������ת��ΪBoolean���ͣ��ٸ���boolean����
			boolean b = (Boolean) boolObj;
			System.out.println(b);
		}
	}
}
