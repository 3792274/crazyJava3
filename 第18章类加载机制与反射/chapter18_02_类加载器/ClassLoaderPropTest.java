package chapter18_02_�������;

import java.util.*;
import java.net.*;
import java.io.*;
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
public class ClassLoaderPropTest
{
	public static void main(String[] args)
		throws IOException
	{
		// ��ȡϵͳ�������
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("ϵͳ���������" + systemLoader);
		/*
		��ȡϵͳ��������ļ���·������ͨ����CLASSPATH��������ָ��
		�������ϵͳû��ָ��CLASSPATH����������Ĭ���Ե�ǰ·����Ϊ
		ϵͳ��������ļ���·��
		*/
		Enumeration<URL> em1 = systemLoader.getResources("");
		while(em1.hasMoreElements())
		{
			System.out.println(em1.nextElement());
		}
		// ��ȡϵͳ��������ĸ�����������õ���չ�������
		ClassLoader extensionLader = systemLoader.getParent();
		System.out.println("��չ���������" + extensionLader);
		System.out.println("��չ��������ļ���·����"
			+ System.getProperty("java.ext.dirs"));
		System.out.println("��չ���������parent: "
			+ extensionLader.getParent());
	}
}

