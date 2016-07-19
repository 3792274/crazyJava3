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
class R
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}

public class HashSetTest2
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		
		// ��ӡHashSet���ϣ�����Ԫ��û���ظ�
		System.out.println(hs);
		
		// ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R first = (R)it.next();
		
		// Ϊ��һ��Ԫ�ص�countʵ��������ֵ
		first.count = -3;     // ��
		
		// �ٴ����HashSet���ϣ�����Ԫ�����ظ�Ԫ��
		System.out.println(hs);
		
		// ɾ��countΪ-3��R����
		hs.remove(new R(-3));    // ��
		
		// ���Կ�����ɾ����һ��RԪ��
		System.out.println(hs);
		System.out.println("hs�Ƿ����countΪ-3��R����"+ hs.contains(new R(-3))); // ���false
		System.out.println("hs�Ƿ����countΪ-2��R����"+ hs.contains(new R(-2))); // ���false
	}
}