package chapter09_04_���ͷ���;


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
public class ErrorTest
{
	// ����һ�����ͷ������÷��ͷ����д�һ��T�����β�
	static <T> void test(Collection<T> from, Collection<T> to)
	{
		for (T ele : from)
		{
			to.add(ele);
		}
	}

	public static void main(String[] args)
	{
		List<Object> as = new ArrayList<>();
		List<String> ao = new ArrayList<>();
	
		// ������뽫����������������Ի�
//		test(as , ao);
	}
}


