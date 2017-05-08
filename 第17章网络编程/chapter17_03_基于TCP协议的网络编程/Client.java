package chapter17_03_基于TCP协议的网络编程;

import java.net.*;

import com.sun.java_cup.internal.runtime.Scanner;

import java.io.*;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * 
 * ......................................................................
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建一个无连接的socket
		Socket socket = new Socket(); // ①
		//让socket连接服务器，如果超过10秒没连接上则超时，1秒的错误是：connect timed out 2秒的错误是：Connection refused: connec
		//无论server端是否serverSocket.accept();都会返回socket.isConnected()true
		socket.connect(new InetSocketAddress("127.0.0.1", 30000), 0);
		System.out.println(socket.isConnected());
		

		// 设置超时时间,确认已经连接上以后，开始工作了，如果工作时间超过这个时间，就抛出异常。
//		socket.setSoTimeout(4000);
		
		try {
			// 使用Scanner读取网络中的数据流
			java.util.Scanner scan = new java.util.Scanner(socket.getInputStream());
			String line = scan.nextLine();
			System.out.println("Scan 中获取的数据：" + line);
		} catch (SocketTimeoutException ex) {
			// 对超时的异常处理

		}
		
		
		

		// 将Socket对应的输入流包装成BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// 进行普通IO操作
		String line = br.readLine();
		System.out.println("来自服务器的数据：" + line);
		// 关闭输入流、socket
		br.close();
		socket.close();
	}
}
