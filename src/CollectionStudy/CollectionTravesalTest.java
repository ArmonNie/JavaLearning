package CollectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * �������ϵ����ַ�ʽ
 * 1.System.out.print
 * 2.Lambdaֱ�ӱ������϶���
 * 3.��ȡiterator��ͨ��next��ȡ
 * 4������itarator�����ʹ��Lambda��
 * 5.ʹ��foreach������
 * ���䣺����Lambda���ʽ�ؼ���Consumer
 * java8����������ʽ�������˴�δд
 */
public class CollectionTravesalTest {

	Collection c1;
	static Collection c2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c1 = new ArrayList();���ʷ�static��һ��Ҫʵ��,���߰ѷ��ʵ�������Ϊstatic
		CollectionTravesalTest ctt = new CollectionTravesalTest();
		ctt.c1 = new ArrayList();
		c2 = new ArrayList();
		
		/*
		 * ע�⣺�������������ķ�����Ҫ���
		 */
		ctt.c1.add("Armon");//����һ���Զ�װ�����
		c2.add("1");
		
		ctt.c1.addAll(c2);
		
		/*
		 * ������ʽ1,����ֱ�����
		 */
		System.out.println(ctt.c1);
		
		/*
		 * ������ʽ2��Lambda���ʽ,forEach�Զ���������obj��-����Ӷ�obj�Ĳ���
		 * ���䣺����Consumer��
		 */
		ctt.c1.forEach(obj -> System.out.print(obj + " "));
		System.out.println("\n");
		
		/*
		 * ������ʽ3����ȡIterator�������
		 */
		Iterator it1 = ctt.c1.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next() + " ");
		}
		System.out.println("\n");
		/*
		 * ������ʽ4��ֱ�ӱ���Iterator��ʹ��Lambda
		 */
		Iterator it2 = ctt.c1.iterator();
		it2.forEachRemaining(obj -> System.out.print(obj + " "));
		System.out.println("\n");
		
		/*
		 * ������ʽ5��foreach���
		 */
		for(Object obj : ctt.c1)
		{
			System.out.print(obj + " ");
		}
	}


}
