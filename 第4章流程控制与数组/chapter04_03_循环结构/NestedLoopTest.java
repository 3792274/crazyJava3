package chapter04_03_ѭ���ṹ;

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
public class NestedLoopTest {
	public static void main(String[] args) {
		// ���ѭ��
		for (int i = 0; i < 5; i++) {
			// �ڲ�ѭ��
			for (int j = 0; j < 3; j++) {
				System.out.println("i��ֵΪ:" + i + "  j��ֵΪ:" + j);
			}
		}
	}
}
