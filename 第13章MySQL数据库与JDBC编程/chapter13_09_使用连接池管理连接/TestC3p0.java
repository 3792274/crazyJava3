package chapter13_09_使用连接池管理连接;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3p0 {

	public static void main(String[] args) throws Exception {
		//创建数据源对象
		ComboPooledDataSource ds = new ComboPooledDataSource();
		//设置连接池所需要的驱动
		ds.setDriverClass("com.mysql.jdbc.Driver");
		//设置数据库连接的URL、用户名、密码
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/select_test?characterEncoding=utf8&useSSL=true");
		ds.setUser("root");
		ds.setPassword("12369");
		
		//设置连接池的初始化参数
		ds.setMaxPoolSize(40);
		ds.setMinPoolSize(2);
		ds.setInitialPoolSize(10);  
		ds.setMaxStatements(180);//设置缓存Statement最大数
		
		
		//使用连接
		Connection connection = ds.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select s.* ,teacher_name from student_table s,teacher_table t where t.teacher_id=s.java_teacher") ;
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
	
		}
 
		
		
		connection.close(); //归还连接，不真关闭
		
		
	}

}
