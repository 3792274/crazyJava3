package chapter08_02_Collection和Iterator接口;

import java.util.*;
/**
 * Description:Java5提供的新方法
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ForeachTest06
{
	public static void main(String[] args)
	{
		// 创建集合、添加元素的代码与前一个程序相同
		Collection books = new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));
		for (Object obj : books)
		{
			// 此处的book变量也不是集合元素本身
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("疯狂Android讲义"))
			{
				// 下面代码会引发ConcurrentModificationException异常
				books.remove(book);     //①
			}
		}
		System.out.println(books);
	}
}
