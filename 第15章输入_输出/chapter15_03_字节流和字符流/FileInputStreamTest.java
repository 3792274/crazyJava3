package chapter15_03_字节流和字符流;

import java.io.*;

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
public class FileInputStreamTest {
	public static void main(String[] args) throws IOException {
		// 创建字节输入流
		FileInputStream fis = new FileInputStream("E:/电影/飞鹰艾迪.720p.HD韩版中字.mkv");
		// 创建一个长度为1024的“竹筒”
		byte[] bbuf = new byte[1024];
		// 用于保存实际读取的字节数
		int hasRead = 0;
 		
		// 使用循环来重复“取水”过程
		while ((hasRead = fis.read(bbuf)) > 0) {
			// 取出“竹筒”中水滴（字节），将字节数组转换成字符串输入！
		  	System.out.print(new String(bbuf, 0, hasRead));
		}
		// 关闭文件输入流，放在finally块里更安全
		fis.close();
	}
}
