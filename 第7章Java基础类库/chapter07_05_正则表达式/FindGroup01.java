package chapter07_05_������ʽ;

import java.util.regex.*;

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
public class FindGroup01 {
	public static void main(String[] args) {
		// ʹ���ַ���ģ��������ϵõ�����ҳԴ��
		String str = "������һ�������Java���塷��������ϵ��13500006666" + "�����ѣ��绰������13611125565" + "���۶��ֵ��ԣ���ϵ��ʽ15899903312";
		// ����һ��Pattern���󣬲���������һ��Matcher����
		// ��������ʽֻץȡ13X��15X�ε��ֻ��ţ�
		// ʵ��Ҫץȡ��Щ�绰���룬ֻҪ�޸�������ʽ���ɡ�
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		// �����з���������ʽ���Ӵ����绰���룩ȫ�����
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
