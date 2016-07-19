package chapter08_03_Set����;

import java.util.*;
/**
 * Description:
 * 1.TreeSet��SortedSet�ӿڵ�ʵ���࣬����ȷ������Ԫ�ش�������״̬��
 * 2.�ṩ��Щ��������Ϊ������ģ������˷��ʵ�һ����ǰһ������һ�������һ����
 * ���ṩ3����ȡ
 * 4.�����Ǹ���Ԫ�صĲ���˳�������Ǹ���Ԫ�ش�С����
 */
public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		// ��TreeSet������ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		// �������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		// ���������ĵ�һ��Ԫ��
		System.out.println(nums.first()); // ���-9
		// �������������һ��Ԫ��
		System.out.println(nums.last());  // ���10
		// ����С��4���Ӽ���������4
		System.out.println(nums.headSet(4)); // ���[-9, 2]
		// ���ش���5���Ӽ������Set�а���5���Ӽ��л�����5
		System.out.println(nums.tailSet(5)); // ��� [5, 10]
		// ���ش��ڵ���-3��С��4���Ӽ���
		System.out.println(nums.subSet(-3 , 4)); // ���[2]
	}
}
