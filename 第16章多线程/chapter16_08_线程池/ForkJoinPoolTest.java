package chapter16_08_�̳߳�;

import java.util.concurrent.*;

/**
 * Description: ʹ��Java8��ǿ��ForkJoinPool,�ɽ����񻮷�ΪС���񣬷��з���ֵ�ģ�û�з���ֵ��<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163 .com
 * @version 1.0
 */

// �̳�RecursiveAction��ʵ��"�ɷֽ�"������
class PrintTask extends RecursiveAction {
	
	// ÿ����С����ֻ���ֻ��ӡ50����
	private static final int THRESHOLD = 50;
	
	private int start;
	private int end;

	// ��ӡ��start��end������
	public PrintTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		// ��end��start֮��Ĳ�С��THRESHOLDʱ����ʼ��ӡ
		if (end - start < THRESHOLD) {
			for (int i = start; i < end; i++) {
				System.out.println(Thread.currentThread().getName() + "��iֵ��" + i);
			}
		} else {
			// �����end��start֮��Ĳ����THRESHOLDʱ����Ҫ��ӡ��������50��
			// ��������ֽ������С����
			int middle = (start + end) / 2;
			PrintTask left = new PrintTask(start, middle);
			PrintTask right = new PrintTask(middle, end);
			
			// ����ִ��������С����
			left.fork();
			right.fork();
		}
	}
}

public class ForkJoinPoolTest {
	public static void main(String[] args) throws Exception {
		ForkJoinPool pool = new ForkJoinPool();
		// �ύ�ɷֽ��PrintTask����
		pool.submit(new PrintTask(0, 300));
		pool.awaitTermination(2, TimeUnit.SECONDS);
		// �ر��̳߳�
		pool.shutdown();
	}
}
