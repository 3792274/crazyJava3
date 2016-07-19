package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 * 1.��Set�ӿ������� SortedSet--->TreeSet
 * 2.Map--->treeMap
 * 3.treeMap����һ����������ݽṹ��ÿ��key-value�Ժ����һ���ڵ㣬����key����
 * 4.��Ȼ����keyʵ��Comparable�ӿڣ�������ͬһ����
 * 5.�������򣬴���һ��Comparator����
 */
class R implements Comparable
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
	// ����count���ж����������Ƿ���ȡ�
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj != null	&& obj.getClass() == R.class)
		{
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	// ����count����ֵ���ж���������Ĵ�С��
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}
public class TreeMapTest
{
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(3) , "������Java EE��ҵӦ��ʵս");
		tm.put(new R(-5) , "���Java����");
		tm.put(new R(9) , "���Android����");
		System.out.println(tm);
	
		// ���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
		
		// ���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastKey());
		
		// ���ظ�TreeMap�ı�new R(2)�����Сkeyֵ��
		System.out.println(tm.higherKey(new R(2)));
		
		// ���ظ�TreeMap�ı�new R(2)С������key-value�ԡ�
		System.out.println(tm.lowerEntry(new R(2)));
	
		// ���ظ�TreeMap����TreeMap
		System.out.println(tm.subMap(new R(-1) , new R(4)));
	}
}
