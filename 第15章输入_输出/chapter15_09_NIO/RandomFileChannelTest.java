package chapter15_09_NIO;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Description:RandomAccessFile�õ���Channel()��ֻ���Ļ��ǿɶ�д�ģ�
 * ȡ����RandomAccessFile�ļ��Ĵ򿪷�ʽ�� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class RandomFileChannelTest {
	public static void main(String[] args) throws Exception {


		File f = new File("D:/a.txt");
		
		try (
				// ����һ��RandomAccessFile����
				RandomAccessFile raf = new RandomAccessFile(f, "rw");

				// ��ȡRandomAccessFile��Ӧ��Channel
				FileChannel randomChannel = raf.getChannel()) {

			// ��Channel����������ӳ���ByteBuffer
			ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());

			// ��Channel�ļ�¼ָ���ƶ������
			randomChannel.position(f.length());

			// ��buffer�������������
			randomChannel.write(buffer);
		}

	
		
 
	}

}
