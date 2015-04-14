package olivelv.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * Note:
 * 
 * •Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤
 * b ≤ c ≤ d) •The solution set must not contain duplicate quadruplets.
 * 
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月13日 下午11:58:01
 */
public class Sum4 {
	public boolean find(int []num,int target,int i){
		for(;i<num.length;i++)
			if(num[i]==target)return true;
		return false;
	}
	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>>lists=new ArrayList<List<Integer>>();
		Map<String,Integer>map=new HashMap<String,Integer>();
		Arrays.sort(num);
		int n=num.length;
		for(int i=0;i<n;i++){
			String s=String.valueOf(num[i]);
			int val=target-num[i];
			if(val<num[i])continue;
			for(int j=i+1;j<n;j++){
				s+=num[j];
				val-=num[j];
				if(val<num[j])continue;
				for(int k=j+1;k<n;k++){
					s+=num[k];
					val-=num[k];
					if(val<num[k])continue;
					if(find(num,val,k+1)){
						s+=val;
						if(map.get(s)==null){
						List<Integer>list=new ArrayList<Integer>();
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[k]);
						list.add(val);
						lists.add(list);
						map.put(s, 1);
						}
					}
					
				}
			}
		}
		return lists;
	}
}
