package chapter16_06_�߳�ͨ��;

import java.util.concurrent.*;

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
public class BlockingQueueTest {
	public static void main(String[] args) throws Exception {
		// ����һ������Ϊ2����������
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		bq.put("Java"); // ��bq.add("Java"��bq.offer("Java")��ͬ
		bq.put("Java"); // ��bq.add("Java"��bq.offer("Java")��ͬ
		bq.put("Java"); // �� �����̡߳�ʹ��put�ᵼ��������add�ᵼ���쳣��offer����false��������Ԫ�ء�
	}
}
