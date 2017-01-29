package com.atguigu.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 * һ��ͨ����Channel��������Դ�ڵ���Ŀ��ڵ�����ӡ��� Java NIO �и��𻺳��������ݵĴ��䡣Channel �����洢���ݣ������Ҫ��ϻ��������д��䡣
 * 
 * ����ͨ������Ҫʵ����
 * 	java.nio.channels.Channel �ӿڣ�
 * 		|--FileChannel
 * 		|--SocketChannel
 * 		|--ServerSocketChannel
 * 		|--DatagramChannel
 * 
 * ������ȡͨ��
 * 1. Java ���֧��ͨ�������ṩ�� getChannel() ����
 * 		���� IO��
 * 		FileInputStream/FileOutputStream
 * 		RandomAccessFile
 * 
 * 		����IO��
 * 		Socket
 * 		ServerSocket
 * 		DatagramSocket
 * 		
 * 2. �� JDK 1.7 �е� NIO.2 ��Ը���ͨ���ṩ�˾�̬���� open()
 * 3. �� JDK 1.7 �е� NIO.2 �� Files ������� newByteChannel()
 * 
 * �ġ�ͨ��֮������ݴ���
 * transferFrom()
 * transferTo()
 * 
 * �塢��ɢ(Scatter)��ۼ�(Gather)
 * ��ɢ��ȡ��Scattering Reads������ͨ���е����ݷ�ɢ�������������
 * �ۼ�д�루Gathering Writes����������������е����ݾۼ���ͨ����
 * 
 * �����ַ�����Charset
 * ���룺�ַ��� -> �ֽ�����
 * ���룺�ֽ�����  -> �ַ���
 * 
 */
public class TestChannel {
	
	//�ַ���
	@Test
	public void test6() throws IOException{
		Charset cs1 = Charset.forName("GBK");
		
		//��ȡ������
		CharsetEncoder ce = cs1.newEncoder();
		
		//��ȡ������
		CharsetDecoder cd = cs1.newDecoder();
		
		CharBuffer cBuf = CharBuffer.allocate(1024);
		cBuf.put("�й�����䣡");
		cBuf.flip();
		
		//����
		ByteBuffer bBuf = ce.encode(cBuf);
		
		for (int i = 0; i < 12; i++) {
			System.out.println(bBuf.get());
		}
		
		//����
		bBuf.flip();
		CharBuffer cBuf2 = cd.decode(bBuf);
		System.out.println(cBuf2.toString());
		
		System.out.println("------------------------------------------------------");
		
		Charset cs2 = Charset.forName("GBK");
		bBuf.flip();
		CharBuffer cBuf3 = cs2.decode(bBuf);
		System.out.println(cBuf3.toString());
	}
	
	@Test
	public void test5(){
		Map<String, Charset> map = Charset.availableCharsets();
		
		Set<Entry<String, Charset>> set = map.entrySet();
		
		for (Entry<String, Charset> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
	
	//��ɢ�;ۼ�
	@Test
	public void test4() throws IOException{
		RandomAccessFile raf1 = new RandomAccessFile("1.txt", "rw");
		
		//1. ��ȡͨ��
		FileChannel channel1 = raf1.getChannel();
		
		//2. ����ָ����С�Ļ�����
		ByteBuffer buf1 = ByteBuffer.allocate(100);
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		
		//3. ��ɢ��ȡ
		ByteBuffer[] bufs = {buf1, buf2};
		channel1.read(bufs);
		
		for (ByteBuffer byteBuffer : bufs) {
			byteBuffer.flip();
		}
		
		System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
		System.out.println("-----------------");
		System.out.println(new String(bufs[1].array(), 0, bufs[1].limit()));
		
		//4. �ۼ�д��
		RandomAccessFile raf2 = new RandomAccessFile("2.txt", "rw");
		FileChannel channel2 = raf2.getChannel();
		
		channel2.write(bufs);
	}
	
	//ͨ��֮������ݴ���(ֱ�ӻ�����)
	@Test
	public void test3() throws IOException{
		FileChannel inChannel = FileChannel.open(Paths.get("d:/1.mkv"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("d:/2.mkv"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		
//		inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.transferFrom(inChannel, 0, inChannel.size());
		
		inChannel.close();
		outChannel.close();
	}
	
	//ʹ��ֱ�ӻ���������ļ��ĸ���(�ڴ�ӳ���ļ�)
	@Test
	public void test2() throws IOException{//2127-1902-1777
		long start = System.currentTimeMillis();
		
		FileChannel inChannel = FileChannel.open(Paths.get("d:/1.mkv"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("d:/2.mkv"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		
		//�ڴ�ӳ���ļ�
		MappedByteBuffer inMappedBuf = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outMappedBuf = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		
		//ֱ�ӶԻ������������ݵĶ�д����
		byte[] dst = new byte[inMappedBuf.limit()];
		inMappedBuf.get(dst);
		outMappedBuf.put(dst);
		
		inChannel.close();
		outChannel.close();
		
		long end = System.currentTimeMillis();
		System.out.println("�ķ�ʱ��Ϊ��" + (end - start));
	}
	
	//����ͨ������ļ��ĸ��ƣ���ֱ�ӻ�������
	@Test
	public void test1(){//10874-10953
		long start = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//�ٻ�ȡͨ��
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			fis = new FileInputStream("d:/1.mkv");
			fos = new FileOutputStream("d:/2.mkv");
			
			inChannel = fis.getChannel();
			outChannel = fos.getChannel();
			
			//�ڷ���ָ����С�Ļ�����
			ByteBuffer buf = ByteBuffer.allocate(1024);
			
			//�۽�ͨ���е����ݴ��뻺������
			while(inChannel.read(buf) != -1){
				buf.flip(); //�л���ȡ���ݵ�ģʽ
				//�ܽ��������е�����д��ͨ����
				outChannel.write(buf);
				buf.clear(); //��ջ�����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(outChannel != null){
				try {
					outChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(inChannel != null){
				try {
					inChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("�ķ�ʱ��Ϊ��" + (end - start));
		
	}

}
