package chapter08_04_List集合;

import java.util.*;

/**
 * Description: List是Collection接口的子接口
 * 1.List代表一个元素有序、可重复的集合，都有索引
 * 2.java8改进的List接口和ListIterator接口
 * 3.java8新增加void replaceAll(UnaryOperator operator) 根据指定规则重新设置List集合的所有元素
 *           void  sort(Comparator c)           根据Comparator参数对List集合的元素排序，可以用lambda作为参数
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		List books = new ArrayList();
	
		// 向books集合中添加三个元素
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂Android讲义"));
		System.out.println(books);
		
		// 将新字符串对象插入在第二个位置
		books.add(1, new String("疯狂Ajax讲义"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		
		// 删除第三个元素
		books.remove(2);
		System.out.println(books);
		// 判断指定元素在List集合中位置：输出1，表明位于第二位，创建的是新的字符串，list中并没有，但可以返回说明对比方法为equals
		System.out.println(books.indexOf(new String("疯狂Ajax讲义"))); // ①
		// 将第二个元素替换成新的字符串对象
		books.set(1, new String("疯狂Java讲义"));
		System.out.println(books);
		// 将books集合的第二个元素（包括）
		// 到第三个元素（不包括）截取成子集合
		System.out.println(books.subList(1, 2));
	}
}