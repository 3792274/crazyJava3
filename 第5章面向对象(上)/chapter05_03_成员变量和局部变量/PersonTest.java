package chapter05_03_��Ա�����;ֲ�����;



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

class Person
{
	// ����һ��ʵ������
	public String name;
	// ����һ�������
	public static int eyeNum;
}
public class PersonTest
{
	public static void main(String[] args)
	{
		// ��һ������ʹ��Person�࣬�����Զ���ʼ������eyeNum������ʼ�����ã����0
		System.out.println("Person��eyeNum�����ֵ:"
			+ Person.eyeNum);
		// ����Person����
		Person p = new Person();
		// ͨ��Person���������p������Person����nameʵ������
		// ��ͨ��ʵ������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ֱ��Ϊnameʵ��������ֵ
		p.name = "�����";
		// ͨ��p����eyeNum���������Ȼ�Ƿ���Person��eyeNum�����
		p.eyeNum = 2;
		// �ٴ�ͨ��Person����������nameʵ��������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ǰ��ͨ��p�޸���Person��eyeNum���˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum�����ֵ:" + Person.eyeNum);
		Person p2 = new Person();
		// p2���ʵ�eyeNum�������Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum�����ֵ:" + p2.eyeNum);
	}
}
