package olivelv.medium;

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
	public String simplifyPath(String path) {
		String []paths=path.split("/");
		//System.out.println(paths.length);
        return "/"+paths[paths.length-1];
	}
	public static void main(String []args){
		SimplifyPath test=new SimplifyPath();
		String str="c";
		System.out.println(test.simplifyPath(str));
	}
}
