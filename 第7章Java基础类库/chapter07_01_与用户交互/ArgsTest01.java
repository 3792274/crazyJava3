package chapter07_01_���û�����;

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
public class ArgsTest01 {
	public static void main(String... args) {
		// ���args����ĳ���
		System.out.println(args.length);
		// ����args�����ÿ��Ԫ��
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
