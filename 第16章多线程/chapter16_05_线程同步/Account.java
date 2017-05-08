package chapter16_05_线程同步;

/**
 * Description: //银行的账户类<br/>
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
	// 封装账户编号、账户余额的两个成员变量
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

	// balance的setter和getter方法
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
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