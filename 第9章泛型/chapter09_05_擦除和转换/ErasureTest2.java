package chapter09_05_������ת��;


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
public class ErasureTest2
{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li;
	
		// �����������δ������ת�����ľ��棬���롢����ʱ��ȫ����
		List<String> ls = list;     // ��
		
		// ��ֻҪ����ls���Ԫ�أ���������뽫��������ʱ�쳣��
		System.out.println(ls.get(0));
	}
}
