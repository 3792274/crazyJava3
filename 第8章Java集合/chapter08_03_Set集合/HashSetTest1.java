package chapter08_03_Set集合;

import java.util.*;
/**
 * Description:HashSet 判断两个对象相等的标准，注意：equals&&hashCode都一样才行
 * 1.HashSet按Hash算法存储集合元素，具有很好的存取和查找性能。
 * 2.不能保证元素排列顺序
 * 3.不是同步的，如果多线程修改HashSet集合，需要通过代码保证同步
 * 3.集合元素可以为null
 * 
 * 4.如果要保存元素，元素的equals和hashCode要合理，否则引起性能问题
 */

// 类A的equals方法总是返回true，但没有重写其hashCode()方法
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
// 类B的hashCode()方法总是返回1，但没有重写其equals()方法，会使用链表式保存两个相同hashCode对象。
class B
{
	public int hashCode()
	{
		return 1;
	}
}
// 类C的hashCode()方法总是返回2，且重写其equals()方法总是返回true
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest1
{
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		
		// 分别向books集合中添加两个A对象，两个B对象，两个C对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
	
	
	//HashSet、TreeSet、EnumSet都是线程不安全的，通常通过Collections工具类的synchronizedSortedSet方法来包装
	SortedSet set= Collections.synchronizedSortedSet(new TreeSet());
	
	
	
	
	
	
	
	
}
