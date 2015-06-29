package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * SummaryRanges.java
 * 
 * @author olivelv
 * @version time: Jun 29, 2015 8:44:46 AM
 */
public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String>res=new ArrayList<String>();
		int n=nums.length;
		if(n==0)return res;
		String s=""+nums[0];
		int begin=nums[0];
		for(int i=1;i<n;i++){
			if(nums[i]!=nums[i-1]+1){
				if(nums[i-1]!=begin)s+="->"+nums[i-1];
					res.add(s);
					begin=nums[i];
					s=""+nums[i];	
			}
			
		}
		if(nums[n-1]!=begin)s+="->"+nums[n-1];
		res.add(s);
		return res;
	}
	public static void main(String []args){
		SummaryRanges test=new SummaryRanges();
		int []nums={0,2,3,4};
		List<String>list=test.summaryRanges(nums);
		for(String str:list)
			System.out.print(str+" ");
	}
}
