package chapter07_01_���û�����;

import java.io.*;

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
public class KeyboardInTest {
	
	
	public static void main(String[] args) throws Exception {
		
		
		// ��System.in�ڵ���Ϊ����������һ��BufferedReader����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String line = null;
		
		// ���ж�ȡ��������
		while ((line = br.readLine()) != null) {
			System.out.println("�û�����������:" + line);
		}
	}
}
