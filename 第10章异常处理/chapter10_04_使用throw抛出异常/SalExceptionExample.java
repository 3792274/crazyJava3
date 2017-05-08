package chapter10_04_使用throw抛出异常;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SalExceptionExample {

	 /**
	  * 一个实现计算工资的方法
	  */
	public void calSal() throws SalException{
		
		
		try {
			Connection connection = DriverManager.getConnection("");
			//实现结算工资的业务逻辑
		} catch (SQLException sqle) {
			 //把原始异常记录下来，留给管理员....
			    new SalException(sqle); //保存原始的错误栈信息
			//下面的异常message是对用户的提示
			
			throw new SalException("访问数据库出错。");
		}catch(Exception e){
			//把原始异常记录下来，留给管理员....
			 new SalException(e); //保存原始的错误栈信息
			//下面的异常message是对用户的提示
			throw new SalException("系统出现未知错误");
			
		}
	}
	
	
	
	

}
