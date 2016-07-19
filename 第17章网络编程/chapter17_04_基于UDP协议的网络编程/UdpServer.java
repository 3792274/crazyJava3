package chapter17_04_����UDPЭ���������;

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
public class UdpServer
{
	public static final int PORT = 30000;
	// ����ÿ�����ݱ�������СΪ4K
	private static final int DATA_LEN = 4096;
	// ��������������ݵ��ֽ�����
	byte[] inBuff = new byte[DATA_LEN];
	// ��ָ���ֽ����鴴��׼���������ݵ�DatagramPacket����
	private DatagramPacket inPacket =
		new DatagramPacket(inBuff , inBuff.length);
	// ����һ�����ڷ��͵�DatagramPacket����
	private DatagramPacket outPacket;
	// ����һ���ַ������飬���������͸�����ĵ�Ԫ��
	String[] books = new String[]
	{
		"���Java����",
		"������Java EE��ҵӦ��ʵս",
		"���Android����",
		"���Ajax����"
	};
	public void init()throws IOException
	{
		try(
			// ����DatagramSocket����
			DatagramSocket socket = new DatagramSocket(PORT))
		{
			// ����ѭ����������
			for (int i = 0; i < 1000 ; i++ )
			{
				// ��ȡSocket�е����ݣ����������ݷ���inPacket��װ�������
				socket.receive(inPacket);
				// �ж�inPacket.getData()��inBuff�Ƿ���ͬһ������
				System.out.println(inBuff == inPacket.getData());
				// �����յ�������ת���ַ��������
				System.out.println(new String(inBuff
					, 0 , inPacket.getLength()));
				// ���ַ���������ȡ��һ��Ԫ����Ϊ���͵�����
				byte[] sendData = books[i % 4].getBytes();
				// ��ָ���ֽ�������Ϊ�������ݡ��Ըս��ܵ���DatagramPacket��
				// ԴSocketAddress��ΪĿ��SocketAddress����DatagramPacket��
				outPacket = new DatagramPacket(sendData
					, sendData.length , inPacket.getSocketAddress());
				// ��������
				socket.send(outPacket);
			}
		}
	}
	public static void main(String[] args)
		throws IOException
	{
		new UdpServer().init();
	}
}