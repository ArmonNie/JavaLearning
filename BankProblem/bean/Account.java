package bean;

public class Account {
	
	private String accountNo;//�˻����
	private double balance;//�˻����
	
	//�˻����캯��
	public Account() {}
	public Account(String accountNo,double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//Getter��Setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//��дhashCode�������˻��������hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return accountNo.hashCode();
	}
	
	//�����˻�һ��������
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)//ע��thisָ��
		{
			return true;//"==",����ָ��ͬһ���ö���
		}
		/*
		 * 1.obj��Ϊ��
		 * 2.����������ͬ
		 * 3�����˻���ͬ�������
		 */
		if(obj != null && (obj.getClass() == this.getClass()))
		{
			Account target = (Account)obj;
			return this.getAccountNo().equals(target.getAccountNo());
		}
		return false;
	}
	
	
	
}
