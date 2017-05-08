package chapter03_07_运算符;

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
public class EnhanceAssignTest {
	public static void main(String[] args) {
		// 定义一个byte类型的变量
		byte a = 5;
		// 下面语句出错，因为5默认是int类型，a + 5就是int类型。
		// 把int类型赋给byte类型的变量，所以出错
		// a = a + 5;
		// 定义一个byte类型的变量
		byte b = 5;
		// 下面语句不会出现错误,运算符经过优化处理。
		b += 5;
	}
}
