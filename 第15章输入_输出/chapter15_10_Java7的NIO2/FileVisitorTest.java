package chapter15_10_Java7的NIO2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

/**
 * Description: 遍历文件和目录。<br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FileVisitorTest {
	public static void main(String[] args) throws Exception {
		// 遍历g:\publish\codes\15目录下的所有文件和子目录
		Path path = Files.walkFileTree(Paths.get("F:", "workspace","01","疯狂Java讲义（第3版）","第15章输入_输出"), new SimpleFileVisitor<Path>() {
			// 访问文件时候触发该方法
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				System.err.println("正在访问文件：" + file + "文件");
				// 找到了FileInputStreamTest.java文件
				if (file.endsWith("FileInputStreamTest.java")) {
					System.err.println("--已经找到目标文件--");
					return FileVisitResult.TERMINATE;  //终止后序的访问行为
				}
				return FileVisitResult.CONTINUE;
			}

			// 开始访问目录时触发该方法
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				System.out.println("正在访问目录：" + dir + " 路径");
				return FileVisitResult.CONTINUE;
			}
		});
	
	
		
		System.out.println("Files.walkFileTree()方法返回值： "+path);
	
	}
}
