package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 1.与Set接口派生的 SortedSet--->TreeSet
 * 2.Map--->treeMap
 * 3.treeMap就是一个红黑树数据结构，每个key-value对红黑树一个节点，根据key排序
 * 4.自然排序，key实现Comparable接口，都属于同一个类
 * 5.定制排序，传入一个Comparator对象。
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
	// 根据count来判断两个对象是否相等。
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
	// 根据count属性值来判断两个对象的大小。
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
		tm.put(new R(3) , "轻量级Java EE企业应用实战");
		tm.put(new R(-5) , "疯狂Java讲义");
		tm.put(new R(9) , "疯狂Android讲义");
		System.out.println(tm);
	
		// 返回该TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
		
		// 返回该TreeMap的最后一个key值
		System.out.println(tm.lastKey());
		
		// 返回该TreeMap的比new R(2)大的最小key值。
		System.out.println(tm.higherKey(new R(2)));
		
		// 返回该TreeMap的比new R(2)小的最大的key-value对。
		System.out.println(tm.lowerEntry(new R(2)));
	
		// 返回该TreeMap的子TreeMap
		System.out.println(tm.subMap(new R(-1) , new R(4)));
	}
}
