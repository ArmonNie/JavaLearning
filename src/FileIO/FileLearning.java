package FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
/*
 * 学习类File
 * 重点关注问题：路径问题（注意比较file，file1，file2，file3四个对象）
 */
public class FileLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/*
		 * file，file1，file2,file3,file4对象
		 */
		//注意所有相对路径在解析时会加上user.dir属性，user.dir代表工作路径
		Properties pr = System.getProperties();
		System.out.println("java项目工作路径:" + pr.getProperty("user.dir"));
		System.out.println("用户在本操作系统的用户路径:" + pr.getProperty("user.home"));
		
		paintLine();//用于输出分割线
		
		//.代表当前路径，与相对路径而言，其输出的绝对路径中会一直有个点
		File file = new File(".");
		System.out.println("file当前路径存在否：" + file.exists());
		System.out.println("file传入的路径参数：" + file.getPath());
		System.out.println("file当前路径对应的绝对路径（即前面加上工作路径）：" + file.getAbsolutePath());
		System.out.println("file当前的文件(目录)名：" + file.getName());
		System.out.println("file当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file.getAbsoluteFile().getPath());
		System.out.println("file父路径：" + file.getAbsoluteFile().getParent());
		//如何定位到项目（编译前）内的具体文件（另一方法见file3对象）
		File mf = new File(file.getAbsoluteFile().getParent() 
				+ 	"\\src\\FileIO\\FileTest.java");
		System.out.println("定位：" + mf.getName() + "路径为：" + mf.getPath());
		
		paintLine();//用于输出分割线
		
		//代表目录
		File file1 = new File(".\\src\\FileIO\\");
		System.out.println("file1当前路径存在否：" + file1.exists());
		System.out.println("file1传入的路径参数：" + file1.getPath());
		System.out.println("file1当前路径对应的绝对路径（即前面加上工作路径）：" + file1.getAbsolutePath());
		System.out.println("file1当前的文件(目录)名：" + file1.getName());
		System.out.println("file1当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file1.getAbsoluteFile().getPath());
		System.out.println("file1父路径：" + file1.getAbsoluteFile().getParent());
		
		paintLine();//用于输出分割线
		
		//此处由于开头为斜杠，所以指向的是本项目所在的根路径（即前缀加上D:)
		File file2 = new File("\\src\\FileIO\\MyScanner.java");
		System.out.println("file2当前路径存在否：" + file2.exists());
		System.out.println("file2传入的路径参数：" + file2.getPath());
		System.out.println("file2当前路径对应的绝对路径（即前面加上工作路径）：" + file2.getAbsolutePath());
		System.out.println("file2当前的文件(目录)名：" + file2.getName());
		System.out.println("file2当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file2.getAbsoluteFile().getPath());
		System.out.println("file2父路径：" + file2.getAbsoluteFile().getParent());
		
		paintLine();//用于输出分割线
		
		//java里常用的相对路径写法（切记开头不要加斜杠），相对工作路径而言（即user.dir）
		File file3 = new File("src/FileIO/MyScanner.java");
		System.out.println("file3当前路径存在否：" + file3.exists());
		System.out.println("file3传入的路径参数：" + file3.getPath());
		System.out.println("file3当前路径对应的绝对路径（即前面加上工作路径）：" + file3.getAbsolutePath());
		System.out.println("file3当前的文件(目录)名：" + file3.getName());
		System.out.println("file3当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file3.getAbsoluteFile().getPath());
		System.out.println("file3父路径：" + file3.getAbsoluteFile().getParent());
		
		paintLine();//用于输出分割线
		
		//通过file4对象可知java项目里没有双点的写法
		//java里的相对路径都是相对于工作路径而言，即user.dir属性\
		//通过参考网络说法，user.dir是无法在java语言层面修改的，
		//但可以通过jvm的c函数库修改
		File file4 = new File("../MyScanner.java");
		System.out.println("file4当前路径存在否：" + file4.exists());
		System.out.println("file4传入的路径参数：" + file4.getPath());
		System.out.println("file4当前路径对应的绝对路径（即前面加上工作路径）：" + file4.getAbsolutePath());
		System.out.println("file4当前的文件(目录)名：" + file4.getName());
		System.out.println("file4当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file4.getAbsoluteFile().getPath());
		System.out.println("file4父路径：" + file4.getAbsoluteFile().getParent());
		
		paintLine();//用于输出分割线
		
		
		/*
		 * File对于文件的操作
		 * 对于绝对路径而言，操作基本上是明确的
		 * 关键点是项目内的相对路径（结合之前的四个对象弄清楚）
		 * 个人理解，java项目的相对路径都是默认相对工作路径的
		 */
		//获取已存在文件信息
		File file5 = new File("src/main/Entrance.java");
		//注意”&“与”&&“区别
		if(file5.exists()&file5.isFile()) {
			System.out.println("file5对应文件存在");
		}
		else if(file5.exists()&file5.isDirectory()) {
			System.out.println("file5对应目录存在");
		}
		else {
			System.out.println("file5对应文件（目录）不存在");
		}
		System.out.println("file5的路径参数：" + file5.getPath());
		System.out.println("file5当前路径对应的绝对路径（即前面加上工作路径）：" + file5.getAbsolutePath());
		System.out.println("file5当前的文件(目录)名：" + file5.getName());
		System.out.println("file5当前路径对应的绝对路径（即对应绝对文件对象的路径参数）：" + file5.getAbsoluteFile().getPath());
		System.out.println("file5父路径：" + file5.getAbsoluteFile().getParent());
		System.out.println("file5的最后修改时间：" + file5.lastModified());
		System.out.println("file5的大小：" + file5.length() + "byte");
		if(file5.canRead()) {
			System.out.println("file5的读写状态：可读");
		}else {
			System.out.println("file5的读写状态：不可读");
		}
		if(file5.canWrite()) {
			System.out.println("file5的读写状态：可写");
		}else {
			System.out.println("file5的读写状态：不可写");
		}
		
		
		paintLine();//用于输出分割线
		
		/*
		 * 在本项目中创建新的文件
		 * createTempFile是File类的静态方法（无反馈）
		 * createNewFile是对象的方法（有反馈）
		 */
		File file6 = File.createTempFile("test", ".txt",file);
		//没有第三个参数，此方法创建的是一个临时文件		
		File file7 = File.createTempFile("src/test", ".java");
		File file8 = new File("test1.txt");
		if(file8.createNewFile()) {
			System.out.println("file8对应文件创建成功");
		}
		else {
			System.out.println("file8对应文件创建失败，请检查是否已经存在");
		}

		paintLine();//用于输出分割线
		
		/*
		 * File对象对于目录的操作
		 */
		File directory1 = new File("mTest");
		System.out.println(directory1.mkdir());
		System.out.println(directory1.createNewFile());
		paintLine();//用于输出分割线
		/*
		 * 对于目录中文件列表以及文件过滤器
		 */
		//目录的文件列表（返回文件名或目录名）
		String[] filelist = file.list();
		for(String str : filelist)
		{
			System.out.println(str);
		}
		paintLine();//用于输出分割线
		//返回路径根（即D:）
		File[] systemfilelist = File.listRoots();
		for(File f : systemfilelist)
		{
			System.out.println(f);
		}
		paintLine();//用于输出分割线
		//目录的文件过滤器？？？
		File fileToFilter = new File(".");
		String[] filteredfilelist = fileToFilter.list((dir,name)-> name.endsWith(".java")
				|| new File(name).isDirectory());
		for(String s : filteredfilelist) {
			System.out.println(s);
		}
	}

	//用于输出分割线
	public static void paintLine() {
		for(int i = 0;i<40;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	
}
