package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out
 * of 1 ... n.
 * 
 * For example, If n = 4 and k = 2, a solution is: [ [2,4], [3,4], [2,3], [1,2],
 * [1,3], [1,4], ]
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月20日 下午10:20:08
 */
public class Combinations {
	List<List<Integer>>res=new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n, int k) {
		
		if(n<k)return res;
		if(n==k){
			List<Integer>list=new ArrayList<Integer>();
			for(int i=1;i<=n;i++)list.add(i);
			res.add(list);
			return res;
		}
		int []flag=new int[n+1];
		for(int i=1;i<=n;i++){
			if(flag[i]==0){
				
			}
			
		}
		dfs(1,new ArrayList<Integer>(),n,k,1,flag);
		for(int i=0;i<res.size();i++){
		List<Integer>list=res.get(i);
		for(int ele:list){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
		return res;
	}
	public void dfs(int idx,List<Integer>list,int n,int k,int num,int []flag){
		//System.out.println(idx+" "+n+" "+k+" "+num);
		if(idx>n)return ;
		flag[idx]=1;
		list.add(idx);
		if(num==k){
			res.add(new ArrayList<Integer>(list));
			flag[idx]=0;
			list.remove(list.size()-1);
			dfs(idx+1,list,n,k,num,flag);
			return ;
		}
		dfs(idx+1,list,n,k,num+1,flag);
		flag[idx]=0;
		list.remove(list.size()-1);
		dfs(idx+1,list,n,k,num,flag);
	}
	public static void main(String []args){
		Combinations test=new Combinations();
		test.combine(5, 2);
	}
}
