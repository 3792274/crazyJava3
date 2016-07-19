package chapter13_04_ִ��SQL���ķ�ʽ;


import java.util.*;
import java.io.*;
import java.sql.*;
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
public class ExecuteDML
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
	public int insertData(String sql)throws Exception
	{
		// ��������
		Class.forName(driver);
		try(
			// ��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url
				, user , pass);
			// ʹ��Connection������һ��Statment����
			Statement stmt = conn.createStatement())
		{
			// ִ��DML,������Ӱ��ļ�¼����
			return stmt.executeUpdate(sql);
		}
	}
	public static void main(String[] args)throws Exception
	{
		ExecuteDML ed = new ExecuteDML();
		ed.initParam("resource\\chapter13_04_ִ��SQL���ķ�ʽ\\mysql.ini");
		int result = ed.insertData("insert into jdbc_test(jdbc_name,jdbc_desc)"
			+ "select s.student_name , t.teacher_name "
			+ "from student_table s , teacher_table t "
			+ "where s.java_teacher = t.teacher_id;");
		System.out.println("--ϵͳ�й���" + result + "����¼��Ӱ��--");
	}
}
