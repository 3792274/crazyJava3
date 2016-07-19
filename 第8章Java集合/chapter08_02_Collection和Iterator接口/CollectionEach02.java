package chapter08_02_Collection和Iterator接口;

import java.util.Collection;
import java.util.HashSet;
/**
 * Description:
 * 
 * Java8，为Iterable接口增加了一个forEach(Consumer action)的默认方法
 * 所需参数为一个函数式接口。
  
default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
    
 * 
 */
public class CollectionEach02
{
	public static void main(String[] args)
	{
		// 创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		// 调用forEach()方法遍历集合
		books.forEach(obj -> System.out.println("迭代集合元素：" + obj));
	}
}
