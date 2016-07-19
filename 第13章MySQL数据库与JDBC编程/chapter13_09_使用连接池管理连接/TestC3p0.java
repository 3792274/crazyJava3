package chapter13_09_ʹ�����ӳع�������;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3p0 {

	public static void main(String[] args) throws Exception {
		//��������Դ����
		ComboPooledDataSource ds = new ComboPooledDataSource();
		//�������ӳ�����Ҫ������
		ds.setDriverClass("com.mysql.jdbc.Driver");
		//�������ݿ����ӵ�URL���û���������
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/select_test?characterEncoding=utf8&useSSL=true");
		ds.setUser("root");
		ds.setPassword("12369");
		
		//�������ӳصĳ�ʼ������
		ds.setMaxPoolSize(40);
		ds.setMinPoolSize(2);
		ds.setInitialPoolSize(10);  
		ds.setMaxStatements(180);//���û���Statement�����
		
		
		//ʹ������
		Connection connection = ds.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select s.* ,teacher_name from student_table s,teacher_table t where t.teacher_id=s.java_teacher") ;
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
	
		}
 
		
		
		connection.close(); //�黹���ӣ�����ر�
		
		
	}

}
