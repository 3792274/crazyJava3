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
public class YieldTest extends Thread {
	
	//�߳�����
	public YieldTest(String name) {
		super(name);
	}

	// ����run������Ϊ�߳�ִ����
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + "  " + i);
			// ��i����20ʱ��ʹ��yield�����õ�ǰ�߳��ò�
			if (i == 20) {
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// �������������߳�
		YieldTest yt1 = new YieldTest("�߼�");
		
		// ��ty1�߳����ó�������ȼ�
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();
		
		
		// ��yt2�߳����ó�������ȼ�
		YieldTest yt2 = new YieldTest("�ͼ�");
		yt2.setPriority(Thread.MIN_PRIORITY);
		yt2.start();
	}
}
