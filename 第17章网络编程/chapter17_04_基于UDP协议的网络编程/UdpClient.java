package chapter17_04_����UDPЭ���������;

import java.net.*;
import java.io.*;
import java.util.*;
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
public class UdpClient
{
	// ���巢�����ݱ���Ŀ�ĵ�
	public static final int DEST_PORT = 30000;
	public static final String DEST_IP = "127.0.0.1";
	// ����ÿ�����ݱ�������СΪ4K
	private static final int DATA_LEN = 4096;
	// ��������������ݵ��ֽ�����
	byte[] inBuff = new byte[DATA_LEN];
	// ��ָ���ֽ����鴴��׼���������ݵ�DatagramPacket����
	private DatagramPacket inPacket =
		new DatagramPacket(inBuff , inBuff.length);
	// ����һ�����ڷ��͵�DatagramPacket����
	private DatagramPacket outPacket = null;
	public void init()throws IOException
	{
		try(
			// ����һ���ͻ���DatagramSocket��ʹ������˿�
			DatagramSocket socket = new DatagramSocket())
		{
			// ��ʼ�������õ�DatagramSocket��������һ������Ϊ0���ֽ�����
			outPacket = new DatagramPacket(new byte[0] , 0
				, InetAddress.getByName(DEST_IP) , DEST_PORT);
			// ��������������
			Scanner scan = new Scanner(System.in);
			// ���϶�ȡ��������
			while(scan.hasNextLine())
			{
				// �����������һ���ַ���ת���ֽ�����
				byte[] buff = scan.nextLine().getBytes();
				// ���÷����õ�DatagramPacket����ֽ�����
				outPacket.setData(buff);
				// �������ݱ�
				socket.send(outPacket);
				// ��ȡSocket�е����ݣ����������ݷ���inPacket����װ���ֽ������
				socket.receive(inPacket);
				System.out.println(new String(inBuff , 0
					, inPacket.getLength()));
			}
		}
	}
	public static void main(String[] args)
		throws IOException
	{
		new UdpClient().init();
	}
}
