package ClassLearning;

public class ClassLearning {
	//���ڶ���ע���뵥���Ƿ���������
	
	// /**/
	
	/*
	 *
	 //
	 */
	
//	/*
//	 *//
//	 */
//	 /*
	
	
	private static int i = 0;
	private int x = 0;
	
	public int a = 0;
	public int f1;
	
	public static int f2 = 0;
	
	public void test0()
	{
		System.out.println(i);//��static���Է���static
	}
	
	public static void test1()
	{
		/*
		 * ��static���޷�ֱ�ӷ���һ����static��Ա
		 * ������static����ʵ����һ������
		 */
		//ClassLearning cl = new ClassLearning();
		//System.out.println(cl.x);
	}

	public void test2()
	{
		int f1 = 2;//���Ա����ͬ��,ֵ��ͬ
		System.out.println(this.f1);
		System.out.println(f1);
	}
	
	public void test3(int a)
	{
		a++;
		System.out.println("������a��" + a);
	}
	
	public void test4(MyClass1 myClass1)
	{
		myClass1.f1++;
		System.out.println(myClass1.f1);
	}
}