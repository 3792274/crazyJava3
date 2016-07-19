package chapter16_09_ThreadLocal;

/**
 * Description:������߳���ռ��Դ��ʹÿ���̶߳�һ����Դ�Ŀ����� <br/>
 * �����ǿ��������Ըտ�ʼ��������ThreadLocal<String> name ���Ե�ֵΪ�գ���δ��ʼ�������ĳ�ʼ���������߳��г�ʼ���ģ����߳���name��ֵ�������߳�û��
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Account {
	/*
	 * ����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾����� ÿ���̶߳��ᱣ���ñ�����һ������
	 */
	private ThreadLocal<String> name = new ThreadLocal<>();

	// ����һ����ʼ��name��Ա�����Ĺ�����
	public Account(String str) {
		this.name.set(str);   //�� this.name = str;
		// ����������ڷ��ʵ�ǰ�̵߳�name������ֵ
		System.out.println("---Account����������-->��Ա������ThreadLocal<String> name :" + this.name.get());
	}

	// name��setter��getter����
	public String getName() {
		return name.get();
	}

	public void setName(String str) {
		this.name.set(str);
	}
}

class MyTest extends Thread {
	// ����һ��Account���͵ĳ�Ա����
	private Account account;

	public MyTest(Account account, String name) {
		super(name); //�����̵߳����֡�
		this.account = account;
	}

	@Override
	public void run() {
		// ѭ��10��
		for (int i = 0; i < 10; i++) {
			// ��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
			if (i == 6) {
				account.setName(getName());
			}
			// ���ͬһ���˻����˻�����ѭ������
			System.out.println("�̣߳� "+Thread.currentThread().getName()+"  ���� Account.nameֵΪ��  "+account.getName() + " ���߳���iֵ��" + i);
		}
	}
}

public class ThreadLocalTest {
	public static void main(String[] args) {
		// ���������̣߳������̹߳���ͬһ��Account
		Account at = new Account("��ʼ��");
		/*
		 * ��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ���˻��� �������˻�����ThreadLocal���͵ģ�����ÿ���߳�
		 * ����ȫӵ�и��Ե��˻������������Դ�i == 6֮�󣬽��������� �̷߳���ͬһ���˻�ʱ������ͬ���˻�����
		 */
		new MyTest(at, "�̼߳�").start();
		new MyTest(at, "�߳���").start();
		System.out.println("�̣߳� "+Thread.currentThread().getName()+"  ���� Account.nameֵΪ��  "+at.getName() );
	}
}
