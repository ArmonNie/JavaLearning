package main;

import bean.Account;
import mThread.DrawMoneyThreadSyn;
/*
 * 使用同步代码法处理
 */
public class MainTestSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//账户生成
		Account ac = new Account("101",1000);
		//多线程操作
		new DrawMoneyThreadSyn("丙",ac,800).start();
		new DrawMoneyThreadSyn("丁",ac,800).start();
	}

}
