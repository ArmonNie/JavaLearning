package mThread;

import bean.Account;

public class DrawMoneyThreadSyn extends Thread{
	
	private Account account;//取钱账户
	private int drawAmount;//取钱数
	
	//构造器
	public DrawMoneyThreadSyn(String name,Account account,int drawAmount)
	{
		super(name);//父构造器，传入线程名字
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	//线程执行体
	public void run()
	{
		synchronized (this.account) {
			/*
			 * if(account.getBalance() > this.drawAmount) {
			 * account.setBalance(account.getBalance()-this.drawAmount);
			 * System.out.println("取钱成功，余额还有：" + account.getBalance()); }
			 */
			if (account.getBalance() > this.drawAmount) {
				System.out.println("取钱成功，吐出：" + this.drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - this.drawAmount);
				System.out.println("余额还有：" + account.getBalance());
			} else {
				System.out.println("取钱失败，余额不足！！");
			}
		}
	}
}
