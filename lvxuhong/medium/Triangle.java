package lvxuhong.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you
 * may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 * 
 * [ [2], [3,4], [6,5,7], [4,1,8,3] ]
 * 
 * 
 * 
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 * @author xuhong
 *
 */
public class Triangle {
	int min = Integer.MAX_VALUE;

	int min2(int a, int b) {
		return a > b ? b : a;
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		// minimumTotal(triangle,0,0,0);
		int n = triangle.size();

		//int[][] res = new int[n][n];
		List<Integer> listp = null;
		List<Integer> list = null;
		if (n == 1) {
			list = triangle.get(0);
			return list.get(0);
		}
		for (int i = 1; i < n; i++) {
			listp = triangle.get(i - 1);
			list = triangle.get(i);
			int m = list.size();
			for (int j = 0; j < m; j++) {
				int temp = list.get(j);
				if (j == 0)
					temp += listp.get(j);
				else if (j == m - 1)
					temp += listp.get(j - 1);
				else
					temp += min2(listp.get(j - 1), listp.get(j));
				list.set(j, temp);
			}
		}
		for (int elem : list) {
			if (min > elem)
				min = elem;
		}
		return min;

	}

	public void minimumTotal(List<List<Integer>> triangle, int i, int j, int s) {
		int l = triangle.size();
		// System.out.println(l);
		if (min < s)
			return;
		if (i == l) {
			if (min > s)
				min = s;
			return;
		}
		List<Integer> list = triangle.get(i);

		int val = list.get(j);
		s += val;

		minimumTotal(triangle, i + 1, j, s);
		minimumTotal(triangle, i + 1, j + 1, s);
	}

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> elem = new ArrayList<Integer>();
		elem.add(-10);
		triangle.add(elem);
		// System.out.println(triangle.size());
		Triangle test = new Triangle();
		System.out.println(test.minimumTotal(triangle));
	}
}
