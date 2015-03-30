package olivelv.easy;

public class ClimbingStairs {
	
	
	 public int climbStairs(int n) {
	       int num=1;
	       if(n<=2)return n;
	       /*int []a=new int[n+1];
	       a[1]=1;
	       a[2]=2;
	       for(int i=3;i<=n;i++)
	    	   a[i]=a[i-1]+a[i-2];*/
	       int f1=1,f2=2,f=0;
	       for(int i=3;i<=n;i++){
	    	   f=f1+f2;
	    	   f1=f2;
	    	   f2=f;
	       }
	       return f;
	    }
	 public static void main(String []args){
		 ClimbingStairs test=new ClimbingStairs();
		 System.out.println(test.climbStairs(4));
	 }
}
