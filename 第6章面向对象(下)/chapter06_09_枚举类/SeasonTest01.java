package chapter06_09_ö����;

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
public class SeasonTest01 {
	
	 
	public SeasonTest01(Season01 s) {
		System.out.println(s.getName() + "��������һ��" + s.getDesc() + "�ļ���");
	}

	
	
	public static void main(String[] args) {
		// ֱ��ʹ��Season��FALL��������һ��Season����
		
		
		new SeasonTest01(Season01.FALL);
	}
}
