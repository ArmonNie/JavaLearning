//��ں���
package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import BaseJavaClass.ScannerTest;
import MyThread.Caculator;
import NetPrograming.Client1;
import NetPrograming.Server1;
import BaseJavaClass.AssistantManager;
import BaseJavaClass.BaseTypeCalssLearning;
import BaseJavaClass.LQLearning;

public class Entrance {

	public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
        	for(int j = 0 ;j < size-1-i ; j++)
        	{
        		if(numbers[j] > numbers[j+1])  //��������λ��
        		{
        			temp = numbers[j];
        			numbers[j] = numbers[j+1];
        			numbers[j+1] = temp;
        		}
        	}
        }
        for(int i = 0 ; i < size-1; i ++)
        {
        	System.out.print(numbers[i] + " ");
        }
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ����һ��Ϊ���ű�����
		 */
		LQLearning lqlearning = new LQLearning();
		//lqlearning.T1();//��һ��
		//lqlearning.T2();
		//lqlearning.T3();
		//lqlearning.T4();
		//lqlearning.T5();
		//lqlearning.T6();
		//lqlearning.T7();
		//lqlearning.T8();
		//lqlearning.T8_1();
		//lqlearning.T9();
		
		//����main�����Ĳ�������(cmd�����)
		//Testargs.outLength(args);
		
		//Scanner��ʹ��
		//TestScanner.TestInputAndOutput(1,true);
		//TestScanner.TestReadFileWithScanner();
		
//		AssistantManager zz = new AssistantManager("����22Сʱ��ʮ������ʮ����");
//		zz.getTimeStr();
//		zz.getHourStr();
//		zz.getMinStr();
//		zz.getSecStr();
//		zz.getHourList();
//		zz.getMinList();
//		zz.getSecList();
//		zz.getHour();
//		zz.getMin();
//		zz.getSec();
//		zz.getTotalTime();;
		
		
		/*
		 * ����Ϊ�����̴���
		 */
		
		//ʵ����һ�����������򣬼���8000�˿�
		/*Server1 server = new Server1();
		server.Init();
		server.service();*/
		//ʵ����һ���ͻ���
		/*Client1 client = new Client1("localhost",8000);
		client.Init();
		client.Connect();*/
		
		
		/*
		 * һ��Ϊ�̵߳ı��
		 */
		
		/*for(int i=0;i<10;i++)
		{
			DataCalssLearning a = new DataCalssLearning();
			Caculator ca = new Caculator(i);
			//Thread th = new Thread(ca);
			//th.start();
		}*/
		//System.out.println(1==1);
		int[] test = {11,22,31,14,5,7,8,9,0,12,3,4};
		int test1[] = {1,2,3,4};
		int test12[][] = {{1,23,3},{1,23,3}};
		bubbleSort(test1);
	}

}
