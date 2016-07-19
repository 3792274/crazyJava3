package chapter10_02_异常类的继承体系;


import java.io.*;
/**
 * Description:访问异常信息
 * 1.getMessage():返回异常详细信息字符串
 * 2.printStackTrace():跟踪栈信息输出屏幕
 * 3.printStackTrace(PrintStream s) 将异常跟踪栈信息输出到指定输出流
 * 4.getStackTrace():返回异常的跟踪栈信息。
 * 
 */
public class AccessExceptionMsg
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("第10章异常处理\\chapter10_02_异常类的继承体系\\b.txt");
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
