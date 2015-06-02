package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月2日 下午3:42:36
 */
public class GenerateParentheses {
	List<String>res;
	public void dfs(String str,int left,int right,int n){
		if(left==n&&right==n){
			res.add(new String(str));
		}
		if(left<n)dfs(str+"(",left+1,right,n);
		if(right<n&&left>right)dfs(str+")",left,right+1,n);
	}
	public List<String> generateParenthesis(int n) {
		res=new ArrayList<String>();
		dfs("",0,0,n);
		for(String str:res){
			System.out.println(str);
		}
		return res;
	}
	public static void main(String []args){
		GenerateParentheses test=new GenerateParentheses();
		test.generateParenthesis(3);
	}
}
