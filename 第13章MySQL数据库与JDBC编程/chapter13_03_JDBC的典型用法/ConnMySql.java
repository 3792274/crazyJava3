package chapter13_03_JDBC的典型用法;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 1.采用java7提供的自动关闭资源的try()写法
 * 2.java7改写了Connection、Statement、ResultSet等接口，他们都继承了AutoCloseable接口
 * @author Mr.TianShu
 *
 */
public class ConnMySql {

	public static void main(String[] args) throws Exception {
		// 1.加载数据库启动，使用反射
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		try (
				// 2.使用DriverManager获取连接
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/select_test?characterEncoding=utf8&useSSL=true", "root", "12369");
				// 3.使用Connection 创建一个Statement对象
				Statement stmt = conn.createStatement();
				// 4.执行SQL语句
				ResultSet rs = stmt.executeQuery("select s.* ,teacher_name from student_table s,teacher_table t where t.teacher_id=s.java_teacher");) {
			// 5.使用resultSet
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));

			}

		}

	}
}