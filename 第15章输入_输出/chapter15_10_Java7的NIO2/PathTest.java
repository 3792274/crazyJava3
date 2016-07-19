package chapter15_10_Java7��NIO2;

import java.io.*;
import java.net.*;
import java.nio.file.*;

/**
 * Description: Paths �����࣬path��ƽ̨�޹ص�ƽ̨·����<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class PathTest {
	public static void main(String[] args) throws Exception {
		// �Ե�ǰ·��������Path����
		Path path = Paths.get(".");
		System.out.println("path�������·��������" + path.getNameCount());
		System.out.println("path�ĸ�·����" + path.getRoot());
		
		// ��ȡpath��Ӧ�ľ���·����
		Path absolutePath = path.toAbsolutePath();
		System.out.println(absolutePath);
		
		// ��ȡ����·���ĸ�·��
		System.out.println("absolutePath�ĸ�·����" + absolutePath.getRoot());
		
		// ��ȡ����·����������·������
		System.out.println("absolutePath�������·��������" + absolutePath.getNameCount());
		System.out.println(absolutePath.getName(3));
		
		// �Զ��String������Path����
		Path path2 = Paths.get("g:", "publish", "codes");
		System.out.println(path2);
	}
}
