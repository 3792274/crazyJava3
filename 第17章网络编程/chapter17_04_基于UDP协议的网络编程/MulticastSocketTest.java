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
// �ø���ʵ��Runnable�ӿڣ������ʵ������Ϊ�̵߳�target
public class MulticastSocketTest implements Runnable
{
	// ʹ�ó�����Ϊ������Ķ��㲥IP��ַ
	private static final String BROADCAST_IP
		= "230.0.0.1";
	// ʹ�ó�����Ϊ������Ķ��㲥Ŀ�ĵĶ˿�
	public static final int BROADCAST_PORT = 30000;
	// ����ÿ�����ݱ�������СΪ4K
	private static final int DATA_LEN = 4096;
	//���屾�����MulticastSocketʵ��
	private MulticastSocket socket = null;
	private InetAddress broadcastAddress = null;
	private Scanner scan = null;
	// ��������������ݵ��ֽ�����
	byte[] inBuff = new byte[DATA_LEN];
	// ��ָ���ֽ����鴴��׼���������ݵ�DatagramPacket����
	private DatagramPacket inPacket
		= new DatagramPacket(inBuff , inBuff.length);
	// ����һ�����ڷ��͵�DatagramPacket����
	private DatagramPacket outPacket = null;
	public void init()throws IOException
	{
		try(
			// ��������������
			Scanner scan = new Scanner(System.in))
		{
			// �������ڷ��͡��������ݵ�MulticastSocket����
			// ���ڸ�MulticastSocket������Ҫ�������ݣ�������ָ���˿�
			socket = new MulticastSocket(BROADCAST_PORT);
			broadcastAddress = InetAddress.getByName(BROADCAST_IP);
			// ����socket����ָ���Ķ��㲥��ַ
			socket.joinGroup(broadcastAddress);
			// ���ñ�MulticastSocket���͵����ݱ��ᱻ���͵�����
			socket.setLoopbackMode(false);
			// ��ʼ�������õ�DatagramSocket��������һ������Ϊ0���ֽ�����
			outPacket = new DatagramPacket(new byte[0]
				, 0 , broadcastAddress , BROADCAST_PORT);
			// �����Ա�ʵ����run()������Ϊ�߳�����߳�
			new Thread(this).start();
			// ���϶�ȡ��������
			while(scan.hasNextLine())
			{
				// �����������һ���ַ���ת���ֽ�����
				byte[] buff = scan.nextLine().getBytes();
				// ���÷����õ�DatagramPacket����ֽ�����
				outPacket.setData(buff);
				// �������ݱ�
				socket.send(outPacket);
			}
		}
		finally
		{
			socket.close();
		}
	}
	public void run()
	{
		try
		{
			while(true)
			{
				// ��ȡSocket�е����ݣ����������ݷ���inPacket����װ���ֽ������
				socket.receive(inPacket);
				// ��ӡ�����socket�ж�ȡ������
				System.out.println("������Ϣ��" + new String(inBuff
					, 0 , inPacket.getLength()));
			}
		}
		// ��׽�쳣
		catch (IOException ex)
		{
			ex.printStackTrace();
			try
			{
				if (socket != null)
				{
					// �ø�Socket�뿪�ö��IP�㲥��ַ
					socket.leaveGroup(broadcastAddress);
					// �رո�Socket����
					socket.close();
				}
				System.exit(1);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
		throws IOException
	{
		new MulticastSocketTest().init();
	}
}

