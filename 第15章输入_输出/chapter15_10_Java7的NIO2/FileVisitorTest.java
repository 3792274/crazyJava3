package chapter15_10_Java7��NIO2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

/**
 * Description: �����ļ���Ŀ¼��<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
		// ����g:\publish\codes\15Ŀ¼�µ������ļ�����Ŀ¼
		Path path = Files.walkFileTree(Paths.get("F:", "workspace","01","���Java���壨��3�棩","��15������_���"), new SimpleFileVisitor<Path>() {
			// �����ļ�ʱ�򴥷��÷���
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				System.err.println("���ڷ����ļ���" + file + "�ļ�");
				// �ҵ���FileInputStreamTest.java�ļ�
				if (file.endsWith("FileInputStreamTest.java")) {
					System.err.println("--�Ѿ��ҵ�Ŀ���ļ�--");
					return FileVisitResult.TERMINATE;  //��ֹ����ķ�����Ϊ
				}
				return FileVisitResult.CONTINUE;
			}

			// ��ʼ����Ŀ¼ʱ�����÷���
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				System.out.println("���ڷ���Ŀ¼��" + dir + " ·��");
				return FileVisitResult.CONTINUE;
			}
		});
	
	
		
		System.out.println("Files.walkFileTree()��������ֵ�� "+path);
	
	}
}
