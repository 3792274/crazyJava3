package chapter08_02_Collection��Iterator�ӿ�;

import java.util.*;
import java.util.function.*;
/**
 * Description:
 * ������ǰ�����ӣ����ⶨ��һ��calAll()��������������Ԫ�أ�Ȼ�����ζ�ÿ������Ԫ�ؽ����жϣ�̫�鷳��
 * ���ʹ��Stream,����ֱ�ӶԼ��������е�Ԫ�ؽ�������������
 
 */
public class CollectionStream10
{
	public static void main(String[] args)
	{
		// ����books���ϡ�Ϊbooks�������Ԫ�صĴ�����8.2.5С�ڵĳ�����ͬ��
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		
		// ͳ����������������Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("���"))
			.count()); // ���4
		
		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("Java") )
			.count()); // ���2
		
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).length() > 10)
			.count()); // ���2
		
		// �ȵ���Collection�����stream()����������ת��ΪStream,
		// �ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		books.stream().mapToInt(ele -> ((String)ele).length())
			// ����forEach()��������IntStream��ÿ��Ԫ��
			.forEach(System.out::println);// ���8  11  16  7  8
	}
}
