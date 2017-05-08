package chapter17_03_基于TCP协议的网络编程.MultiThread.client;

import java.io.*;
import java.net.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ClientThread implements Runnable
{
	// 该线程负责处理的Socket
	private Socket s;
	// 该线程所处理的Socket所对应的输入流
	BufferedReader br = null;
	public ClientThread(Socket s)
		throws IOException
	{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			// 不断读取Socket输入流中的内容，并将这些内容打印输出
			while ((content = br.readLine()) != null)
			{
				System.out.println(content);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
