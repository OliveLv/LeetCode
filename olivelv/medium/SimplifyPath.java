package olivelv.medium;

import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example, path = "/home/", => "/home" path = "/a/./b/../../c/", => "/c"
 * 
 * 
 * @author olivelv
 * @version time: 2015年3月31日 下午7:12:36
 */
public class SimplifyPath {
	//not deal
	public String simplifyPath(String path) {
		String []paths=path.split("/");
        Stack<String> stack = new Stack<String>();
		for(String s:paths){
			if(s.equals("..")&&!stack.isEmpty())stack.pop();
			else if(!s.equals(".")&&!s.equals("..")&&!s.equals(""))stack.push(s);
		}
		return null;
		// return "/" + String.join("/", stack);
	}
	public static void main(String []args){
		SimplifyPath test=new SimplifyPath();
		String str="/.";
		System.out.println(test.simplifyPath(str));
	}
}
