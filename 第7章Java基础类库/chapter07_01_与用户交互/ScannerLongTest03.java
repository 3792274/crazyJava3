package chapter07_01_���û�����;

import java.util.*;

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
public class ScannerLongTest03 {
	public static void main(String[] args) {
		// System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		// �ж��Ƿ�����һ��long������������ı���������������˳�
		while (sc.hasNextLong()) {
			// ���������
			System.out.println("��������������ǣ�" + sc.nextLong());
		}
	}
}
