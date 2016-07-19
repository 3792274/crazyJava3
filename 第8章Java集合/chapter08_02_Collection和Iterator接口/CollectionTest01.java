package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
/**
 * Description:
 * Collection
 * 1.Set ���򣬲����ظ�
 * 2.List ���򣬿��ظ�
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CollectionTest01
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		
		// ���Ԫ��
		c.add("�����");
		
		// ��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size()); // ���2
		
		// ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size()); // ���1
		
		// �ж��Ƿ����ָ���ַ���
		System.out.println("c���ϵ��Ƿ����\"�����\"�ַ���:" + c.contains("�����")); // ���true
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		
		
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books)); // ���false
		
		// ��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		
		// ɾ��c����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		
		// ����books������ֻʣ��c������Ҳ������Ԫ��,������
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��:" + books);
	}
}