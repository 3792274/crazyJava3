package chapter10_04_ʹ��throw�׳��쳣;


import java.io.*;
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
public class ThrowTest2
{
	public static void main(String[] args)
		// Java 6��Ϊ�ٺŴ�������׳�Exception�� ���Դ˴������׳�Exception
//		throws Exception
		
	// Java 7����ٺŴ�������׳��쳣��ʵ�����ͣ� ��˴˴�ֻ�������׳�FileNotFoundException���ɡ�
		throws FileNotFoundException
		
		
	{
		try
		{
			new FileOutputStream("a.txt");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			throw ex;        // ��
		}
	}
}