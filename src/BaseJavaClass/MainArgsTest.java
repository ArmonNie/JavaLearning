package BaseJavaClass;

/*
 * ����main��������String���� args
 * 1.Ĭ��args�ǿյġ���jvm���ܲ����ơ�
 * 2.ע����δ��ν���args������1.��ʹ��java����������2.��ide��ͨ������Ҳ���ԡ�
 * 
 * ���䣺ע��mian��public��static�ĺ���
 */
public class MainArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args���ȣ�" + args.length);
		//ע��java�е�foreachд��
		for(String arg : args)
		{
			System.out.println(" " + arg);
		}
	}

}
