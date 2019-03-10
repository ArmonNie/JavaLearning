package BaseJavaClass;

/*
 * 测试main函数参数String【】 args
 * 1.默认args是空的【由jvm接受并复制】
 * 2.注意如何传参进入args？？【1.需使用java命令传入参数，2.在ide中通过配置也可以】
 * 
 * 补充：注意mian的public，static的含义
 */
public class MainArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args长度：" + args.length);
		//注意java中的foreach写法
		for(String arg : args)
		{
			System.out.println(" " + arg);
		}
	}

}
