package chapter10_04_ʹ��throw�׳��쳣;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SalExceptionExample {

	 /**
	  * һ��ʵ�ּ��㹤�ʵķ���
	  */
	public void calSal() throws SalException{
		
		
		try {
			Connection connection = DriverManager.getConnection("");
			//ʵ�ֽ��㹤�ʵ�ҵ���߼�
		} catch (SQLException sqle) {
			 //��ԭʼ�쳣��¼��������������Ա....
			    new SalException(sqle); //����ԭʼ�Ĵ���ջ��Ϣ
			//������쳣message�Ƕ��û�����ʾ
			
			throw new SalException("�������ݿ����");
		}catch(Exception e){
			//��ԭʼ�쳣��¼��������������Ա....
			 new SalException(e); //����ԭʼ�Ĵ���ջ��Ϣ
			//������쳣message�Ƕ��û�����ʾ
			throw new SalException("ϵͳ����δ֪����");
			
		}
	}
	
	
	
	

}
