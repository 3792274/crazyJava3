package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 * 1.HashTable:��ʱ�ģ��̰߳�ȫ��������null��Ϊkey ��value
 * 2.HashMap,�̲߳���ȫ�ģ�����nullΪkey �� Value��Ԫ��key�����ظ���set
 * 3.������дhashCode/equal
 */
public class NullInHashMap
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		
		// ��ͼ������keyΪnull��key-value�Է���HashMap��
		hm.put(null , null);
		hm.put(null , null);    // ��
		
		// ��һ��valueΪnull��key-value�Է���HashMap��
		hm.put("a" , null);    // ��
		
		// ���Map����
		System.out.println(hm);
	}
}
