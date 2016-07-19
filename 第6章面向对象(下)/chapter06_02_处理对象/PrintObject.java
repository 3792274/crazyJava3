package chapter06_02_处理对象;

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
class PersonX {
	private String name;

	public PersonX(String name) {
		this.name = name;
	}
}

public class PrintObject {
	public static void main(String[] args) {
		// 创建一个Person对象，将之赋给p变量
		PersonX p = new PersonX("孙悟空");
		// 打印p所引用的Person对象
		System.out.println(p);
	}
}
