package chapter08_04_List����;


import java.util.*;
/**
 * Description:
 * 1��ArrayList �� Vector���װ��һ����̬�ġ������ٷ����Object[]����
 * 2.ʹ��initialCapacity�������鳤�ȡ�����Ҫ��Ӵ���Ԫ�ؿ�ʹ��ensureCapacity(int minCapacity)һ�������ӣ��������
 * 3.��ʼ��С10
 * 4.ArrayList�̲߳���ȫ������Ҫ��ȫ����ʹ��Collections�Ĺ����ࡣ
 * 5.��ʱջ��Stack �滻 ArrayDeque
 * 6.��������Ĺ���Arrays,Arrays.ArrayList��һ���̶����ȵ�List���ϣ�ֻ�ܱ�������������ɾ����
 */
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("���Java����" , "������Java EE��ҵӦ��ʵս");
		
		// ��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		
		// ʹ�÷������ñ�������Ԫ��
		fixedList.forEach(System.out::println);
	
		// ��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupportedOperationException�쳣
		fixedList.add("���Android����");
		fixedList.remove("���Java����");
	}
}
