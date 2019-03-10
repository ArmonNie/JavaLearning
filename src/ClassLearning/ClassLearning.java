package ClassLearning;

public class ClassLearning {
	//关于多行注释与单行是否包含的情况
	
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
		System.out.println(i);//非static可以访问static
	}
	
	public static void test1()
	{
		/*
		 * 在static中无法直接访问一个非static成员
		 * 除非在static中先实例化一个对象
		 */
		//ClassLearning cl = new ClassLearning();
		//System.out.println(cl.x);
	}

	public void test2()
	{
		int f1 = 2;//与成员变量同名,值不同
		System.out.println(this.f1);
		System.out.println(f1);
	}
	
	public void test3(int a)
	{
		a++;
		System.out.println("方法里a：" + a);
	}
	
	public void test4(MyClass1 myClass1)
	{
		myClass1.f1++;
		System.out.println(myClass1.f1);
	}
}
