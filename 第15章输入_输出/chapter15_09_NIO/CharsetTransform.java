package chapter15_09_NIO;

import java.nio.*;
import java.nio.charset.*;
import java.util.Arrays;

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
public class CharsetTransform {
	public static void main(String[] args) throws Exception {
		
		//String 中getByte(String charset)方法也是返回bute[]使用指定的字符集将指定的字符串转换成字节序列。
		System.out.println(Arrays.toString("孙悟空".getBytes("utf-8")));
		
		//如果仅是需要编码解码操作，无需创建CharsetEncoding、CharsetDecoding对象
		ByteBuffer byteBuffer = Charset.forName("GBK").encode(CharBuffer.wrap("孙悟空".toCharArray()));
		CharBuffer charBuffer =  Charset.forName("GBK").decode(byteBuffer);
		System.out.println(Arrays.toString(byteBuffer.array())+":"+charBuffer);
		
		
		
		
		// 创建简体中文对应的Charset
		Charset cn = Charset.forName("GBK");
		
		// 获取cn对象对应的编码器和解码器
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();
		
		// 创建一个CharBuffer对象
		CharBuffer cbuff = CharBuffer.allocate(8);
		
		cbuff.put('孙');
		cbuff.put('悟');
		cbuff.put('空');
		cbuff.put('刚');
		cbuff.flip();
		
		// 将CharBuffer中的字符序列转换成字节序列
		ByteBuffer bbuff = cnEncoder.encode(cbuff);
		
		// 循环访问ByteBuffer中的每个字节
		for (int i = 0; i < bbuff.capacity(); i++) {
			System.out.print(bbuff.get(i) + " ");
		}
		
		// 将ByteBuffer的数据解码成字符序列
		System.out.println("\n" + cnDecoder.decode(bbuff));
	}
}
