package chapter08_03_Set����;

import java.util.*;
/**
 * Description:
 * 1.LinkedHashSet ��HashSet������
 * 2.�ڲ�ʹ������ά��Ԫ�صĴ���
 * 3.������Ҫά��Ԫ�صĲ���˳����������Ե���HashSet,���ڵ�������Set���ȫ��Ԫ��ʱ�и��õ����ܡ�
 * 4.��������Ԫ���ظ���
 */
public class LinkedHashSetTest3
{
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		
		System.out.println(books);
		
		// ɾ�� ���Java����
		books.remove("���Java����");
		
		// ������� ���Java����
		books.add("���Java����");
		
		System.out.println(books);
	}
}
