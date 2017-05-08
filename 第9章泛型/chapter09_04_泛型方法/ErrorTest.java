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
public class ErrorTest
{
	// 声明一个泛型方法，该泛型方法中带一个T类型形参
	static <T> void test(Collection<T> from, Collection<T> to)
	{
		for (T ele : from)
		{
			to.add(ele);
		}
	}

	public static void main(String[] args)
	{
		List<Object> as = new ArrayList<>();
		List<String> ao = new ArrayList<>();
	
		// 下面代码将产生编译错误，类型迷惑。
//		test(as , ao);
	}
}


