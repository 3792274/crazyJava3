package chapter08_02_Collection和Iterator接口;

import java.util.*;
import java.util.function.*;
/**
 * Description:java8新增的Predicate操作集合。
 * Collection.removeIf(Predicate)
 * 
default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        final Iterator<E> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }
    
    
 */
public class PredicateTest7
{
	public static void main(String[] args)
	{
		// 创建一个集合
		Collection books = new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂iOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		// 使用Lambda表达式（目标类型是Predicate）过滤集合
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}
}
