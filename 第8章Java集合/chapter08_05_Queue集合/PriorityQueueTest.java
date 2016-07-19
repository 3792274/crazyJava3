package chapter08_05_Queue����;


import java.util.*;
/**
 * Description:
 * ����peek��poll����ȡ�������е�Ԫ��ʱ������ȡ�����Ƚ�����е�Ԫ�أ�����ȡ����С��Ԫ�ء���FIFO
 */
public class PriorityQueueTest
{
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		// �������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		// ���pq���У������ǰ�Ԫ�صļ���˳������
		System.out.println(pq); // ���[-3, 6, 20, 18]
		// ���ʶ��е�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.poll());
	}
}
