package chapter15_03_�ֽ������ַ���;

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
public class Test {
	public static void main(String[] args) throws IOException {
		File mov = new File("E:/Family/20G-4(Self).tc");
		// �����ֽ�������
		FileInputStream fis = new FileInputStream(mov);



		// ����һ������Ϊ1024�ġ���Ͳ��
		byte[] bbuf = new byte[Integer.MAX_VALUE<mov.length()?Integer.MAX_VALUE:(int)mov.length()];
		
		// ���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
 		
 		//��������ļ�
 		FileOutputStream fos = new FileOutputStream(new File("D:/a.mkv"));
 		
 		
		
		// ʹ��ѭ�����ظ���ȡˮ������
		while ((hasRead = fis.read(bbuf)) > 0) {
			// ȡ������Ͳ����ˮ�Σ��ֽڣ������ֽ�����ת�����ַ������룡
		  	fos.write(bbuf, 0, bbuf.length);
		}
		// �ر��ļ�������������finally�������ȫ
		fis.close();
		fos.close();
	 
	}
}
