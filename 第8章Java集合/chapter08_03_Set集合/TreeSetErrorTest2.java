package chapter08_03_Set集合;


import java.util.*;
/**
 * Description:
 * 添加到treeSet中的元素必须是同类型
 * 如果是程序员自定义类型，则可以添加多个不同的自定义类型，单必须实现compare接口
 *先compare对象，然后根据红黑树结构找到对象的存储位置。
 */
public class TreeSetErrorTest2
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		// 向TreeSet集合中添加两个对象
		ts.add(new String("疯狂Java讲义"));
		ts.add(new Date());   // ①
	}
}
