package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
/**
 * Description:
 * @version 1.0
 */
public class IteratorEach05
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
		// ʹ��Lambda���ʽ��Ŀ��������Comsumer������������Ԫ��
		it.forEachRemaining(obj -> System.out.println("��������Ԫ�أ�" + obj));
	}
}
