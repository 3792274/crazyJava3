package chapter04_05_��������;

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
public class ForEachTest {
	public static void main(String[] args) {
		String[] books = { "������Java EE��ҵӦ��ʵս", "���Java����", "���Android����" };
		// ʹ��foreachѭ������������Ԫ�أ�
		// ����book�����Զ�����ÿ������Ԫ��
		for (String book : books) {
			System.out.println(book);
		}
	}
}
