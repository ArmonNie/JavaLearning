package ClassLearning;

/*
 * 学习如何创建类以及对象
 * 并注意对象调用
 * 补充：1.注意修饰符的区别 2.静态于非静态的区别
 * 注意：本类存在自定义构造器
 */
public class PersonTestWithContructor {

	private String attr1;
	public String attr2;
	public static String attr3;
	
	protected int test;
	
	/*
	 * 构造器
	 */
	public PersonTestWithContructor(String attr1)
	{
		this.attr1 = attr1;
	}
	
	/*
	 * 用void表示返回值的”构造器“，只会被当成一个普通方法
	 */
	public void PersonTestWithContructor(String attr1)
	{
		this.attr1 = attr1;
	}
	/*
	 * set，get函数
	 */
	public String getAttr1() {
		return attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	
	public String getAttr2() {
		return attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public static String getAttr3() {
		return attr3;
	}
	public static void setAttr3(String attr3) {
		PersonTestWithContructor.attr3 = attr3;
	}
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}

	/*
	 * 功能函数
	 */
	public void myFunction1()
	{
		System.out.println("public Function1");
	}
	
	private void myFunction2()
	{
		System.out.println("private Function2");
	}
}
