package FileIO;

import java.io.File;
import java.io.IOException;
/*
 * ������⣺����java�е�·�����⣿
 */
public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * file�βδ������Ǳ�ʾ��ǰ·����ע����java�ļ������е�ĺ���
		 */
		File file = new File(".");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//��ȡ����·��
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile().getParent());//��ȡ��һ��·��
		//�˴���ǰ·����ʾ����һ�����·��
		//��ȡ���·���ĸ�·���������null
		System.out.println(file.getParent());//��ȡ��·��
		System.out.println(file.getParentFile());
		/*
		 * ����Ŀ����·�������ļ�
		 * ÿ����һ�Σ��Ͳ���һ���ļ�
		 */
		//�������֮ǰ��file���󣬱�ʾ��ǰ·��
		File tempfile = File.createTempFile("test", ".txt",file);
		//�˳������(�����˳������ʱ��)ʱɾ��(��delete��������)
		tempfile.deleteOnExit();
		
		/*
		 * Ҳ�����ڵ�ǰ��Ŀ�д����ļ�
		 */
		File file_1 = new File("test1.txt");//��׺��Ҳ���Բ�Ҫ
		file_1.createNewFile();
		//�����Ѿ�������file_1������ļ����������false
		System.out.println(" " + file_1.mkdir());
		
		/*
		 * File����Ҳ���Դ���Ŀ¼
		 */
		File file_2 = new File("mTest");
		System.out.println(file_2.mkdir());
		System.out.println(file_2.createNewFile());
		
		/*
		 * ����1������./mTest;mTestΪ֮ǰ������Ŀ¼,���Դ����ɹ�
		 * ��ʹ��Ŀ¼·����Ӧ��file����ȥ�����ļ�����
		 */
		File file_3 = new File("./mTest/.");
		File file_4 = File.createTempFile("mytest", ".txt", file_3);
		
		/*
		 * ���ԣ�ֱ��ʹ���ļ���Ӧ��file��������ļ�����(�����ɹ�)
		 */
		File file_5 = new File("./mTest/test.java");
		System.out.println(file_5.createNewFile());
		
		//·������Ϣ���
		String[] filelist = file.list();
		for(String str : filelist)
		{
			System.out.println(str);
		}
		//ϵͳ·����Ϣ���
		File[] systemfilelist = File.listRoots();
		for(File f : systemfilelist)
		{
			System.out.println(f);
			//System.out.println(f.getName());//�˾������
		}
	}

}
