package chapter15_09_NIO;

import java.nio.*;

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
public class BufferTest {
	public static void main(String[] args) {
		// 创建Buffer
		CharBuffer buff = CharBuffer.allocate(8); // ①指定大小，只有ByteBuffer才提供了创建直接Buffer allocateDirect()成本高效率高，适用于长生存期的Buffer
		System.out.println("capacity: " + buff.capacity());
		System.out.println("limit: " + buff.limit());
		System.out.println("position: " + buff.position());
		// 放入元素
		buff.put('a');
		buff.put('b');
		buff.put('c'); // ②
		System.out.println("加入三个元素后，position = " + buff.position());
		// 调用flip()方法
		buff.flip(); // ③将 limit 指向 position,position指向0
		System.out.println("执行flip()后，limit = " + buff.limit());
		System.out.println("position = " + buff.position());
		// 取出第一个元素
		System.out.println("第一个元素(position=0)：" + buff.get()); // ④
		System.out.println("取出一个元素后，position = " + buff.position());
		// 调用clear方法
		buff.clear(); // ⑤ limit指向最后既capacity,position指向0
		System.out.println("执行clear()后，limit = " + buff.limit());
		System.out.println("执行clear()后，position = " + buff.position());
		System.out.println("执行clear()后，缓冲区内容并没有被清除：" + "第三个元素为：" + buff.get(2)); // ⑥
		System.out.println("执行绝对读取后，position = " + buff.position());
	}
}
