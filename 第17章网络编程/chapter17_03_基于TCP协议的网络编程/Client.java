package chapter17_03_����TCPЭ���������;

import java.net.*;

import com.sun.java_cup.internal.runtime.Scanner;

import java.io.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
		//����һ�������ӵ�socket
		Socket socket = new Socket(); // ��
		//��socket���ӷ��������������10��û��������ʱ��1��Ĵ����ǣ�connect timed out 2��Ĵ����ǣ�Connection refused: connec
		//����server���Ƿ�serverSocket.accept();���᷵��socket.isConnected()true
		socket.connect(new InetSocketAddress("127.0.0.1", 30000), 0);
		System.out.println(socket.isConnected());
		

		// ���ó�ʱʱ��,ȷ���Ѿ��������Ժ󣬿�ʼ�����ˣ��������ʱ�䳬�����ʱ�䣬���׳��쳣��
//		socket.setSoTimeout(4000);
		
		try {
			// ʹ��Scanner��ȡ�����е�������
			java.util.Scanner scan = new java.util.Scanner(socket.getInputStream());
			String line = scan.nextLine();
			System.out.println("Scan �л�ȡ�����ݣ�" + line);
		} catch (SocketTimeoutException ex) {
			// �Գ�ʱ���쳣����

		}
		
		
		

		// ��Socket��Ӧ����������װ��BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// ������ͨIO����
		String line = br.readLine();
		System.out.println("���Է����������ݣ�" + line);
		// �ر���������socket
		br.close();
		socket.close();
	}
}
