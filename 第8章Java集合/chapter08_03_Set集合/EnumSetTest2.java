package chapter08_03_Set����;


import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class EnumSetTest2
{
	public static void main(String[] args)
	{
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		// ����Collection����������Ԫ��������EnumSet����
		EnumSet enumSet = EnumSet.copyOf(c);   // ��
		System.out.println(enumSet); // ���[SPRING,FALL]
		c.add("���Java����");
		c.add("������Java EE��ҵӦ��ʵս");
		// �����������쳣����Ϊc�������Ԫ�ز���ȫ����Ϊö��ֵ
		enumSet = EnumSet.copyOf(c);  // ��
	}
}
