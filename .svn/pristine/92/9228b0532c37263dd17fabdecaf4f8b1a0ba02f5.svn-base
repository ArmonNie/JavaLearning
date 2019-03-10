package BaseJavaClass;

/*
 * 使用正则表达式对于输入进行匹配得到时间
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
		String t1 = "([一二三四五六七八九十0123456789]+((小时)|(时)))?([一二三四五六七八九十0123456789]+((分钟)|(分)))?([一二三四五六七八九十0123456789]+((秒)))?";
		Pattern p = Pattern.compile(t1);
		Matcher m = p.matcher(testStr);
		boolean b = m.matches();
		//System.out.println("" + b + "" + m.find());
		while(m.find())
		{
			//System.out.println("" + m.group());
			strTime += m.group();//必须用加号
		}
		System.out.println("时间是：" + strTime);
	}

	public void getHourStr() {
		String t2 = "[一二三四五六七八九十0123456789]+((小时)|(时))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strHour += m.group();//必须用加号
		}
		System.out.println("小时是：" + strHour);
	}
	
	public void getMinStr() {
		String t2 = "[一二三四五六七八九十0123456789]+((分钟)|(分))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strMin += m.group();//必须用加号
		}
		System.out.println("分钟是：" + strMin);
	}
	
	public void getSecStr() {
		String t2 = "[一二三四五六七八九十0123456789]+((秒))";
		Pattern p = Pattern.compile(t2);
		Matcher m = p.matcher(testStr);
		
		while(m.find())
		{
			//System.out.println("" + m.group());
			strSec += m.group();//必须用加号
		}
		System.out.println("秒是：" + strSec);
	}
	
	public void getHourList()
	{
		System.out.println("代处理数据为：" + strHour);
		char[] chour = new char[5];
		chour = strHour.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != '小' && chour[i] != '时')
			{
				String temp = "" + chour[i];
				hList.add(temp);
			}
		}
		hourLength = hList.size();
		hListFlag = getFlags(hList);
		System.out.println("处理中获得小时位数为：" +  hourLength);
	}
	
	public void getMinList()
	{
		System.out.println("代处理数据为：" + strMin);
		char[] chour = new char[5];
		chour = strMin.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != '分' && chour[i] != '钟')
			{
				String temp = "" + chour[i];
				mList.add(temp);
			}
		}
		minLength = mList.size();
		mListFlag = getFlags(mList);
		System.out.println("处理中获得分钟位数为：" +  minLength);
	}
	
	public void getSecList()
	{
		System.out.println("代处理数据为：" + strSec);
		char[] chour = new char[5];
		chour = strSec.toCharArray();
		for(int i = 0;i<chour.length;i++)
		{
			System.out.println(chour[i]);
			if(chour[i] != '秒')
			{
				String temp = "" + chour[i];
				sList.add(temp);
			}
		}
		secLength = sList.size();
		sListFlag = getFlags(sList);
		System.out.println("处理中获得秒位数为：" +  secLength);
	}
	
	public void getHour()
	{
		int x;
		if(hListFlag == true)
		{
			String str = this.getStringFromList(hList);
			x = Integer.parseInt(str);
			System.out.println("小时的数值为：" + x);
		}
		else
		{
			x = this.getDealedStringFromList(hList);
			System.out.println("小时的数值为：" + x);
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
			System.out.println("分钟的数值为：" + x);
		}
		else
		{
			x = this.getDealedStringFromList(mList);
			System.out.println("分钟的数值为：" + x);
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
			System.out.println("秒的数值为：" + x);
		}
		else
		{
			x = this.getDealedStringFromList(sList);
			System.out.println("秒的数值为：" + x);
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
        int temp = 1;//存放一个单位的数字如：十万
        int count = 0;//判断是否有chArr
        char[] cnArr = new char[]{'一','二','三','四','五','六','七','八','九'};
        char[] chArr = new char[]{'十','百','千','万','亿'};
        for (int i = 0; i < chineseNumber.length(); i++) {
            boolean b = true;//判断是否是chArr
            char c = chineseNumber.charAt(i);
            for (int j = 0; j < cnArr.length; j++) {//非单位，即数字
                if (c == cnArr[j]) {
                    if(0 != count){//添加下一个单位之前，先把上一个单位值添加到结果中
                        result += temp;
                        temp = 1;
                        count = 0;
                    }
                    // 下标+1，就是对应的值
                    temp = j + 1;
                    b = false;
                    break;
                }
            }
            if(b){//单位{'十','百','千','万','亿'}
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
            if (i == chineseNumber.length() - 1) {//遍历到最后一个字符
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
