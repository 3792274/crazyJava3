package chapter16_05_�߳�ͬ��;

/**
 * Description:ģ��ȡ������� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class DrawTest {
	public static void main(String[] args) {
		// ����һ���˻�
		Account acct = new Account("1234567", 1000);
		// ģ�������̶߳�ͬһ���˻�ȡǮ
		new DrawThread("��", acct, 800).start();
		new DrawThread("��", acct, 800).start();
	}
}
/*
 * out: ��ȡǮ�ɹ����³���Ʊ:800.0 ȡ������Ϊ: 200.0 ��ȡǮ�ɹ����³���Ʊ:800.0 ȡ������Ϊ: -600.0
 */
