package chapter06_10_对象与垃圾回收;

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
public class StatusTranfer01 {
	public static void test() {
		String a = new String("轻量级Java EE企业应用实战"); // ① 执行以后处于可达状态
		a = new String("疯狂Java讲义"); // ②恢复状态
	}

	public static void main(String[] args) {
		test(); // ③
	}
}
