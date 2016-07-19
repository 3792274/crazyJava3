package chapter13_03_JDBC�ĵ����÷�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 1.����java7�ṩ���Զ��ر���Դ��try()д��
 * 2.java7��д��Connection��Statement��ResultSet�Ƚӿڣ����Ƕ��̳���AutoCloseable�ӿ�
 * @author Mr.TianShu
 *
 */
public class ConnMySql {

	public static void main(String[] args) throws Exception {
		// 1.�������ݿ�������ʹ�÷���
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		try (
				// 2.ʹ��DriverManager��ȡ����
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/select_test?characterEncoding=utf8&useSSL=true", "root", "12369");
				// 3.ʹ��Connection ����һ��Statement����
				Statement stmt = conn.createStatement();
				// 4.ִ��SQL���
				ResultSet rs = stmt.executeQuery("select s.* ,teacher_name from student_table s,teacher_table t where t.teacher_id=s.java_teacher");) {
			// 5.ʹ��resultSet
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));

			}

		}

	}
}