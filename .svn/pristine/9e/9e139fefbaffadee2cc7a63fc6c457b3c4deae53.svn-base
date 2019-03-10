package BaseJavaClass;


/*
 * 注意一些在写if语句常出现的逻辑错误
 */
public class LogicalErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		error1();
		error2();
	}
	
	public static void error1()
	{
		int b=5;
		if(b>3)
			System.out.println("b>3");//此举后面再放一个语句，必须打括号，否则会出现语法错误
		else
			b--;
			System.out.println("b<=3");	//此句总会执行
	}

	public static void error2()
	{
		//注意初始值与条件关系
		int age = 45;
		if(age>20)
		{
			System.out.println("青年人");//45判断第一个成功，之后的逻辑不会再判断
		}
		else if(age>40)
		{
			System.out.println("中年人");
		}
		else if(age>60)
		{
			System.out.println("老年人");
		}
	}
}
