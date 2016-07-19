package chapter09_04_���ͷ���;


import java.util.*;
/**
 * Description:�趨ͨ������ޣ�����TreeSet�ࡣ
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MyUtils
{
	// ����dest����Ԫ�����ͱ�����src����Ԫ��������ͬ�������丸��
	public static <T> T copy(Collection<? super T> dest , Collection<T> src)
	{
		T last = null; //��ʡ������
		for (T ele  : src)
		{
			last = ele;
			dest.add(ele);
		}
		return last;
	}
	public static void main(String[] args)
	{
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		// �˴���׼ȷ��֪�����һ�������Ƶ�Ԫ����Integer����
		// ��src����Ԫ�ص�������ͬ
		Integer last = copy(ln , li);    // ��
		System.out.println(ln);
	}
}