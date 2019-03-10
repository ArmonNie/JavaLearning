package mThread;

import bean.Account;

public class DrawMoneyThreadSyn extends Thread{
	
	private Account account;//ȡǮ�˻�
	private int drawAmount;//ȡǮ��
	
	//������
	public DrawMoneyThreadSyn(String name,Account account,int drawAmount)
	{
		super(name);//���������������߳�����
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	//�߳�ִ����
	public void run()
	{
		synchronized (this.account) {
			/*
			 * if(account.getBalance() > this.drawAmount) {
			 * account.setBalance(account.getBalance()-this.drawAmount);
			 * System.out.println("ȡǮ�ɹ������У�" + account.getBalance()); }
			 */
			if (account.getBalance() > this.drawAmount) {
				System.out.println("ȡǮ�ɹ����³���" + this.drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - this.drawAmount);
				System.out.println("���У�" + account.getBalance());
			} else {
				System.out.println("ȡǮʧ�ܣ����㣡��");
			}
		}
	}
}
