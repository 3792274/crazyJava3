package chapter09_04_泛型方法;


import java.util.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class GenericMethodTest
{
	
	// 声明一个泛型方法，该泛型方法中带一个T类型形参，
	//使用Collection<?>不可行，因为java不允许把对象放进一个未知类型的集合中。
	static <T> void fromArrayToCollection(T[] a, Collection<T> c)
	{
		for (T o : a)
		{
			c.add(o);
		}
	}
	
	
	public static void main(String[] args)
	{
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		
		// 下面代码中T代表Object类型
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		// 下面代码中T代表String类型
		fromArrayToCollection(sa, cs);
	
		// 下面代码中T代表Object类型
		fromArrayToCollection(sa, co);
	
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<>();
		
		// 下面代码中T代表Number类型
		fromArrayToCollection(ia, cn);
		// 下面代码中T代表Number类型
		fromArrayToCollection(fa, cn);
		// 下面代码中T代表Number类型
		fromArrayToCollection(na, cn);
		// 下面代码中T代表Object类型
		fromArrayToCollection(na, co);
		// 下面代码中T代表String类型，但na是一个Number数组，
		// 因为Number既不是String类型，
		// 也不是它的子类，所以出现编译错误
//		fromArrayToCollection(na, cs);

		
	
		
	
	
	}
}

