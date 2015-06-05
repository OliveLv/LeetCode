package olivelv.easy;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility) P A H N A P L S I I G Y I R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * 
 * Write the code that will take a string and make this conversion given a
 * number of rows: string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * understanding the meaning of problem
 * https://leetcode.com/discuss/35640/please-help-understand-question-description-about-pattern
 * @author olivelv
 * @version time: 2015年6月5日 上午9:52:25
 */
public class ZigZagConversion {
	public String convert(String s, int numRows) {
		String str="";
		int n=s.length();
		int base=2*numRows-2;
		if(numRows==1)return s;
		for(int i=0;i<n;i+=base)
			str+=s.charAt(i);
		for(int i=1;i<numRows-1;i++){
			int ans=base-2*i;
			for(int j=i;j<n;){
				str+=s.charAt(j);
				j+=ans;
				ans=base-ans;
			}
			
		}
		for(int i=numRows-1;i<n;i+=base)
			str+=s.charAt(i);
		
		return str;
	}
	public static void main(String []args){
		ZigZagConversion test=new ZigZagConversion();
		System.out.println(test.convert("ABCD", 4));
	}
}
