package CollectionStudy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/*
 *注意java集合框架设计接口以及类(此处列出部分)
 *补充：注意多态的声明方式,以及集合中与泛型联系
 */


public class CollectionTest {
	/*
	 * Collection,Set,List,Queue都是接口，不是实现类,因此无法实例化
	 */
	/*Collection ct = new Collection();
	List lt = new List();
	Set st = new Set();
	Queue qt = new Queue();*/
	
	//Collection为Set，List，Queue根接口
	Collection c1 = new ArrayList();//此处警告来自于泛型
	Collection c2 = new LinkedList();
	Collection c3 = new HashSet();
	Collection c4 = new LinkedHashSet();
	Collection c5 = new TreeSet();
	Collection c6 = new ArrayDeque();
	
	List l1 = new ArrayList();
	ArrayList l1_1 = new ArrayList();
	List l2 = new LinkedList();
	LinkedList l2_2 = new LinkedList();
	
	Set s1 = new HashSet();
	HashSet s1_1 = new HashSet();
	Set s2 = new LinkedHashSet();
	LinkedHashSet s2_2 = new LinkedHashSet();
	Set s3 = new TreeSet();
	TreeSet s3_3 = new TreeSet();
	
	Queue q1 = new ArrayDeque();
}
