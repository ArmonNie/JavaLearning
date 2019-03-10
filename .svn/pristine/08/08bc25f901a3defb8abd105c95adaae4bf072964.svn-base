package CollectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * 遍历集合的四种方式
 * 1.System.out.print
 * 2.Lambda直接遍历集合对象
 * 3.获取iterator，通过next获取
 * 4，遍历itarator输出（使用Lambda）
 * 5.使用foreach语句遍历
 * 补充：关于Lambda表达式关键，Consumer
 * java8还新增了流式遍历，此处未写
 */
public class CollectionTravesalTest {

	Collection c1;
	static Collection c2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c1 = new ArrayList();访问非static，一定要实例,或者把访问的量声明为static
		CollectionTravesalTest ctt = new CollectionTravesalTest();
		ctt.c1 = new ArrayList();
		c2 = new ArrayList();
		
		/*
		 * 注意：其他集合声明的方法，要会查
		 */
		ctt.c1.add("Armon");//存在一个自动装箱过程
		c2.add("1");
		
		ctt.c1.addAll(c2);
		
		/*
		 * 遍历方式1,可以直接输出
		 */
		System.out.println(ctt.c1);
		
		/*
		 * 遍历方式2，Lambda表达式,forEach自动遍历传给obj，-》后接对obj的操作
		 * 补充：关于Consumer类
		 */
		ctt.c1.forEach(obj -> System.out.print(obj + " "));
		System.out.println("\n");
		
		/*
		 * 遍历方式3：获取Iterator对象遍历
		 */
		Iterator it1 = ctt.c1.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next() + " ");
		}
		System.out.println("\n");
		/*
		 * 遍历方式4：直接遍历Iterator，使用Lambda
		 */
		Iterator it2 = ctt.c1.iterator();
		it2.forEachRemaining(obj -> System.out.print(obj + " "));
		System.out.println("\n");
		
		/*
		 * 遍历方式5，foreach语句
		 */
		for(Object obj : ctt.c1)
		{
			System.out.print(obj + " ");
		}
	}


}
