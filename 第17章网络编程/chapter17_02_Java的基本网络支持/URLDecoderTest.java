package chapter17_02_Java�Ļ�������֧��;

import java.net.*;

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
public class URLDecoderTest {
	public static void main(String[] args) throws Exception {
		// ��application/x-www-form-urlencoded�ַ���
		// ת������ͨ�ַ���
		// ���е��ַ���ֱ�Ӵ�ͼ17.3��ʾ���ڸ��ƹ���
		String keyWord = URLDecoder.decode("%E7%96%AF%E7%8B%82java", "utf-8");
		System.out.println(keyWord);
		
		// ����ͨ�ַ���ת����
		// application/x-www-form-urlencoded�ַ���
		String urlStr = URLEncoder.encode("���Android����", "GBK");
		System.out.println(urlStr);
	}
}
