package chapter14_01_����Annotation;



/***
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Apple
{
	// ����info�����ѹ�ʱ
	@Deprecated
	public void info()
	{
		System.out.println("Apple��info����");
	}
}
public class DeprecatedTest
{
	public static void main(String[] args)
	{
		// ����ʹ��info����ʱ���ᱻ����������
		new Apple().info();
	}
}

