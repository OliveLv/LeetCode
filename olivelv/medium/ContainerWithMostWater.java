package olivelv.medium;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月24日 下午9:49:51
 */
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int max=Integer.MIN_VALUE;
		int n=height.length;
		int left=0,right=n-1;
		if(n<2)return 0;
		while(left<right){
			max=Math.max(max, Math.min(height[left], height[right])*(right-left));
			if(height[left]<height[right])left++;
			else
				right--;
		}
		return max;
	}
}
