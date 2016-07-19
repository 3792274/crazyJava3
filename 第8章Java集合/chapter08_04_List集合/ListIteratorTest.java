package chapter08_04_List����;


import java.util.*;
/**
 * Description:
 * 1.��Setֻ�ṩһ��iterator()������ͬ��List�������ṩ��һ��listIterator()����������һ��ListIterator����
 * 2.ListIterator�̳�Iterator�ӿڣ������ṩ
 * boolean hasPrevious() ���ص����������Ƿ�����һ��Ԫ��
 * Object previous()  ������һ��Ԫ��
 * void add(Object o) ��ָ��λ�ò���һ��Ԫ��
 */
public class ListIteratorTest
{
	public static void main(String[] args)
	{
		String[] books = {
			"���Java����", "���iOS����",
			"������Java EE��ҵӦ��ʵս"
		};
		
		List bookList = new ArrayList();
		for (int i = 0; i < books.length ; i++ )
		{
			bookList.add(books[i]);
		}
		
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------�ָ���-------");  //��ӷָ���������
		}
		
		System.out.println("=======���濪ʼ�������=======");
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
