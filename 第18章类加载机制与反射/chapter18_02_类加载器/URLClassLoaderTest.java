package chapter18_02_�������;

import java.sql.*;
import java.util.*;
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
public class URLClassLoaderTest
{
	private static Connection conn;
	// ����һ����ȡ���ݿ����ӷ���
	public static Connection getConn(String url ,
		String user , String pass) throws Exception
	{
		if (conn == null)
		{
			// ����һ��URL����
			URL[] urls = {new URL(
				"file:mysql-connector-java-5.1.30-bin.jar")};
			// ��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
			URLClassLoader myClassLoader = new URLClassLoader(urls);
			// ����MySQL��JDBC������������Ĭ��ʵ��
			Driver driver = (Driver)myClassLoader.
				loadClass("com.mysql.jdbc.Driver").newInstance();
			// ����һ������JDBC�������Ե�Properties����
			Properties props = new Properties();
			// ������ҪΪ�ö�����user��password��������
			props.setProperty("user" , user);
			props.setProperty("password" , pass);
			// ����Driver�����connect������ȡ�����ݿ�����
			conn = driver.connect(url , props);
		}
		return conn;
	}
	public static void main(String[] args)throws Exception
	{
		System.out.println(getConn("jdbc:mysql://localhost:3306/mysql"
			, "root" , "32147"));
	}
}

