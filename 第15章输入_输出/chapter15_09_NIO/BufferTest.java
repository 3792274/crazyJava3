package chapter15_09_NIO;

import java.nio.*;

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
public class BufferTest {
	public static void main(String[] args) {
		// ����Buffer
		CharBuffer buff = CharBuffer.allocate(8); // ��ָ����С��ֻ��ByteBuffer���ṩ�˴���ֱ��Buffer allocateDirect()�ɱ���Ч�ʸߣ������ڳ������ڵ�Buffer
		System.out.println("capacity: " + buff.capacity());
		System.out.println("limit: " + buff.limit());
		System.out.println("position: " + buff.position());
		// ����Ԫ��
		buff.put('a');
		buff.put('b');
		buff.put('c'); // ��
		System.out.println("��������Ԫ�غ�position = " + buff.position());
		// ����flip()����
		buff.flip(); // �۽� limit ָ�� position,positionָ��0
		System.out.println("ִ��flip()��limit = " + buff.limit());
		System.out.println("position = " + buff.position());
		// ȡ����һ��Ԫ��
		System.out.println("��һ��Ԫ��(position=0)��" + buff.get()); // ��
		System.out.println("ȡ��һ��Ԫ�غ�position = " + buff.position());
		// ����clear����
		buff.clear(); // �� limitָ������capacity,positionָ��0
		System.out.println("ִ��clear()��limit = " + buff.limit());
		System.out.println("ִ��clear()��position = " + buff.position());
		System.out.println("ִ��clear()�󣬻��������ݲ�û�б������" + "������Ԫ��Ϊ��" + buff.get(2)); // ��
		System.out.println("ִ�о��Զ�ȡ��position = " + buff.position());
	}
}
