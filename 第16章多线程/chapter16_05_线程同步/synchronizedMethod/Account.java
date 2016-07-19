package chapter16_05_�߳�ͬ��.synchronizedMethod;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Account {
	// ��װ�˻���š��˻����������Ա����
	private String accountNo;
	private double balance;

	public Account() {
	}

	// ������
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// accountNo��setter��getter����
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	// ����˻�����������޸ģ�����ֻΪbalance�ṩgetter������
	public double getBalance() {
		return this.balance;
	}

	// �ṩһ���̰߳�ȫdraw()���������ȡǮ����
	public synchronized void draw(double drawAmount) {
		// �˻�������ȡǮ��Ŀ
		if (balance >= drawAmount) {
			// �³���Ʊ
			System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ����³���Ʊ:" + drawAmount);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			// �޸����
			balance -= drawAmount;
			System.out.println("\t���Ϊ: " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + "ȡǮʧ�ܣ����㣡");
		}
	}

	
	// ����������������accountNo����дhashCode()��equals()����
	public int hashCode() {
		return accountNo.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == Account.class) {
			Account target = (Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}