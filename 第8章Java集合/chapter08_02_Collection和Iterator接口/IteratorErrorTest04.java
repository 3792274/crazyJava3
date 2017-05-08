package chapter08_02_Collection和Iterator接口;

import java.util.*;

/**
 * Description:
 */
public class IteratorErrorTest04 {
	public static void main(String[] args) {
		// 创建集合、添加元素的代码与前一个程序相同
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("疯狂Android讲义")) {
				// 使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常，
				//如果上面删除的是 疯狂Java讲义，则不会发生异常，这是由于HashSet/ArrayList内部代码实现的，删除特定元素才有异常。
				books.remove(book);
			}
		}
	}
}
