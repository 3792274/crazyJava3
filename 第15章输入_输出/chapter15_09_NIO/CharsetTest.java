package chapter15_09_NIO;


import java.nio.charset.*;
import java.util.*;
/**
 * Description:��ȡJDK֧�ֵ�ȫ���ַ���
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CharsetTest
{
	public static void main(String[] args)
	{
		String fileEncoding = System.getProperty("file.encoding");
		System.out.println("����ϵͳ���ļ������ʽ�� "+fileEncoding);
		
		// ��ȡJava֧�ֵ�ȫ���ַ���
		SortedMap<String,Charset>  map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			// ����ַ����ı����Ͷ�Ӧ��Charset����
			System.out.println(alias + "----->"+ map.get(alias));
		}
	}
}
