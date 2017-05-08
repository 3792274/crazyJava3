package chapter08_04_List集合;


import java.util.*;
/**
 * Description:
 * 1.与Set只提供一个iterator()方法不同，List还额外提供了一个listIterator()方法，返回一个ListIterator对象
 * 2.ListIterator继承Iterator接口，额外提供
 * boolean hasPrevious() 返回迭代器集合是否还有上一个元素
 * Object previous()  返回上一个元素
 * void add(Object o) 在指定位置插入一个元素
 */
public class ListIteratorTest
{
	public static void main(String[] args)
	{
		String[] books = {
			"疯狂Java讲义", "疯狂iOS讲义",
			"轻量级Java EE企业应用实战"
		};
		
		List bookList = new ArrayList();
		for (int i = 0; i < books.length ; i++ )
		{
			bookList.add(books[i]);
		}
		
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------分隔符-------");  //添加分隔符。。。
		}
		
		System.out.println("=======下面开始反向迭代=======");
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
