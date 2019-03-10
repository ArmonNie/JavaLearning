package FileIO;

import java.io.File;
import java.io.IOException;
/*
 * 深度问题：关于java中的路径问题？
 */
public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * file形参传入点号是表示当前路径，注意在java文件操作中点的含义
		 */
		File file = new File(".");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//获取绝对路径
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile().getParent());//获取上一级路径
		//此处当前路径表示的是一个相对路径
		//获取相对路径的父路径出错，输出null
		System.out.println(file.getParent());//获取父路径
		System.out.println(file.getParentFile());
		/*
		 * 在项目当下路径建立文件
		 * 每运行一次，就产生一次文件
		 */
		//传入的是之前的file对象，表示当前路径
		File tempfile = File.createTempFile("test", ".txt",file);
		//退出虚拟机(方法退出虚拟机时？)时删除(与delete（）区分)
		tempfile.deleteOnExit();
		
		/*
		 * 也可以在当前项目中创建文件
		 */
		File file_1 = new File("test1.txt");//后缀名也可以不要
		file_1.createNewFile();
		//由于已经创建了file_1对象的文件，下面输出false
		System.out.println(" " + file_1.mkdir());
		
		/*
		 * File对象也可以创建目录
		 */
		File file_2 = new File("mTest");
		System.out.println(file_2.mkdir());
		System.out.println(file_2.createNewFile());
		
		/*
		 * 测试1，关于./mTest;mTest为之前创立的目录,可以创建成功
		 * （使用目录路径对应的file对象去创建文件）的
		 */
		File file_3 = new File("./mTest/.");
		File file_4 = File.createTempFile("mytest", ".txt", file_3);
		
		/*
		 * 测试，直接使用文件对应的file对象进行文件生成(创建成功)
		 */
		File file_5 = new File("./mTest/test.java");
		System.out.println(file_5.createNewFile());
		
		//路径下信息输出
		String[] filelist = file.list();
		for(String str : filelist)
		{
			System.out.println(str);
		}
		//系统路径信息输出
		File[] systemfilelist = File.listRoots();
		for(File f : systemfilelist)
		{
			System.out.println(f);
			//System.out.println(f.getName());//此句无输出
		}
	}

}
