package chapter17_02_Java�Ļ�������֧��;

import java.io.*;
import java.net.*;
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
public class GetPostTest {
	/**
	 * ��ָ��URL����GET����������
	 * 
	 * @param url
	 *            ���������URL
	 * @param param
	 *            �����������ʽ����name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */
	public static String sendGet(String url, String param) {
		String result = "";
		
		
		String urlName = url + "?" + param;
		
		try {
			URL realUrl = new URL(urlName);
			// �򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			// ����ʵ�ʵ�����
			conn.connect();
			
			// ��ȡ������Ӧͷ�ֶ�
			Map<String, List<String>> map = conn.getHeaderFields();
		
			// �������е���Ӧͷ�ֶ�
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			
			
			try (
					// ����BufferedReader����������ȡURL����Ӧ
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))
				){
					String line;
					while ((line = in.readLine()) != null) {
						result += "\n" + line;
				  }
			}
		} catch (Exception e) {
			System.out.println("����GET��������쳣��" + e);
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * ��ָ��URL����POST����������
	 * 
	 * @param url
	 *            ���������URL
	 * @param param
	 *            �����������ʽӦ������name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */
	public static String sendPost(String url, String param) {
		String result = "";
		
		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			
			// ����POST�������������������
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			
			try (
					// ��ȡURLConnection�����Ӧ�������
					PrintWriter out = new PrintWriter(conn.getOutputStream())
				){
					// �����������
					out.print(param);
					// flush������Ļ���
					out.flush();
			}
			try (
					// ����BufferedReader����������ȡURL����Ӧ
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))
				){
					String line;
					while ((line = in.readLine()) != null) {
						result += "\n" + line;
				}
			}
		} catch (Exception e) {
			System.out.println("����POST��������쳣��" + e);
			e.printStackTrace();
		}
		return result;
	}

	// �ṩ�����������Է���GET�����POST����
	public static void main(String args[]) {
		// ����GET����
		String s = GetPostTest.sendGet("http://www.baidu.com/", null);
		System.out.println(s);
		// ����POST����
		String s1 = GetPostTest.sendPost("http://www.baidu.com/", "name=crazyit.org&pass=leegang");
		System.out.println(s1);
	}
}
