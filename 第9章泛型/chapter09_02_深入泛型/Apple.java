package chapter09_02_���뷺��;



/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
// ����Apple��ʱʹ���˷�������
public class Apple<T>
{
	// ʹ��T�����βζ���ʵ������
	private T info;
	public Apple(){}
	
	// ���淽����ʹ��T�����β������幹����
	public Apple(T info)
	{
		this.info = info;
	}

	public void setInfo(T info)
	{
		this.info = info;
	}
	
	public T getInfo()
	{
		return this.info;
	}
	
	public static void main(String[] args)
	{
		// ���ڴ���T�βε���String�����Թ���������ֻ����String
		Apple<String> a1 = new Apple<>("ƻ��");
		System.out.println(a1.getInfo());
		
		// ���ڴ���T�βε���Double�����Թ���������ֻ����Double��double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}
}

