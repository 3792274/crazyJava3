package chapter09_03_类型通配符;

import javax.sql.rowset.JdbcRowSet;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Description:设定类型形参的上限。
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Apple<T extends Number>
{
	T col;
	public static void main(String[] args)
	{
		Apple<Integer> ai = new Apple<>();
		Apple<Double> ad = new Apple<>();
		
		// 下面代码将引起编译异常，下面代码试图把String类型传给T形参
		// 但String不是Number的子类型，所以引发编译错误
//		Apple<String> as = new Apple<>();		// ①
	
	
	}
}




//为类型形参设定多个上限,表明T类型必须是Number类或其子类，并必须实现Serializable接口。
class Apple2<T extends Number & java.io.Serializable>{
	
}










