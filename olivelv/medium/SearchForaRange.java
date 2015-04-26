package olivelv.medium;

/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月26日 下午1:35:23
 */
class BSTNode{
	int val;
	int idx;
	BSTNode left;
	BSTNode right;
	public BSTNode(int val,int idx){
		this.val=val;
		this.idx=idx;
		left=null;
		right=null;
	}
}
public class SearchForaRange {
	int max,min;
	public int[] searchRange(int[] nums, int target) {
		int []range=new int[2];
		int n=nums.length;
		if(n==0){
			range[0]=-1;
			range[1]=-1;
			return range;
		}
		BSTNode root=buildBST(nums,0,n-1);
		max=-1;
		min=n;
		searchBST(root,target);
		if(max==-1){
			range[0]=-1;
			range[1]=-1;
		}else{
			range[0]=min;
			range[1]=max;
		}
		return range;
	}
	public BSTNode buildBST(int []num,int l,int r){
		int mid=(l+r+1)/2;
		if(l>r)return null;
		//System.out.println(l+" "+r+" "+num[mid]);
		BSTNode root=new BSTNode(num[mid],mid);
		root.left=buildBST(num,l,mid-1);
		root.right=buildBST(num,mid+1,r);
		return root;
	}
	public void searchBST(BSTNode root,int target){
		if(root==null)return ;
		if(root.val==target){
			if(max<root.idx)max=root.idx;
			if(min>root.idx)min=root.idx;
			searchBST(root.left,target);
			searchBST(root.right,target);
			return ;
		}
		if(root.val>target){
			searchBST(root.left,target);
			return ;
		}
		if(root.val<target){
			searchBST(root.right,target);
			return ;
		}
	}
	public static void main(String []args){
		int nums[]={5, 7, 7, 8, 8, 10};
		SearchForaRange test=new SearchForaRange();
		int range[]=test.searchRange(nums, -1);
		System.out.println(range[0]+" "+range[1]);
	}
}
