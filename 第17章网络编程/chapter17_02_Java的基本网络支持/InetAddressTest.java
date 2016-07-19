package chapter17_02_Java�Ļ�������֧��;

import java.net.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		// ��������������ȡ��Ӧ��InetAddressʵ��
		InetAddress ip = InetAddress.getByName("www.baidu.com");
		// �ж��Ƿ�ɴ�
		System.out.println("BaiDu�Ƿ�ɴ" + ip.isReachable(2000));
		// ��ȡ��InetAddressʵ����IP�ַ���
		System.out.println(ip.getHostAddress());
		// ����ԭʼIP��ַ����ȡ��Ӧ��InetAddressʵ��
		InetAddress local = InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 });
		System.out.println("�����Ƿ�ɴ" + local.isReachable(5000));
		// ��ȡ��InetAddressʵ����Ӧ��ȫ�޶�����
		System.out.println(local.getCanonicalHostName());
	}
}
