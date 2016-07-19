package chapter15_09_NIO;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

/**
 * Description: �ӽڵ���������ֻ����Bufferֱ�ӽ�����<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FileChannelTest {
	public static void main(String[] args) {
		File f = new File("��15������_���/chapter15_09_NIO/FileChannelTest.java");
		try (
				// ����FileInputStream���Ը��ļ�����������FileChannel
				FileChannel inChannel = new FileInputStream(f).getChannel(); //FileInputStream��ȡ��FileChannelֻ�ܶ���FileOutputStreamֻ��д

				// ���ļ����������FileBuffer�����Կ������
				FileChannel outChannel = new FileOutputStream("D:/a.txt").getChannel()) {

			// ��FileChannel���ȫ������ӳ���ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length()); // ��

			// ֱ�ӽ�buffer�������ȫ�����
			outChannel.write(buffer); // ��

			// �ٴε���buffer��clear()��������ԭlimit��position��λ��
			buffer.clear();

			
			
			
			
			// ʹ��GBK���ַ���������������
			Charset charset = Charset.forName("GBK");

			// ����������(CharsetDecoder)����
			CharsetDecoder decoder = charset.newDecoder();

			// ʹ�ý�������ByteBufferת����CharBuffer
			CharBuffer charBuffer = decoder.decode(buffer);

			// CharBuffer��toString�������Ի�ȡ��Ӧ���ַ���
			System.out.println(charBuffer);
			
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
