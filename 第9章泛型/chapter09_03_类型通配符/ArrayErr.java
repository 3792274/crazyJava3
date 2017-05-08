package chapter09_03_类型通配符;

import java.util.*;
/**
 * Description:
 * 泛型不继承。
 * 数组和泛型有所不同，假设Foo是Bar的一个子类型（子类或者子接口），那么Foo[]依然是Bar[]的子类型
 * 但是G<Foo>不是G<Bar>的子类型
 */
public class ArrayErr
{
	public static void main(String[] args)
	{
		// 定义一个Integer数组
		Integer[] ia = new Integer[5];
	
		// 可以把一个Integer[]数组赋给Number[]变量
		Number[] na = ia;
		
		// 下面代码编译正常，但运行时会引发ArrayStoreException异常
		// 因为0.5并不是Integer
		na[0] = 0.5;   // ①
	
		List<Integer> iList = new ArrayList<>();
		
		// 下面代码导致编译错误
//		List<Number> nList = iList;
	}
}
