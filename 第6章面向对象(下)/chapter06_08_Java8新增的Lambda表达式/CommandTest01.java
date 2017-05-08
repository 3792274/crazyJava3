package chapter06_08_Java8新增的Lambda表达式;

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
public class CommandTest01 {
	public static void main(String[] args) {
		ProcessArray02 pa = new ProcessArray02();
		int[] array = { 3, -4, 6, 4 };
		// 处理数组，具体处理行为取决于匿名内部类
		pa.process(array, new Command() {
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int tmp : target) {
					sum += tmp;
				}
				System.out.println("数组元素的总和是:" + sum);
			}
		});
	}
}
