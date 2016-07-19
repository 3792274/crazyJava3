package chapter08_05_Queue����;


import java.util.*;
/**
 * Description:����ȳ�
 * 1.Deque�ӿ���Queue�ӿڵ��ӽӿڣ�����һ��˫�˶���
 * 2.ArrayDequeʵ���࣬����Dequeͬ������ָ��һ��numElements����������ָ��Object[]���鳤�ȣ�Ĭ��16
 * 3.������ʾ��ArrayDeque����ջ��ʹ�á�
 */
public class ArrayDequeStack
{
	public static void main(String[] args)
	{
		ArrayDeque stack = new ArrayDeque();
		
		// ���ν�����Ԫ��push��"ջ"
		stack.push("���Java����");
		stack.push("������Java EE��ҵӦ��ʵս");
		stack.push("���Android����");
		
		// �����[���Android����, ������Java EE��ҵӦ��ʵս, ���Java����]
		System.out.println(stack);
		
		// ���ʵ�һ��Ԫ�أ�����������pop��"ջ"����������Android����
		System.out.println(stack.peek());
		
		// ��Ȼ�����[���Android����, ���Java����, ������Java EE��ҵӦ��ʵս]
		System.out.println(stack);
		
		// pop����һ��Ԫ�أ���������Android����
		System.out.println(stack.pop());
		
		// �����[������Java EE��ҵӦ��ʵս, ���Java����]
		System.out.println(stack);
	}
}
