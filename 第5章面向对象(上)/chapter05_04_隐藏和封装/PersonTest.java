package chapter05_04_���غͷ�װ;



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
public class PersonTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		// ��Ϊage��Ա�����ѱ����أ�����������佫���ֱ������
		// p.age = 1000;
		// ���������벻����ִ��󣬵�����ʱ����ʾ"�����õ����䲻�Ϸ�"
		// ���򲻻��޸�p��age��Ա����
		p.setAge(1000);
		// ����p��age��Ա����Ҳ����ͨ�����Ӧ��getter����
		// ��Ϊ�����δ�ɹ�����p��age��Ա�������ʴ˴����0
		System.out.println("δ������age��Ա����ʱ��"
			+ p.getAge());
		// �ɹ��޸�p��age��Ա����
		p.setAge(30);
		// ��Ϊ����ɹ�������p��age��Ա�������ʴ˴����30
		System.out.println("�ɹ�����age��Ա������"
			+ p.getAge());
		// ����ֱ�Ӳ���p��name��Ա������ֻ��ͨ�����Ӧ��setter����
		// ��Ϊ"���"�ַ�����������2~6,���Կ��Գɹ�����
		p.setName("���");
		System.out.println("�ɹ�����name��Ա������"
			+ p.getName());
	}
}
