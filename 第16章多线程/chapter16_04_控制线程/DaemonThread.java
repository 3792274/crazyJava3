package chapter16_04_�����߳�;

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
public class DaemonThread extends Thread {
	
	// �����̨�̵߳��߳�ִ��������ͨ�߳�û���κ�����
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + "  " + i);
		}
	}

	public static void main(String[] args) {
		DaemonThread t = new DaemonThread();
		
		// �����߳����óɺ�̨�߳�
		t.setDaemon(true);
		
		// ������̨�߳�
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
		// -----����ִ�е��˴���ǰ̨�̣߳�main�̣߳�����------
		// ��̨�߳�ҲӦ����֮����,thread-0 ������ִ�е�999
	}
}
