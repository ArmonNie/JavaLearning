package bean;

public class Account {
	
	private String accountNo;//账户编号
	private double balance;//账户余额
	
	//账户构造函数
	public Account() {}
	public Account(String accountNo,double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//Getter，Setter
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
	
	//重写hashCode，根据账户编号生成hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return accountNo.hashCode();
	}
	
	//定义账户一样的情形
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)//注意this指代
		{
			return true;//"==",二者指向同一引用对象
		}
		/*
		 * 1.obj不为空
		 * 2.二者类型相同
		 * 3，若账户相同，则相等
		 */
		if(obj != null && (obj.getClass() == this.getClass()))
		{
			Account target = (Account)obj;
			return this.getAccountNo().equals(target.getAccountNo());
		}
		return false;
	}
	
	
	
}
