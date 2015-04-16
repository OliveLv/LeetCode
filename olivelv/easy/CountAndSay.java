package olivelv.easy;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211.
 * 
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月16日 下午4:50:32
 */
public class CountAndSay {
	public String countAndSay(int n) {
		String s="1";
		for(int i=1;i<n;i++){
			//System.out.println(s);
			s=getVal(s);
		}
		return s;
	}
	public String getVal(String s){
		int n=s.length();
		String str="";
		for(int i=0;i<n;){
			char c=s.charAt(i);
			int j=i+1;
			while(j<n&&s.charAt(j)==c)j++;
			str+=(j-i);
			str+=c;
			i=j;
			//System.out.println("  "+str);
		}
		return str;
	}
	public static void main(String []args){
		CountAndSay test=new CountAndSay();
		System.out.println(test.countAndSay(6));
	}
}
