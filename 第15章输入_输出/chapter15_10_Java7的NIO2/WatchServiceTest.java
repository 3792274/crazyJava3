package chapter15_10_Java7的NIO2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

/**
 * Description:监控C盘根路径下发生的变化 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
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
	
		// 获取文件系统的WatchService对象
		WatchService watchService = FileSystems.getDefault().newWatchService();
	
		// 为C:盘根路径注册监听
		Paths.get("C:/").register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
	
		while (true) {
			// 获取下一个文件改动事件
			WatchKey key = watchService.take(); // ①阻塞。不阻塞使用poll,如果没有返回null
		
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println(event.context() + " 文件发生了 " + event.kind() + "事件！");
			}
			// 重设WatchKey
			boolean valid = key.reset();
			// 如果重设失败，退出监听
			if (!valid) {
				break;
			}
		}
	}
}
