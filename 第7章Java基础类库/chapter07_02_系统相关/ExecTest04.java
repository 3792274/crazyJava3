package chapter07_02_系统相关;

import com.sun.glass.ui.TouchInputSupport;

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
public class ExecTest04 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();
		// 运行记事本程序，单独启动一个进程运行操作系统命令
		rt.exec("notepad.exe");
	}
}
