package chapter06_06_Java8改进的接口;

/**
 * Description:命令模式，使用实例 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

// 显示了，提供两种方法处理数组
public class CommandTest {
	
	public static void main(String[] args) {
		
		//数组处理类
		ProcessArray pa = new ProcessArray();
		int[] target = { 3, -4, 6, 4 };
	
		// 第一次处理数组，具体处理行为取决于PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("------------------");
		
		// 第二次处理数组，具体处理行为取决于AddCommand
		pa.process(target, new AddCommand());
	}
}
