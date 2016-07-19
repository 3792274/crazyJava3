package chapter15_10_Java7��NIO2;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.attribute.*;

/**
 * Description:��ȡ�޸��ļ������ԡ� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AttributeViewTest {
	public static void main(String[] args) throws Exception {
		
		// ��ȡ��Ҫ�������ļ�
		Path testPath = Paths.get("D:/a.txt");
		
		// ��ȡ���ʻ������Ե�BasicFileAttributeView
		BasicFileAttributeView basicView = Files.getFileAttributeView(testPath, BasicFileAttributeView.class);
		
		// ��ȡ���ʻ������Ե�BasicFileAttributes
		BasicFileAttributes basicAttribs = basicView.readAttributes();
		
		// �����ļ��Ļ�������
		System.out.println("����ʱ�䣺" + new Date(basicAttribs.creationTime().toMillis()));
		System.out.println("������ʱ�䣺" + new Date(basicAttribs.lastAccessTime().toMillis()));
		System.out.println("����޸�ʱ�䣺" + new Date(basicAttribs.lastModifiedTime().toMillis()));
		System.out.println("�ļ���С��" + basicAttribs.size());
		
		// ��ȡ�����ļ�������Ϣ��FileOwnerAttributeView
		FileOwnerAttributeView ownerView = Files.getFileAttributeView(testPath, FileOwnerAttributeView.class);
		
		// ��ȡ���ļ��������û�
		System.out.println(ownerView.getOwner());
		
		// ��ȡϵͳ��guest��Ӧ���û�
		UserPrincipal user = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("guest");
		
		// �޸��û�
		ownerView.setOwner(user);
	
		// ��ȡ�����Զ������Ե�FileOwnerAttributeView
		UserDefinedFileAttributeView userView = Files.getFileAttributeView(testPath, UserDefinedFileAttributeView.class);
		List<String> attrNames = userView.list();
		
		// �������е��Զ�������
		for (String name : attrNames) {
			ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
			userView.read(name, buf);
			buf.flip();
			String value = Charset.defaultCharset().decode(buf).toString();
			System.out.println(name + "--->" + value);
		}
	
		// ���һ���Զ�������
		userView.write("������", Charset.defaultCharset().encode("���Java����"));
		
		// ��ȡ����DOS���Ե�DosFileAttributeView
		DosFileAttributeView dosView = Files.getFileAttributeView(testPath, DosFileAttributeView.class);
		
		// ���ļ��������ء�ֻ��
		dosView.setHidden(true);
		dosView.setReadOnly(true);
	}
}