package olivelv.easy;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * 
 * Each rectangle is defined by its bottom left corner and top right corner as
 * shown in the figure. Assume that the total area is never beyond the maximum
 * possible value of int. RectangleArea.java
 * 
 * @author olivelv
 * @version time: Jun 8, 2015 10:41:32 PM
 */
public class RectangleArea {
    private int min(int a,int b){
    	return a>b?b:a;
    }
    private int max(int a,int b){
    	return a>b?a:b;
    }
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int s1=(A-C)*(B-D);
		int s2=(E-G)*(F-H);
		//int s3=
		int down=max(B,F);
		int up=min(D,H);
		int left=max(E,A);
		int right=min(C,G);
		if(left>right&&down>up)return s1+s2;
		int s3=(up-down)*(right-left);
		//System.out.println("("+left+","+down+")"+"("+right+","+up+")"+s1+" "+s3+" "+s2);
		if(s3<=0)return s1+s2;
		return s1+s2-s3;
	}
	public static void main(String []args){
		RectangleArea test=new RectangleArea();
		System.out.println(test.computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
	}
}
