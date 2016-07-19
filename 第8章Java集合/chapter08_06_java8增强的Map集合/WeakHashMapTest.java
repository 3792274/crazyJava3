package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 1.同HashMap基本类似，HashMap对key保存对对象的强引用，WeakHashMap保存对对象的弱引用。
 * 2.在垃圾回收对象之后，WeakHashMap会自动删除key对应的key-value
 */
public class WeakHashMapTest
{
	public static void main(String[] args)
	{
		WeakHashMap whm = new WeakHashMap();
		
		// 将WeakHashMap中添加三个key-value对，
		// 三个key都是匿名字符串对象（没有其他引用）
		whm.put(new String("语文") , new String("良好"));
		whm.put(new String("数学") , new String("及格"));
		whm.put(new String("英文") , new String("中等"));
		
		//将 WeakHashMap中添加一个key-value对，
		// 该key是一个系统缓存的字符串对象。
		whm.put("java" , new String("中等"));    // ①
		
		// 输出whm对象，将看到4个key-value对。
		System.out.println(whm);
		
		
		// 通知系统立即进行垃圾回收
		System.gc();
		System.runFinalization();
		
		// 通常情况下，将只看到一个key-value对。
		System.out.println(whm);
	}
}
