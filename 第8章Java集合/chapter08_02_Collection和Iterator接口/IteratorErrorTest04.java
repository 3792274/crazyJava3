package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;

/**
 * Description:
 */
public class IteratorErrorTest04 {
	public static void main(String[] args) {
		// �������ϡ����Ԫ�صĴ�����ǰһ��������ͬ
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("���Android����")) {
				// ʹ��Iterator���������У������޸ļ���Ԫ��,������������쳣��
				//�������ɾ������ ���Java���壬�򲻻ᷢ���쳣����������HashSet/ArrayList�ڲ�����ʵ�ֵģ�ɾ���ض�Ԫ�ز����쳣��
				books.remove(book);
			}
		}
	}
}
