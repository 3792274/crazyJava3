package chapter09_03_����ͨ���;

import java.util.*;
/**
 * Description:
 * ���Ͳ��̳С�
 * ����ͷ���������ͬ������Foo��Bar��һ�������ͣ���������ӽӿڣ�����ôFoo[]��Ȼ��Bar[]��������
 * ����G<Foo>����G<Bar>��������
 */
public class ArrayErr
{
	public static void main(String[] args)
	{
		// ����һ��Integer����
		Integer[] ia = new Integer[5];
	
		// ���԰�һ��Integer[]���鸳��Number[]����
		Number[] na = ia;
		
		// ����������������������ʱ������ArrayStoreException�쳣
		// ��Ϊ0.5������Integer
		na[0] = 0.5;   // ��
	
		List<Integer> iList = new ArrayList<>();
		
		// ������뵼�±������
//		List<Number> nList = iList;
	}
}
