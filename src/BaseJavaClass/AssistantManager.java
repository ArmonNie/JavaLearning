package BaseJavaClass;

/*
 * ʹ��������ʽ�����������ƥ��õ�ʱ��
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssistantManager {
	
	public  String testStr = "";
	
	public String strTime = "";
	public String strHour =  "";
	public String strMin = "";
	public String strSec = "";
	
	public ArrayList<String> hList= new ArrayList<String>();
	public ArrayList<String> mList= new ArrayList<String>();
	public ArrayList<String> sList= new ArrayList<String>();
	public int hourLength = 0;
	public int minLength = 0;
	public int secLength = 0;
	public boolean hListFlag;
	public boolean mListFlag;
	public boolean sListFlag;
	
	public int totalTime = 0;
	
	
	public AssistantManager(String strInit)
	{
		this.testStr = strInit;
	}
	
	public void getTimeStr()
	{
		String t1 = "([һ�����������߰˾�ʮ0123456789]+((Сʱ)|(ʱ)))?([һ�����������߰˾�ʮ0123456789]+((����)|(��)))?([һ�����������߰˾�ʮ0123456789]+((��)))?";
		Pattern p = Pattern.compile(t1);
		Matcher m = p.matcher(testStr);
		boolean b = m.matches();
		//System.out.println("" + b + "" + m.find());
		while(m.find())
		{
			//System.out.println("" + m.group());
			strTime += m.group();//�����üӺ�
		}
		System.out.println("ʱ���ǣ�" + strTime);
	}

	public void getHourStr() {
		String t2 = "[һ�����������߰˾�ʮ0123456789]+((Сʱ)|(ʱ))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strHour += m.group();//�����üӺ�
		}
		System.out.println("Сʱ�ǣ�" + strHour);
	}
	
	public void getMinStr() {
		String t2 = "[һ�����������߰˾�ʮ0123456789]+((����)|(��))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strMin += m.group();//�����üӺ�
		}
		System.out.println("�����ǣ�" + strMin);
	}
	
	public void getSecStr() {
		String t2 = "[һ�����������߰˾�ʮ0123456789]+((��))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strSec += m.group();//�����üӺ�
		}
		System.out.println("���ǣ�" + strSec);
	}
	
	public void getHourList()
	{
		System.out.println("����������Ϊ��" + strHour);
		char[] chour = new char[5];
		chour = strHour.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != 'С' && chour[i] != 'ʱ')
			{
				String temp = "" + chour[i];
				hList.add(temp);
			}
		}
		hourLength = hList.size();
		hListFlag = getFlags(hList);
		System.out.println("�����л��Сʱλ��Ϊ��" +  hourLength);
	}
	
	public void getMinList()
	{
		System.out.println("����������Ϊ��" + strMin);
		char[] chour = new char[5];
		chour = strMin.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != '��' && chour[i] != '��')
			{
				String temp = "" + chour[i];
				mList.add(temp);
			}
		}
		minLength = mList.size();
		mListFlag = getFlags(mList);
		System.out.println("�����л�÷���λ��Ϊ��" +  minLength);
	}
	
	public void getSecList()
	{
		System.out.println("����������Ϊ��" + strSec);
		char[] chour = new char[5];
		chour = strSec.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != '��')
			{
				String temp = "" + chour[i];
				sList.add(temp);
			}
		}
		secLength = sList.size();
		sListFlag = getFlags(sList);
		System.out.println("�����л����λ��Ϊ��" +  secLength);
	}
	
	public void getHour()
	{
		int x;
		if(hListFlag == true)
		{
			String str = this.getStringFromList(hList);
			x = Integer.parseInt(str);
			System.out.println("Сʱ����ֵΪ��" + x);
		}
		else
		{
			x = this.getDealedStringFromList(hList);
			System.out.println("Сʱ����ֵΪ��" + x);
		}
		this.totalTime += x*3600;
	}
	
	public void getMin()
	{
		int x;
		if(mListFlag == true)
		{
			String str = this.getStringFromList(mList);
			x = Integer.parseInt(str);
			System.out.println("���ӵ���ֵΪ��" + x);
		}
		else
		{
			x = this.getDealedStringFromList(mList);
			System.out.println("���ӵ���ֵΪ��" + x);
		}
		this.totalTime += x*60;
	}
	
	public void getSec()
	{
		int x;
		if(sListFlag == true)
		{
			String str = this.getStringFromList(sList);
			x = Integer.parseInt(str);
			System.out.println("�����ֵΪ��" + x);
		}
		else
		{
			x = this.getDealedStringFromList(sList);
			System.out.println("�����ֵΪ��" + x);
		}
		this.totalTime  += x;
	}
	
	public boolean getFlags(ArrayList<String> list)
	{
		String str = this.getStringFromList(list);
		System.out.println(str);
		Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        return m.matches();
	}
	
	public String getStringFromList(ArrayList<String> list)
	{
		String str = "";
		for(int i = 0;i<list.size();i++)
		{
			str += list.get(i);
		}
		return str;
	}
	
	
	public int getDealedStringFromList(ArrayList<String> list)
	{
		String chineseNumber = "";
		for(int i = 0;i<list.size();i++)
		{
			chineseNumber += list.get(i);
		}
		int result = 0;
        int temp = 1;//���һ����λ�������磺ʮ��
        int count = 0;//�ж��Ƿ���chArr
        char[] cnArr = new char[]{'һ','��','��','��','��','��','��','��','��'};
        char[] chArr = new char[]{'ʮ','��','ǧ','��','��'};
        for (int i = 0; i < chineseNumber.length(); i++) {
            boolean b = true;//�ж��Ƿ���chArr
            char c = chineseNumber.charAt(i);
            for (int j = 0; j < cnArr.length; j++) {//�ǵ�λ��������
                if (c == cnArr[j]) {
                    if(0 != count){//�����һ����λ֮ǰ���Ȱ���һ����λֵ��ӵ������
                        result += temp;
                        temp = 1;
                        count = 0;
                    }
                    // �±�+1�����Ƕ�Ӧ��ֵ
                    temp = j + 1;
                    b = false;
                    break;
                }
            }
            if(b){//��λ{'ʮ','��','ǧ','��','��'}
                for (int j = 0; j < chArr.length; j++) {
                    if (c == chArr[j]) {
                        switch (j) {
                        case 0:
                            temp *= 10;
                            break;
                        case 1:
                            temp *= 100;
                            break;
                        case 2:
                            temp *= 1000;
                            break;
                        case 3:
                            temp *= 10000;
                            break;
                        case 4:
                            temp *= 100000000;
                            break;
                        default:
                            break;
                        }
                        count++;
                    }
                }
            }
            if (i == chineseNumber.length() - 1) {//���������һ���ַ�
                result += temp;
            }
        }
        return result;
	}
	
	public void getTotalTime()
	{
		System.out.println(this.totalTime);
	}
}
