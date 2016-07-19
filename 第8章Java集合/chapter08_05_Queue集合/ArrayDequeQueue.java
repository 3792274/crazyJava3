package chapter08_05_Queue����;


import java.util.*;
/**
 * Description: FIFO,�Ƚ��ȳ�
 */
public class ArrayDequeQueue
{
	public static void main(String[] args)
	{
		ArrayDeque queue = new ArrayDeque();
		
		// ���ν�����Ԫ�ؼ������
		queue.offer("���Java����");
		queue.offer("������Java EE��ҵӦ��ʵս");
		queue.offer("���Android����");
		
		// �����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		
		// ���ʶ���ͷ����Ԫ�أ�����������poll������"ջ"����������Java����
		System.out.println(queue.peek());
		
		// ��Ȼ�����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		
		// poll����һ��Ԫ�أ���������Java����
		System.out.println(queue.poll());
		
		// �����[������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
	}
}
