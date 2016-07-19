package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
/**
 * Description:
 * Java8 ��ǿ��Iterator��������Ԫ��
 */
public class IteratorTest03
{
	public static void main(String[] args)
	{
		// �������ϡ����Ԫ�صĴ�����ǰһ��������ͬ
		Collection books = new HashSet();
	
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
	
		while(it.hasNext())
		{
			// it.next()�������ص�����������Object���ͣ������Ҫǿ������ת��
			String book = (String)it.next();
			System.out.println(book);
			
			if (book.equals("���Java����"))
			{
				// �Ӽ�����ɾ����һ��next�������ص�Ԫ��
				it.remove();
			}
			// ��book������ֵ������ı伯��Ԫ�ر���Iterator�����Ѽ���Ԫ�ر����ݸ��������������ǰ�ֵ���ݸ�������
			book = "�����ַ���";   //��
		}
		
		System.out.println(books);
	}
}
