package chapter08_08_操作集合的工具类Collections;


import java.util.*;
/**
 * Description:包装成线程同步的集合。
 */
public class SynchronizedTest
{
	public static void main(String[] args)
	{
		// 下面程序创建了四个线程安全的集合对象
		Collection c = Collections .synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}
}
