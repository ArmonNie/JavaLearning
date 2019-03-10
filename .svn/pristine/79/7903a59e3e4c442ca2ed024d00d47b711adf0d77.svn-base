package mThread;

public class Caculator implements Runnable{
	
	private int number;
	
	public Caculator(int number)
	{
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*for(int i=0;i<4;i++)
		{
			mPrint(i);
		}*/
		this.mPrintMessage();
	}

	/*
	 * 此方法用于体现线程的并行特性
	 */
	public void mPrint(int i)
	{
		if(i < 3)
			System.out.printf("%s:%d*%d=%d\n",Thread.currentThread().getName(),number,i,number*i);
		else
			System.exit(0);
	}
	
	/*
	 * 此方法用于输出当前线程的详细信息
	 */
	public void mPrintMessage()
	{
		System.out.printf("%s:%s\n",Thread.currentThread().getName(),Thread.currentThread().getId() + ","
	+Thread.currentThread().getPriority() );
	}
}
