package chapter07_04_java8������ʱ����;

import java.util.*;

/**
 * Description: �Ƽ�ʹ��Calendar�࣬��ʹ��Date<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class DateTest01 {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		// ��ȡ��ǰʱ��֮��100ms��ʱ��
		Date d2 = new Date(System.currentTimeMillis() + 100L);
		
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}
