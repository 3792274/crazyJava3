package chapter17_03_����TCPЭ���������;

import java.net.*;
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
public class Client
{
	public static void main(String[] args)
		throws IOException
	{
		Socket socket = new Socket("127.0.0.1" , 30000);   // ��
		// ��Socket��Ӧ����������װ��BufferedReader
		BufferedReader br = new BufferedReader(
		new InputStreamReader(socket.getInputStream()));
		// ������ͨIO����
		String line = br.readLine();
		System.out.println("���Է����������ݣ�" + line);
		// �ر���������socket
		br.close();
		socket.close();
	}
}
