package olivelv.difficult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationsII {
	Map<String,Integer>map=new HashMap<String,Integer>();
	List<List<Integer>>res=new ArrayList<List<Integer>>();
	public boolean isValid(int []flag){
		for(int i=0;i<flag.length;i++)
			if(flag[i]==0)return false;
		return true;
	}
	public List<List<Integer>>permuteUnique(int[] nums) {
		
		int n=nums.length;
		if(n==0)return res;
		int []flag=new int[n];
		for(int i=0;i<n;i++){
			if(flag[i]==0){
				List<Integer> list=new ArrayList<Integer>();
				dfs(i,list,nums,flag,"");
			}
		}
	/*	for(int i=0;i<res.size();i++){
			List<Integer>list=res.get(i);
			for(int ele:list){
				System.out.print(ele+" ");
			}
			System.out.println();
		}*/
		return res;
	}
	public void dfs(int idx,List<Integer>list,int []num,int []flag,String hash){
		int n=num.length;
		flag[idx]=1;
		list.add(num[idx]);
		hash+=num[idx];
		int m=list.size();
		if(m==n){
			if(!map.containsKey(hash)){   // use map.get(hash)==null will lead to TLE
				map.put(hash, 1);
				res.add(new ArrayList<Integer>(list));
			}
			flag[idx]=0;
			list.remove(m-1);
			return ;
		}
		for(int i=0;i<n;i++){
			if(flag[i]==0){
				dfs(i,list,num,flag,hash);
			}
		}
		flag[idx]=0;
		list.remove(list.size()-1);
	}
	public static void main(String []args){
		PermutationsII test=new PermutationsII();
		int []num={3,3,0,0,2,3,2};
		test.permuteUnique(num);
	}
}
