package main;

import bean.Account;
import mThread.DrawMoneyThreadSyn;
/*
 * ʹ��ͬ�����뷨����
 */
public class MainTestSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�˻�����
		Account ac = new Account("101",1000);
		//���̲߳���
		new DrawMoneyThreadSyn("��",ac,800).start();
		new DrawMoneyThreadSyn("��",ac,800).start();
	}

}
