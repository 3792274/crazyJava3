package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 1.HashTable:过时的，线程安全，不允许null作为key 和value
 * 2.HashMap,线程不安全的，允许null为key 和 Value，元素key不能重复，set
 * 3.必须重写hashCode/equal
 */
public class NullInHashMap
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		
		// 试图将两个key为null的key-value对放入HashMap中
		hm.put(null , null);
		hm.put(null , null);    // ①
		
		// 将一个value为null的key-value对放入HashMap中
		hm.put("a" , null);    // ②
		
		// 输出Map对象
		System.out.println(hm);
	}
}
