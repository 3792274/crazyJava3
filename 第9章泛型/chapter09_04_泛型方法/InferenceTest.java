package chapter09_04_���ͷ���;



/**
 * Description:Java8�Ľ��������ж�
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class MyUtil<E>
{
	public static <Z> MyUtil<Z> nil()
	{
		return null;
	}
	
	public static <Z> MyUtil<Z> cons(Z head, MyUtil<Z> tail)
	{
		return null;
	}
	
	E head()
	{
		return null;
	}
}
public class InferenceTest
{
	public static void main(String[] args)
	{
		// ����ͨ��������ֵ��Ŀ��������ƶ����Ͳ���ΪString
		MyUtil<String> ls = MyUtil.nil();
		
		// ����ʹ����������ڵ���nil()����ʱָ�����Ͳ���������
		MyUtil<String> mu = MyUtil.<String>nil();
		
		// �ɵ���cons��������Ĳ����������ƶ����Ͳ���ΪInteger
		MyUtil.cons(42, MyUtil.nil());
		
		// ����ʹ����������ڵ���nil()����ʱָ�����Ͳ���������
		MyUtil.cons(42, MyUtil.<Integer>nil());

		// ϣ��ϵͳ���ƶϳ�����nil()�������Ͳ���ΪString���ͣ�
		// ��ʵ����Java 8��Ȼ�ƶϲ�����������������뱨��
//		String s = MyUtil.nil().head();
		String s = MyUtil.<String>nil().head();
	}
}