package BaseJavaClass;

import java.util.*;

public class LQLearning {
	
	//һ�����Ӧһ������
	
	//������������������
	public void T1()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
	}
	
	//������ͣ�ͬʱע��int��long�ȵķ�Χ
	public void T2() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long i = 1;
		long sum = 0 ;
		while(i <= a)
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	
	//����԰��������ؼ����⣺����С�����ض�λ��
	public void T3()
	{
		double PI = 3.14159265358979323;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double S = PI*a*a;
		String s = String.format("%.7f", S);
		System.out.println(s);
	}
	
	//Fibonacci���� 
	public void T4()
	{
		/*
		 * �˷��������ˣ�����
		 */
//		int counter = 1;
//		int a1 = 1;
//		int a2 = 1;
//		int ax = 0;
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		while(counter < a)
//		{
//			ax = a1 +  a2;
//			a1 = a2;
//			a2 = ax;
//			counter++;
//		}
//		System.out.println(ax%10007);
		
		/*
		 * ���鷨1
		 */
//		int[] temparray = new int[1000000];
//		temparray[0] = 1;
//		temparray[1] = 1;
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a > 1)
//		{
//			for(int i = 2;i<a;i++)
//			{
//				temparray[i] =  temparray[i-1] + temparray[i-2];
//			}
//			System.out.println(temparray[a-1]%10007);
//		}
//		else
//		{
//			System.out.println(1);
//		}
		
		/*
		 * ���鷨2
		 */
		int[] temparray = new int[1000000];
		temparray[0] = 1;
		temparray[1] = 1;
		for(int i=2;i<temparray.length;i++)
		{
			temparray[i] =  (temparray[i-1] + temparray[i-2])%10007;
		}
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(temparray[a-1]);
	}

	
	//���������
	public void T5()
	{
		int[] arr1 = new int[5];
		int[] arr2 = new int[6];
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<10;i++)
		{
			arr1[0] =  i;
			for(int j=0;j<10;j++)
			{
				arr1[1] = j;
				for(int k=0;k<10;k++)
				{
					arr1[2] = k;
					for(int l=0;l<10;l++)
					{
						arr1[3] = l;
						for(int m=0;m<10;m++)
						{
							arr1[4] = m;
							if((arr1[0]*10000+arr1[1]*1000+arr1[2]*100+arr1[3]*10+arr1[4])==(arr1[4]*10000+arr1[3]*1000+arr1[2]*100+arr1[1]*10+arr1[0]))
							{
								int result = arr1[0]*10000+arr1[1]*1000+arr1[2]*100+arr1[3]*10+arr1[4];
								if(arr1[0]+arr1[1]+arr1[2]+arr1[3]+arr1[4] == a)
								{
									System.out.println(result);
								}
							}
						}
					}
				}
			}
		}
		for(int i=1;i<10;i++)
		{
			arr2[0] =  i;
			for(int j=0;j<10;j++)
			{
				arr2[1] = j;
				for(int k=0;k<10;k++)
				{
					arr2[2] = k;
					for(int l=0;l<10;l++)
					{
						arr2[3] = l;
						for(int m=0;m<10;m++)
						{
							arr2[4] = m;
							for(int n=0;n<10;n++)
							{
								arr2[5] = n;
								if((arr2[0]*100000+arr2[1]*10000+arr2[2]*1000+arr2[3]*100+arr2[4]*10+arr2[5])==(arr2[5]*100000+arr2[4]*10000+arr2[3]*1000+arr2[2]*100+arr2[1]*10+arr2[0]))
								{
									int result = arr2[0]*100000+arr2[1]*10000+arr2[2]*1000+arr2[3]*100+arr2[4]*10+arr2[5];
									if(arr2[0]+arr2[1]+arr2[2]+arr2[3]+arr2[4]+arr2[5] == a)
									{
										System.out.println(result);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	//���������λ������,˼·������Ƕ��ѭ������һ��һά����
	public void T6()
	{
		int[] arr = new int[4];
		for(int i=1;i<10;i++)
		{
			arr[0] =  i;
			for(int j=0;j<10;j++)
			{
				arr[1] = j;
				for(int k=0;k<10;k++)
				{
					arr[2] = k;
					for(int l=0;l<10;l++)
					{
						arr[3] = l;
						if((arr[0]*1000+arr[1]*100+arr[2]*10+arr[3])==(arr[3]*1000+arr[2]*100+arr[1]*10+arr[0]))
						{
							int result = arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
							System.out.println(result);
						}
					}
				}
			}
		}
	}

	
	//����ض������ļ�λ���֣��ܽᣬһ�㶼����ʹ�����鴦�����֣�
	public void T7()
	{
		int[] arr = new int[3];
		for(int i=1;i<10;i++)
		{
			arr[0] = i;
			for(int j =0;j<10;j++)
			{
				arr[1] = j;
				for(int k=0;k<10;k++)
				{
					arr[2]  =  k;
					if((arr[0]*100+arr[1]*10+arr[2]) == (arr[0]*arr[0]*arr[0]+arr[1]*arr[1]*arr[1]+arr[2]*arr[2]*arr[2]))
					{
						int result = arr[0]*100+arr[1]*10+arr[2];
						System.out.println(result);
					}
				}
			}
		}
	}

	
	//���ڽ���ת����������������Integer��װ�õķ����
	//ʮ������ת��Ϊ�˽��Ƶȵ�
	public void T8()
	{
		int x = 17;
		System.out.println("17�Ķ����ƣ�" + Integer.toBinaryString(x));
		System.out.println("17�İ˽��ƣ�" + Integer.toOctalString(x));
		System.out.println("17��ʮ�����ƣ�" + Integer.toHexString(x));
		System.out.println("0101��ʮ���ƣ�" + Integer.valueOf("0101",2));
		System.out.println("FEF��ʮ���ƣ�" + Integer.valueOf("FEF",16));
	}
	
	//ʮ������תΪ�˽���,���������������
	public void T8_1()
	{
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<x;i++)
		{
			//Scanner sc1 = new Scanner(System.in);
			//int y = sc.nextInt();
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<x;i++)
		{
			int z = Integer.valueOf("" + arr[i], 16);
			System.out.println(Integer.toOctalString(z));
		}
	}
	
	
	
	
	public void T9()
	{
		int result = 1;
		for(int i = 1;i<1000;i++)
		{
			result *= i;
		}
		System.out.println("999�Ľ׳�(2����)��" + Integer.toBinaryString(result));
	}
	
	
	//����׳ˣ����������洢��������Խ��
	public void T10()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			
		}
	}
	
	
	
}
