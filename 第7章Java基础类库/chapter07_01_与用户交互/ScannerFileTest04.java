package chapter07_01_���û�����;

import java.util.*;
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
public class ScannerFileTest04 {

	// ��Ƶ�IO �п��ܲ����쳣��
	public static void main(String[] args) throws Exception {
		// ��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		Scanner sc = new Scanner(new File("C:/Users/Mr.TianShu/Desktop/1.txt"));
		System.out.println("ScannerFileTest.java�ļ��������£�");
		// �ж��Ƿ�����һ��
		while (sc.hasNextLine()) {
			// ����ļ��е���һ��
			System.out.println(sc.nextLine());
		}
	}
}
