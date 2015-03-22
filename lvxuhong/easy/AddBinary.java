package lvxuhong.easy;
/**
 * Given two binary strings, return their sum (also a binary string). 

For example,
 a = "11"
 b = "1"
 Return "100". 

 * @author xuhong
 *
 */
public class AddBinary {
	public int getNum(String s){
		int l=s.length();
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum=sum*2+(s.charAt(i)-'0');
		}
		return sum;
	}
	 public String addBinary(String a, String b) {
	     String s="";
	     int la=a.length(),lb=b.length();
	     int temp=0,i,j;
	     for(i=la-1,j=lb-1;i>=0&&j>=0;i--,j--){
	    	 int x=a.charAt(i)-'0';
	    	 int y=b.charAt(j)-'0';
	    	 temp+=x+y;
	    	 s+=(char)(temp%2+'0');
	    	 temp=temp/2;
	     }
	     for(;i>=0;i--){
	    	 int x=a.charAt(i)-'0';
	    	 temp+=x;
	    	 s+=(char)(temp%2+'0');
	    	 temp=temp/2;
	     }
	     for(;j>=0;j--){
	    	 int y=b.charAt(j)-'0';
	    	 temp+=y;
	    	 s+=(char)(temp%2+'0');
	    	 temp=temp/2;
	     }
	     while(temp!=0){
	    	 s+=(char)(temp%2+'0');
	    	 temp=temp/2;
	     }
	     String str="";
	     for(i=s.length()-1;i>=0;i--)str+=s.charAt(i);
	     return str;
	    }
	 public static void main(String []args){
		 AddBinary test=new AddBinary();
		 System.out.println(test.addBinary("11", "1"));
	 }
}
