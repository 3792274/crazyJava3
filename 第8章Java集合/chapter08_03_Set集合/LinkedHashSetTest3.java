package chapter08_03_Set集合;

import java.util.*;
/**
 * Description:
 * 1.LinkedHashSet 是HashSet的子类
 * 2.内部使用链表维护元素的次序
 * 3.由于需要维护元素的插入顺序，因此性能略低于HashSet,但在迭代访问Set里的全部元素时有更好的性能。
 * 4.不允许集合元素重复。
 */
public class LinkedHashSetTest3
{
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("疯狂Java讲义");
		books.add("轻量级Java EE企业应用实战");
		
		System.out.println(books);
		
		// 删除 疯狂Java讲义
		books.remove("疯狂Java讲义");
		
		// 重新添加 疯狂Java讲义
		books.add("疯狂Java讲义");
		
		System.out.println(books);
	}
}
