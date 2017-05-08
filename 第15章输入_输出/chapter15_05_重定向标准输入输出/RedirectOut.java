package chapter15_05_重定向标准输入输出;

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
public class RedirectOut {
	public static void main(String[] args) {
		try (
				// 一次性创建PrintStream输出流
				PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))) {
			// 将标准输出重定向到ps输出流
			System.setOut(ps);
			// 向标准输出输出一个字符串
			System.out.println("普通字符串");
			// 向标准输出输出一个对象
			System.out.println(new RedirectOut());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
