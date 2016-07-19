package chapter16_05_�߳�ͬ��;

/**
 * Description: ������<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class A {
	public synchronized void foo(B b) {
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName() + " ������Aʵ����foo()����"); // ��
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName() + " ��ͼ����Bʵ����last()����"); // ��
		b.last();
	}

	public synchronized void last() {
		System.out.println("������A���last()�����ڲ�");
	}
}

class B {
	public synchronized void bar(A a) {
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName() + " ������Bʵ����bar()����"); // ��
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName() + " ��ͼ����Aʵ����last()����"); // ��
		a.last();
	}

	public synchronized void last() {
		System.out.println("������B���last()�����ڲ�");
	}
}

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	public void init() {
		Thread.currentThread().setName("���߳�");
		// ����a�����foo����
		a.foo(b);
		System.out.println("���������߳�֮��");
	}

	@Override
	public void run() {
		Thread.currentThread().setName("���߳�");
		// ����b�����bar����
		b.bar(a);
		System.out.println("�����˸��߳�֮��");
	}

	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		// ��dlΪtarget�������߳�
		new Thread(dl).start();
		// ����init()����
		dl.init();
	}
}
