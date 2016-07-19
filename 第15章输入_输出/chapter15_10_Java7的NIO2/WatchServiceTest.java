package chapter15_10_Java7��NIO2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

/**
 * Description:���C�̸�·���·����ı仯 <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class WatchServiceTest {
	public static void main(String[] args) throws Exception {
	
		// ��ȡ�ļ�ϵͳ��WatchService����
		WatchService watchService = FileSystems.getDefault().newWatchService();
	
		// ΪC:�̸�·��ע�����
		Paths.get("C:/").register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
	
		while (true) {
			// ��ȡ��һ���ļ��Ķ��¼�
			WatchKey key = watchService.take(); // ��������������ʹ��poll,���û�з���null
		
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println(event.context() + " �ļ������� " + event.kind() + "�¼���");
			}
			// ����WatchKey
			boolean valid = key.reset();
			// �������ʧ�ܣ��˳�����
			if (!valid) {
				break;
			}
		}
	}
}
