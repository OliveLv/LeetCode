package olivelv.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example, [1,2,3] have the following permutations: [1,2,3], [1,3,2],
 * [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月20日 下午9:46:52
 */
public class Permutations {
	Map<String,Integer>map=new HashMap<String,Integer>();
	List<List<Integer>>res=new ArrayList<List<Integer>>();
	public boolean isValid(int []flag){
		for(int i=0;i<flag.length;i++)
			if(flag[i]==0)return false;
		return true;
	}
	public List<List<Integer>> permute(int[] num) {
		
		int n=num.length;
		if(n==0)return res;
		int []flag=new int[n];
		for(int i=0;i<n;i++){
			if(flag[i]==0){
				List<Integer> list=new ArrayList<Integer>();
				dfs(i,list,num,flag,"");
			}
		}
		/*for(int i=0;i<res.size();i++){
			List<Integer>list=res.get(i);
			for(int ele:list){
				System.out.print(ele+" ");
			}
			System.out.println();
		}*/
		return res;
	}
	public void print(List<Integer>list){
		for(int ele:list){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public void dfs(int idx,List<Integer>list,int []num,int []flag,String hash){
		int n=num.length;
		flag[idx]=1;
		list.add(num[idx]);
		hash+=num[idx];
		//print(list);
		/*for(int i=0;i<n;i++){
			System.out.print(flag[i]+" ");
		}
		System.out.println();*/
		if(isValid(flag)){
			if(map.get(hash)==null){
				map.put(hash, 1);
				res.add(new ArrayList<Integer>(list));
				
			}
			flag[idx]=0;
			list.remove(list.size()-1);
			//list=new ArrayList<Integer>();
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
		Permutations test=new Permutations();
		int []num={1,2,3};
		test.permute(num);
	}
}
