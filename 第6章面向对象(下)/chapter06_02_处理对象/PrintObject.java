package chapter06_02_�������;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
		// ����һ��Person���󣬽�֮����p����
		PersonX p = new PersonX("�����");
		// ��ӡp�����õ�Person����
		System.out.println(p);
	}
}
