package chapter16_05_线程同步;

/**
 * Description:模拟取款操作。 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
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
		// 创建一个账户
		Account acct = new Account("1234567", 1000);
		// 模拟两个线程对同一个账户取钱
		new DrawThread("甲", acct, 800).start();
		new DrawThread("乙", acct, 800).start();
	}
}
/*
 * out: 甲取钱成功！吐出钞票:800.0 取款后余额为: 200.0 乙取钱成功！吐出钞票:800.0 取款后余额为: -600.0
 */
