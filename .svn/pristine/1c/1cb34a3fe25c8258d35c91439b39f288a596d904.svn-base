package mThread;

import bean.AccountSyn;

/*
 * AccountSyn是内部有同步的draw方法
 */
public class DrawMonneySynThread extends Thread{

	private AccountSyn account;//取钱账户
	private int drawAmount;//取钱数
	
	//构造器
	public DrawMonneySynThread(String name,AccountSyn account,int drawAmount)
	{
		super(name);//父构造器，传入线程名字
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	public void run()
	{
		this.account.draw(drawAmount);
	}
}
