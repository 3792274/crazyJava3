package chapter16_06_线程通信;

import java.util.concurrent.*;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
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
		// 定义一个长度为2的阻塞队列
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		bq.put("Java"); // 与bq.add("Java"、bq.offer("Java")相同
		bq.put("Java"); // 与bq.add("Java"、bq.offer("Java")相同
		bq.put("Java"); // ① 阻塞线程。使用put会导致阻塞，add会导致异常，offer返回false并不放入元素。
	}
}
