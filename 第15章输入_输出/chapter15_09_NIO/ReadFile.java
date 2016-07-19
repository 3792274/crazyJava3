package chapter15_09_NIO;


import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
/**
 * Description:ʹ�ô�ͳ��Channel��Buffer,����Ͳ���ȡˮ������ļ�����һ���Լ����ڴ��������ܵ��¡�
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ReadFile
{
	public static void main(String[] args)
		throws IOException
	{
		try(
			// �����ļ�������
			FileInputStream fis = new FileInputStream("D:/a.txt");
			// ����һ��FileChannel
			FileChannel fcin = fis.getChannel())
		{
			// ����һ��ByteBuffer���������ظ�ȡˮ
			ByteBuffer bbuff = ByteBuffer.allocate(256);
			// ��FileChannel�����ݷ���ByteBuffer��
			while( fcin.read(bbuff) != -1 )
			{
				// ����Buffer�Ŀհ���
				bbuff.flip();
				// ����Charset����->����������(CharsetDecoder)����
				CharsetDecoder decoder = Charset.forName("GBK").newDecoder();
				
				// ��ByteBuffer������ת��
				CharBuffer cbuff = decoder.decode(bbuff);
			
				System.out.print(cbuff);
				
				// ��Buffer��ʼ����Ϊ��һ�ζ�ȡ������׼��
				bbuff.clear();
			}
		}
	}
}
