package Transform;

/*
 * @Author:Armon
 * @Date:2019.12.21
 * 功能：类型之间互相转换
 * 1.String-》Int
 */
public class Transformer {
	
	//标志功能
	/*
	 * 默认为-1，不进行转换
	 * 数字0，由String转换为Int值
	 */
	private int tag = -1;
	
	//用于存值的空间
	private String sTemp;
	private int iTemp;
	
	//本构造函数用于创建用于转换String与Int类型的对象
	public Transformer(String s,int t) {
		this.sTemp = s;
		this.tag = t;
	}
	
	//把String装为int值
	public int TransformStrToInt(){
		this.iTemp = Integer.parseInt(this.sTemp,10);
		return iTemp;
	}

}
