package olivelv.easy;

/**
 * Description:
 * 
 * Count the number of prime numbers less than a non-negative number, n
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月2日 下午8:57:19
 */
public class CountPrimes {
	public int countPrimes(int n) {
		int s=0;
		if(n<=2)return 0;
		int []prime=new int[n+1];
		prime[1]=1;
		for(int i=2;i<n;i++){
			if(prime[i]==0){
				for(int j=2*i;j<n;j+=i)prime[j]=1;
			}
		}
		for(int i=2;i<n;i++)
			if(prime[i]==0)s++;
		/*for(int i=2;i<=n;i++)
			if(prime[i]==0)System.out.print(i+" ");*/
		return s; 
	}
	public static void main(String []args){
		CountPrimes test=new CountPrimes();
		test.countPrimes(20);
	}
}
