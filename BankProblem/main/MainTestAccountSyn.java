package main;

import bean.AccountSyn;
import mThread.DrawMonneySynThread;

/*
 * ͬ��������AccountSyn��
 */
public class MainTestAccountSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSyn acs = new AccountSyn("102",1000);
		
		new DrawMonneySynThread("A",acs,800).start();
		new DrawMonneySynThread("B",acs,800).start();
	}

}
