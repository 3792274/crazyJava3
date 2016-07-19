package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
import java.util.function.*;
/**
 * Description:java8������Predicate�������ϡ�
 * Collection.removeIf(Predicate)
 * 
default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        final Iterator<E> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }
    
    
 */
public class PredicateTest7
{
	public static void main(String[] args)
	{
		// ����һ������
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		// ʹ��Lambda���ʽ��Ŀ��������Predicate�����˼���
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}
}
