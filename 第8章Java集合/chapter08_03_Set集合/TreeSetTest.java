package chapter08_03_Set集合;

import java.util.*;
/**
 * Description:
 * 1.TreeSet是SortedSet接口的实现类，可以确保集合元素处于排序状态。
 * 2.提供了些方法，因为是有序的，增加了访问第一个、前一个、后一个、最后一个，
 * 并提供3个截取
 * 4.并不是根据元素的插入顺序排序，是根据元素大小排序。
 */
public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		// 向TreeSet中添加四个Integer对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		// 输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		// 输出集合里的第一个元素
		System.out.println(nums.first()); // 输出-9
		// 输出集合里的最后一个元素
		System.out.println(nums.last());  // 输出10
		// 返回小于4的子集，不包含4
		System.out.println(nums.headSet(4)); // 输出[-9, 2]
		// 返回大于5的子集，如果Set中包含5，子集中还包含5
		System.out.println(nums.tailSet(5)); // 输出 [5, 10]
		// 返回大于等于-3，小于4的子集。
		System.out.println(nums.subSet(-3 , 4)); // 输出[2]
	}
}
