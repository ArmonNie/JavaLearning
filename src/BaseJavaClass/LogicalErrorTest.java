package BaseJavaClass;


/*
 * ע��һЩ��дif��䳣���ֵ��߼�����
 */
public class LogicalErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		error1();
		error2();
	}
	
	public static void error1()
	{
		int b=5;
		if(b>3)
			System.out.println("b>3");//�˾ٺ����ٷ�һ����䣬��������ţ����������﷨����
		else
			b--;
			System.out.println("b<=3");	//�˾��ܻ�ִ��
	}

	public static void error2()
	{
		//ע���ʼֵ��������ϵ
		int age = 45;
		if(age>20)
		{
			System.out.println("������");//45�жϵ�һ���ɹ���֮����߼��������ж�
		}
		else if(age>40)
		{
			System.out.println("������");
		}
		else if(age>60)
		{
			System.out.println("������");
		}
	}
}
