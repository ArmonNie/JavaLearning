package BaseJavaClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	/*
	 * 复习：静态中不能调用非静态，非静态必须通过实例调用或者this
	 */
	public static void main(String[] args)
	{
		System.out.println("ScannerTest");
		
		/*
		 * 文件找不到
		 */
		/*try {
			TestReadFileWithScanner();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*
		 * 获取输入并传入变量
		 */
		//getParameterTest();
		
		/*
		 * 流程测试
		 */
		//MyTest();
	}
	
	/*
	 * 测试从scanner中取值的流程？？？
	 */
	public static void MyTest()
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			System.out.println(sc.hasNext());
		}
	}
	
	public static void getParameterTest()
	{
		/*
		 * 默认使用空格，Tab，回车分割,
		 */
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);//System.in代表键盘输入
		while(sc.hasNext())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			//System.out.println("你输入了：" + sc.next());
			System.out.println(""+a+"+"+b+"="+(a+b));
		}
		//System.out.println(""+a+"+"+b+"="+(a+b));
	}
	public static void getParameterTest1()
	{
		/*
		 * 默认使用空格，Tab，回车分割,
		 */
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);//System.in代表键盘输入
		/*while(sc.hasNext())
		{*/
			a = sc.nextInt();
			b = sc.nextInt();
			//System.out.println("你输入了：" + sc.next());
			System.out.println(""+a+"+"+b+"="+(a+b));
		/*}*/
		//System.out.println(""+a+"+"+b+"="+(a+b));
	}
	
	//疑问：关于文件路径问题？？？？
	public static void TestReadFileWithScanner() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("ScannerTest.java"));//java(或者eclipse文件的路径问题)？？？？？？
		System.out.println("文件内容为：");
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
