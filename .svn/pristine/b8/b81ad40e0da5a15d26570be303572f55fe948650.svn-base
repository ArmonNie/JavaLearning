package main;

import bean.Account;
import mThread.DrawMoneyThread;

/*
 * 此处演示未对资源进行同步,因此会有结果与事实不符的异常
 */
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 非同步处理
		 */
		//生成账户
		Account ac = new Account("100",1000);
		//多线程对同一账户执行取钱
		new DrawMoneyThread("甲",ac,800).start();//注意Thread不要直接调用run
		new DrawMoneyThread("乙",ac,800).start();//注意Thread不要直接调用run
	}

}
