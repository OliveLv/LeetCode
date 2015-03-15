package lvxuhong.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] num) {
       int n=num.length;
       Map<Integer,Integer>map=new HashMap<Integer,Integer>();
       int ele=0;
       for(int i=0;i<n;i++){
    	   ele=num[i];
    	   int count=map.get(ele)!=null?(Integer)map.get(ele):0;
    	   if(count+1>n/2)break;
    	   map.put(ele, count+1);
       }
       return ele;
	}
	public static void main(String []args){
		MajorityElement test=new MajorityElement();
		int []num={6,5,5};
		System.out.println(test.majorityElement(num));
	}
}
