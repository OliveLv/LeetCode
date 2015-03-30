package olivelv.easy;

public class NumberOf1Bits {
	 // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int num=0;
        while(n!=0){
        	if((n&1)==1)num++;
        	n>>>=1;//>>>±íÊ¾ÎŞ·ûºÅÓÒÒÆ
        }
        return num;
    }
    public static void main(String []args){
    	NumberOf1Bits test=new NumberOf1Bits();
    	System.out.println(test.hammingWeight(1));
    	System.out.println(test.hammingWeight(-1));
    	System.out.println(test.hammingWeight(0));
    	System.out.println(test.hammingWeight(11));
    	
    }
}
