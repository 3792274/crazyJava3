package chapter08_02_Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;
/**
 * Description:
 * 
 * Java8��ΪIterable�ӿ�������һ��forEach(Consumer action)��Ĭ�Ϸ���
 * �������Ϊһ������ʽ�ӿڡ�
  
default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
    
 * 
 */
public class CollectionEach02
{
	public static void main(String[] args)
	{
		// ����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		// ����forEach()������������
		books.forEach(obj -> System.out.println("��������Ԫ�أ�" + obj));
	}
}
