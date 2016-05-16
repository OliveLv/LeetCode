/**   
* @Title: TopKFrequentElements.java 
* @author lxh  
* @date May 16, 2016 8:58:27 PM  
* 
*/
package olivelv.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        ValueComparator vc=new ValueComparator(map);
        TreeMap<Integer,Integer>map_sort=new TreeMap<Integer,Integer>(vc);
        int n=nums.length;
        List<Integer>res=new ArrayList<Integer>();
        if(k==0)return res;
        for(int i=0;i<n;i++){
            int cnt=0;
            if(map.containsKey(nums[i]))cnt=map.get(nums[i]);
            map.put(nums[i],cnt+1);
        }
        map_sort.putAll(map);
        //System.out.println(map.size());
        //System.out.println(map_sort.size());
        int ans=0;
        System.out.println(map_sort);
        System.out.println(map);
        for(int e:map_sort.keySet()){
        	//System.out.println(e+" "+map_sort.get(e));
            res.add(e);
            ans++;
            if(ans==k)break;
        }
        return res;
    }
    public static void main(String []args){
    	Scanner cin=new Scanner(System.in);
    	int n=cin.nextInt();
    	int[]nums=new int[n];
    	for(int i=0;i<n;i++)
    		nums[i]=cin.nextInt();
    	int k=cin.nextInt();
    	TopKFrequentElements test=new TopKFrequentElements();
    	List<Integer>res=test.topKFrequent(nums, k);
    	for(int val:res){
    		System.out.print(val+" ");
    	}
    	System.out.println();
    }
}
class ValueComparator implements Comparator{
	Map<Integer,Integer>map;
	public ValueComparator(Map<Integer,Integer>map){
		this.map=map;
	}
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int a=map.get(o1);
		int b=map.get(o2);
		return a>=b?-1:1;
	}
	
}