//入口函数
package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import BaseJavaClass.ScannerTest;
import NetPrograming.Client1;
import NetPrograming.Server1;
import mThread.Caculator;
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
        		if(numbers[j] > numbers[j+1])  //交换两数位置
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
		 * 以下一段为蓝桥杯测试
		 */
		LQLearning lqlearning = new LQLearning();
		//lqlearning.T1();//第一题
		//lqlearning.T2();
		//lqlearning.T3();
		//lqlearning.T4();
		//lqlearning.T5();
		//lqlearning.T6();
		//lqlearning.T7();
		//lqlearning.T8();
		//lqlearning.T8_1();
		//lqlearning.T9();
		
		//关于main函数的参数测试(cmd命令？？)
		//Testargs.outLength(args);
		
		//Scanner的使用
		//TestScanner.TestInputAndOutput(1,true);
		//TestScanner.TestReadFileWithScanner();
		
//		AssistantManager zz = new AssistantManager("创建22小时三十三分钟十八秒");
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
		 * 以下为网络编程代码
		 */
		
		//实例化一个服务器程序，监听8000端口
		/*Server1 server = new Server1();
		server.Init();
		server.service();*/
		//实例化一个客户端
		/*Client1 client = new Client1("localhost",8000);
		client.Init();
		client.Connect();*/
		
		
		/*
		 * 一下为线程的编程
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
