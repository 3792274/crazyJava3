package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
import java.util.function.*;

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
public class PredicateTest8 {
	public static void main(String[] args) {
		// ����books���ϡ�Ϊbooks�������Ԫ�صĴ�����ǰһ��������ͬ��
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));

		// ͳ����������������Ӵ���ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).contains("���")));

		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
	
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).length() > 10));
	}

	public static int calAll(Collection books, Predicate p) {
		int total = 0;
		for (Object obj : books) {
			// ʹ��Predicate��test()�����жϸö����Ƿ�����Predicateָ��������
			if (p.test(obj)) {
				total++;
			}
		}
		return total;
	}

}
