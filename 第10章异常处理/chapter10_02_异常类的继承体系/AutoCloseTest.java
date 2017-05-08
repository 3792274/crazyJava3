package chapter10_02_异常类的继承体系;

import java.io.*;

/**
 * Description:java7新增的自动关闭资源。
 * 1.要自动关闭的这些资源必须实现AutoCloseable或Closeable接口，实现这两个接口必须实现close()方法。
 * 2.Closeable是AutoCloseable的子接口，抛出IOException
 * 3.AutoCloseable，抛出Exception
 * 4.java7重写了大部分的资源需要关闭的类。也可以catch finally等。
 * 
 */
public class AutoCloseTest {
	public static void main(String[] args) throws IOException {
		try (
				// 声明、初始化两个可关闭的资源
				// try语句会自动关闭这两个资源。
				BufferedReader br = new BufferedReader(new FileReader("第10章异常处理\\chapter10_02_异常类的继承体系\\A0utoCloseTest.java")); 
				PrintStream ps = new PrintStream(new FileOutputStream("第10章异常处理\\chapter10_02_异常类的继承体系\\a.txt"))) {
			// 使用两个资源
			System.out.println(br.readLine());
			ps.println("庄生晓梦迷蝴蝶");
		} 
	}
	
	
	
}
