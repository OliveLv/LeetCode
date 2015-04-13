package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's
 * sum equals the given sum. For example: Given the below binary tree and sum =
 * 22, 5 / \ 4 8 / / \ 11 13 4 / \ / \ 7 2 5 1
 * 
 * 
 * return
 * 
 * [ [5,4,11,2], [5,8,4,5] ]
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月13日 上午11:26:57
 */
public class PathSumII {
	// 节点中val可能为负数
	// sum可能为0
	 List<List<Integer>>res=new ArrayList<List<Integer>>();
		public List<List<Integer>> pathSum(TreeNode root, int sum) {
			//List<List<Integer>>res=new ArrayList<List<Integer>>();
			if(root==null)return res;
			List<Integer>list=new ArrayList<Integer>();
			dfs(root,list,sum);
			/*System.out.println(res.size());
			for(List<Integer>lists:res){
				for(int ele:lists)
					System.out.print(ele+" ");
				System.out.println();
			}*/
		    return res;

		}
		public void dfs(TreeNode root,List<Integer>list,int sum){
			if(root.left==null&&root.right==null){
				if(sum-root.val==0){
					List<Integer>s=new ArrayList<Integer>(list); //复制list，否则保存的list会不断改变
					s.add(root.val);
					res.add(s);
				}
				return ;
			}
			sum-=root.val;
			list.add(root.val);
			
			/*for(int ele:list){
				System.out.print(ele+" ");
				
			}
			System.out.println();
			System.out.println(sum);*/
			if(root.left!=null)dfs(root.left,list,sum);
			if(root.right!=null)dfs(root.right,list,sum);
			list.remove(list.size()-1);
			return ;
		}
	public static void main(String []args){
		PathSumII test=new PathSumII();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		test.pathSum(root, 1);
		/*TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.right=new TreeNode(8);
		TreeNode p=root.left;
		p.left=new TreeNode(11);
		p=p.left;
		p.left=new TreeNode(7);
		p.right=new TreeNode(2);
		p=root.right;
		p.left=new TreeNode(13);
		p.right=new TreeNode(4);
		p=p.right;
		p.left=new TreeNode(5);
		p.right=new TreeNode(1);
		test.pathSum(root, 22);*/
		
	}
}
