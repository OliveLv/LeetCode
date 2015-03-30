package olivelv.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	public int singleNumber(int[] A) {
        int n=A.length;
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
        	int count=(map.get(A[i])!=null?(int)map.get(A[i]):0)+1;
        	map.put(A[i], count);
        }
        for(int i=0;i<n;i++)if((int)map.get(A[i])!=3)return A[i];
        return 0;
	}
}
