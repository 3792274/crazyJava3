package chapter13_09_ʹ�����ӳع�������;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class TestDbcp {

	public static void main(String[] args) throws Exception {
		//��������Դ����
		BasicDataSource ds = new BasicDataSource();
		//�������ӳ�����Ҫ������
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		//�������ݿ����ӵ�URL���û���������
		ds.setUrl("jdbc:mysql://localhost:3306/select_test?characterEncoding=utf8&useSSL=true");
		ds.setUsername("root");
		ds.setPassword("12369");
		
		//�������ӳصĳ�ʼ������
		ds.setInitialSize(5);
		ds.setMaxTotal(20);
		ds.setMaxIdle(2); //��������
		
		
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
