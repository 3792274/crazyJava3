package chapter08_08_�������ϵĹ�����Collections;


import java.util.*;
/**
 * Description:
 * �Լ���Ԫ�ؽ������򡢲�ѯ���޸�
 * �����϶�������Ϊ���ɱ䡢
 * �Լ��϶���ʵ��ͬ�����Ƶȷ���
 * 
 * 
 * 1.void reverse(List) ��תָ��List������Ԫ�ص�˳��
 * 2.void shuffle(List) ��List�����������(ϴ��)
 * 3.void sort(List)    ����Ȼ��������
 * 4.void sort(List,Comparator) ����comparator������˳���List����Ԫ�ؽ�������
 * 5.void swap(List,int i,int j ) �������е�Ԫ��i,j��Ԫ�أ����н�����
 * 6.void rotate(List,int distance)��distanceΪ����ʱ����list���ϵĺ�distance��Ԫ�������Ƶ�ǰ�棻��Ϊ���������Ƶ����棬���ܸı伯�ϳ��ȡ�
 */
public class SortTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
	
		System.out.println(nums); // ���:[2, -5, 3, 0]
		
		Collections.reverse(nums); // ��List����Ԫ�صĴ���ת
		System.out.println(nums); // ���:[0, 3, -5, 2]
	
		Collections.sort(nums); // ��List����Ԫ�صİ���Ȼ˳������
		System.out.println(nums); // ���:[-5, 0, 2, 3]
		
		Collections.shuffle(nums); // ��List����Ԫ�صİ����˳������
		System.out.println(nums); // ÿ������Ĵ��򲻹̶�
	}
}
