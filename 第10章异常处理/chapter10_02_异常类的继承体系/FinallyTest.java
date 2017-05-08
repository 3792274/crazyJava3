package chapter10_02_异常类的继承体系;


import java.io.*;
/**
 * Description:return也可以执行finally
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FinallyTest
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("第10章异常处理\\chapter10_02_异常类的继承体系\\a.txt");
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			// return语句强制方法返回
			return ;       // ①
			// 使用exit来退出虚拟机
			// System.exit(1);     // ② finally快将得不到执行的机会。
		}
		finally
		{
			// 关闭磁盘文件，回收资源
			if (fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
				System.out.println("正在回收");
			}
			System.out.println("执行finally块里的资源回收!");
		}
	}
}
