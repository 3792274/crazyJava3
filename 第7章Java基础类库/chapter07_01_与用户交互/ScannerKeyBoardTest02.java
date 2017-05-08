package chapter07_01_与用户交互;

import java.util.*;

/**
 * Description:Scanner 是基于正则表达式的扫描器，接收文本，输入流，字符串作为数据源。 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ScannerKeyBoardTest02 {
	public static void main(String[] args) {
		// System.in代表标准输入，就是键盘输入
		Scanner sc = new Scanner(System.in);

		// 增加下面一行将只把回车作为分隔符
		//  sc.useDelimiter("\n");

		// 判断是否还有下一个输入项,有可能阻塞
		while (sc.hasNext()) {
			// 输出输入项
			System.out.println("键盘输入的内容是：" + sc.next());
		}
	}
}
