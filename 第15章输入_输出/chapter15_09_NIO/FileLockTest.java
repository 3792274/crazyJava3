package chapter15_09_NIO;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * Description:���������������������� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FileLockTest {
	public static void main(String[] args) throws Exception {

		try (
				// ʹ��FileOutputStream��ȡFileChannel
				FileChannel channel = new FileOutputStream("D:/a.txt").getChannel()) {
			// ʹ�÷�����ʽ��ʽ��ָ���ļ�����
			FileLock lock = channel.tryLock();
			// ������ͣ10s
			Thread.sleep(10000);
			// �ͷ���
			lock.release();
		}
	}
}
