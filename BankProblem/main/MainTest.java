package main;

import bean.Account;
import mThread.DrawMoneyThread;

/*
 * �˴���ʾδ����Դ����ͬ��,��˻��н������ʵ�������쳣
 */
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ͬ������
		 */
		//�����˻�
		Account ac = new Account("100",1000);
		//���̶߳�ͬһ�˻�ִ��ȡǮ
		new DrawMoneyThread("��",ac,800).start();//ע��Thread��Ҫֱ�ӵ���run
		new DrawMoneyThread("��",ac,800).start();//ע��Thread��Ҫֱ�ӵ���run
	}

}
