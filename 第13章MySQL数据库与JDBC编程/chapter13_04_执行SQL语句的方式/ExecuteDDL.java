package chapter13_04_ִ��SQL���ķ�ʽ;


import java.util.*;
import java.io.*;
import java.sql.*;
/**
 * Description:ִ��DDL��䣬���ؽ��0��DML��䷵����Ӱ������ݼ�¼����
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ExecuteDDL
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile)
		throws Exception
	{
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void createTable(String sql)throws Exception
	{
		// ��������
		Class.forName(driver);
		try(
		// ��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url , user , pass);
		// ʹ��Connection������һ��Statment����
		Statement stmt = conn.createStatement())
		{
			// ִ��DDL,�������ݱ�
			stmt.executeUpdate(sql);
		}
	}
	public static void main(String[] args) throws Exception
	{
		ExecuteDDL ed = new ExecuteDDL();
		ed.initParam("resource\\chapter13_04_ִ��SQL���ķ�ʽ\\mysql.ini");
		ed.createTable("create table jdbc_test "
			+ "( jdbc_id int auto_increment primary key, "
			+ "jdbc_name varchar(255), "
			+ "jdbc_desc text);");
		System.out.println("-----����ɹ�-----");
	}
}

