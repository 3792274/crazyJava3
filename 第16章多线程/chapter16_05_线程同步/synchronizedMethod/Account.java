package chapter16_05_线程同步.synchronizedMethod;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Account {
	// 封装账户编号、账户余额两个成员变量
	private String accountNo;
	private double balance;

	public Account() {
	}

	// 构造器
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// accountNo的setter和getter方法
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	// 因此账户余额不允许随便修改，所以只为balance提供getter方法，
	public double getBalance() {
		return this.balance;
	}

	// 提供一个线程安全draw()方法来完成取钱操作
	public synchronized void draw(double drawAmount) {
		// 账户余额大于取钱数目
		if (balance >= drawAmount) {
			// 吐出钞票
			System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票:" + drawAmount);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			// 修改余额
			balance -= drawAmount;
			System.out.println("\t余额为: " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
		}
	}

	
	// 下面两个方法根据accountNo来重写hashCode()和equals()方法
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