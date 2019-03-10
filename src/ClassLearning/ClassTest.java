package ClassLearning;

public class ClassTest {
	/*
	 * 说明：static不可调用非static【注意this的含义】
	 * 因此在main中无法直接访问Test（）
	 */
	public void Test()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 测试1：static与非static互相访问
		 */
		//Test();存在错误。见上面说明
		
		//测试存在构造器类PersonTestWithConstructor
		/*
		 * 测试2：
		 * 由于已定义构造器，无法再使用无参数的系统构造器
		 * 若要使用，需要在类中声明
		 */
		//PersonTestWithConstructor p = new PersonTestWithConstructor();
		//PersonTestWithContructor p = new PersonTestWithContructor("attr1");
		/*
		 *下面即为调用了系统构造器 
		 */
		//PersonTestWithoutConstructor p1 = new PersonTestWithoutConstructor();
		/*
		 * 访问类中信息
		 * 无法直接访问private函数与变量
		 * （private变量通过public的函数公开）
		 * public,protected皆可以访问
		 */
		/*p.myFunction1();
		p.attr2 = "attr2";
		p.attr3 = "attr3";
		p.test = 2;
		
		
		System.out.println(p.getAttr1());
		System.out.println(p.getAttr2());
		System.out.println(p.getAttr3());
		System.out.println(p.getTest());*/
		
		/*
		 * 测试3：static与非static，如何在static中访问非static
		 * 关键：static属于类，非static属于具体实例
		 */
		//ClassLearning.test1();
		
		/*
		 * 测试四；static修饰的可以被实例调用
		 */
		ClassLearning cl = new ClassLearning();
		//cl.test1();
		//cl.i;//再测试,private修饰的在类外部无法被访问
		System.out.println(cl.f2);
		
		/*
		 * 测试5_1：引用间赋值传递的是地址，是对对对象的引用
		 */
		/*ClassLearning cl1 = new ClassLearning();
		ClassLearning cl2 = cl1;
		
		//直接比较看看是否指向同一个对象
		System.out.println(cl1 == cl2);
		System.out.println(cl1.equals(cl2));
		//通过访问成员，变化一个实例cl1的成员看看cl2的会不会一起改变
		System.out.println("变化前：" + cl1.a);
		System.out.println("变化前：" + cl2.a);
		cl1.a++;
		System.out.println("变化后：" + cl2.a);*/
		
		/*
		 * 测试5_2：引用间赋值传递的是地址，是对对对象的引用
		 */
		/*ClassLearning cl3 = new ClassLearning();
		ClassLearning cl4 = new ClassLearning();//此句与上不同
		//此时，应该分别指向两个对象，为false
		System.out.println(cl3 == cl4);
		System.out.println(cl3.equals(cl4));
		//此时，应该分别指向两个对象，成员变化不同步
		System.out.println("变化前：" + cl3.a);
		System.out.println("变化前：" + cl4.a);
		cl3.a++;
		System.out.println("变化后：" + cl3.a);
		System.out.println("变化后：" + cl4.a);
		
		cl4 = cl3;
		//此时，应该指向了另一个对象
		System.out.println("赋值后：" + cl4.a);
		System.out.println(cl3 == cl4);
		System.out.println(cl3.equals(cl4));*/
		
		/*
		 * 测试6_1：局部变量初始化
		 */
		//int f1;//main函数中声明的也是局部的
		//System.out.println(f1);//如果局部变量未赋初始值，系统不会帮你赋值，此时使用会出现编译错误
		
		/*
		 * 测试6_2：局部变量，与成员变量名字相同
		 * this引用成员变量
		 */
		/*ClassLearning cl5 = new ClassLearning();
		cl5.test2();*/
		
		/*
		 * 测试7_1:方法参数传递机制：基本类型的值传递(复制样本进行传递)
		 */
		/*int a = 0;
		ClassLearning cl6 = new ClassLearning();
		cl6.test3(a);
		System.out.println("方法外a：" + a);*/
		
		/*
		 * 测试7_2:方法参数传递机制：引用类型的值传递(复制样本进行传递)
		 * 但此时传递的值代表的是地址
		 */
		/*MyClass1 mc1 = new MyClass1();
		ClassLearning cl7 = new ClassLearning();
		cl7.test4(mc1);
		System.out.println(mc1.f1);*/
	}

}
