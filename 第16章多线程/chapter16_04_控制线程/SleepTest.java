package chapter16_04_�����߳�;

import java.util.*;

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
public class SleepTest {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println("��ǰʱ��: " + new Date());
			// ����sleep�����õ�ǰ�߳���ͣ1s��
			Thread.sleep(1000);
		}
	}
}
