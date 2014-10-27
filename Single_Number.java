import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Single_Number {
	//hash A[i],in hash table,key=A[i],value=#A[i]
	//Search keySet to find key whose value=1
	public int singleNumber(int[] A) {
		int sum=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=A.length;
		for(int i=0;i<n;i++){
			Object temp=map.get(A[i]);
			if(temp==null)map.put(A[i], 1);
			else
				map.put(A[i], 2);
		}
		Iterator it=map.keySet().iterator();
		while(it.hasNext()){
			int key=(int)it.next();
			int value=map.get(key);
			if(value==1)return key;
			
		}
		
		return sum;

	}
	//XOR
	//A XOR A =0,0 XOR A=A,A XOR B XOR A =B
	//https://oj.leetcode.com/discuss/9739/easiest-way-to-solve-by-using-bit-manipulation
	public int singleNumber1(int[] A){
		int n=A.length,result=0;
		for(int i=0;i<n;i++){
			result=result^A[i];
		}
		return result;
	}
	//using Hashmap
	public int singleNumber2(int[] A){
		int n=A.length,real_sum=0,sum=0;
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		for(int i=0;i<n;i++){
			real_sum+=A[i];
			map.put(A[i], true);
		}
		Iterator it=map.keySet().iterator();
		while(it.hasNext()){
			int key=(int)it.next();
			sum+=key;
		}
		return 2*sum-real_sum;
	}
	public static void main(String[] args){
		int A[]={1,2,3,4,3,2,1};
		Single_Number test=new Single_Number();
		System.out.println(test.singleNumber2(A));
	}
}
