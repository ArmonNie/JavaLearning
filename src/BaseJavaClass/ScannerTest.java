package BaseJavaClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	/*
	 * ��ϰ����̬�в��ܵ��÷Ǿ�̬���Ǿ�̬����ͨ��ʵ�����û���this
	 */
	public static void main(String[] args)
	{
		System.out.println("ScannerTest");
		
		/*
		 * �ļ��Ҳ���
		 */
		/*try {
			TestReadFileWithScanner();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*
		 * ��ȡ���벢�������
		 */
		//getParameterTest();
		
		/*
		 * ���̲���
		 */
		//MyTest();
	}
	
	/*
	 * ���Դ�scanner��ȡֵ�����̣�����
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
		 * Ĭ��ʹ�ÿո�Tab���س��ָ�,
		 */
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);//System.in�����������
		while(sc.hasNext())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			//System.out.println("�������ˣ�" + sc.next());
			System.out.println(""+a+"+"+b+"="+(a+b));
		}
		//System.out.println(""+a+"+"+b+"="+(a+b));
	}
	public static void getParameterTest1()
	{
		/*
		 * Ĭ��ʹ�ÿո�Tab���س��ָ�,
		 */
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);//System.in�����������
		/*while(sc.hasNext())
		{*/
			a = sc.nextInt();
			b = sc.nextInt();
			//System.out.println("�������ˣ�" + sc.next());
			System.out.println(""+a+"+"+b+"="+(a+b));
		/*}*/
		//System.out.println(""+a+"+"+b+"="+(a+b));
	}
	
	//���ʣ������ļ�·�����⣿������
	public static void TestReadFileWithScanner() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("ScannerTest.java"));//java(����eclipse�ļ���·������)������������
		System.out.println("�ļ�����Ϊ��");
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
