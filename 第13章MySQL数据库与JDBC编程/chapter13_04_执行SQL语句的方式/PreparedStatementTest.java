package chapter13_04_ִ��SQL���ķ�ʽ;

import java.util.*;
import java.io.*;
import java.sql.*;

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
public class PreparedStatementTest {
	private String driver;
	private String url;
	private String user;
	private String pass;

	public void initParam(String paramFile) throws Exception {
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
		// ��������
		Class.forName(driver);
	}

	public void insertUseStatement() throws Exception {
		long start = System.currentTimeMillis();
		try (
				// ��ȡ���ݿ�����
				Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��Connection������һ��Statment����
				Statement stmt = conn.createStatement()) {
			// ��Ҫʹ��100��SQL���������100����¼
			for (int i = 0; i < 1000; i++) {
				stmt.executeUpdate("insert into student_table values(" + " null ,'����" + i + "' , 1)");
			}
			System.out.println("ʹ��Statement��ʱ:" + (System.currentTimeMillis() - start));
		}
	}

	public void insertUsePrepare() throws Exception {
		long start = System.currentTimeMillis();
		try (
				// ��ȡ���ݿ�����
				Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��Connection������һ��PreparedStatement����
				PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null,?,1)"))

		{
			// 100��ΪPreparedStatement�Ĳ�����ֵ���Ϳ��Բ���100����¼
			for (int i = 0; i < 1000; i++) {
				pstmt.setString(1, "����" + i);
				pstmt.executeUpdate();
			}
			System.out.println("ʹ��PreparedStatement��ʱ:" + (System.currentTimeMillis() - start));
		}
	}

	public static void main(String[] args) throws Exception {
		PreparedStatementTest pt = new PreparedStatementTest();
		pt.initParam("resource\\chapter13_04_ִ��SQL���ķ�ʽ\\mysql.ini");
		pt.insertUseStatement();
		pt.insertUsePrepare();
	}
}
