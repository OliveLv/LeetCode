package olivelv.medium;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store
 * values 1...n?
 * 
 * For example, Given n = 3, there are a total of 5 unique BST's.
 * 
 * UniqueBinarySearchTrees.java
 * 
 * @author olivelv
 * @version time: Jun 12, 2015 9:12:59 PM
 */
public class UniqueBinarySearchTrees {
	// using Catalan Number ,C(2n,n)/(n+1)
	public int numTrees(int n) {
		long s=1;
		for(int i=n+1,j=1;i<=2*n;i++,j++){
			s=s*i/j;
		}
		return (int) (s/(n+1));
	}
	public static void main(String []args){
		UniqueBinarySearchTrees test=new UniqueBinarySearchTrees();
		System.out.println(test.numTrees(3));
	}
}
