package chapter18_02_�������;

import java.net.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class BootstrapTest
{
	public static void main(String[] args)
	{
		// ��ȡ��������������ص�ȫ��URL����
		URL[] urls = sun.misc.Launcher.
		getBootstrapClassPath().getURLs();
		// ���������������������ص�ȫ��URL
		for (int i = 0; i < urls.length; i++)
		{
			System.out.println(urls[i].toExternalForm());
		}
	}
}

