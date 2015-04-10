package olivelv.difficult;

/**
 * Follow up for problem "Populating Next Right Pointers in Each Node".

 What if the given tree could be any binary tree? Would your previous solution still work?

 Note: 
 •You may only use constant extra space.


 For example,
 Given the following binary tree,

 1
 /  \
 2    3
 / \    \
 4   5    7



 After calling your function, the tree should look like:

 1 -> NULL
 /  \
 2 -> 3 -> NULL
 / \    \
 4-> 5 -> 7 -> NULL


 */
import java.util.LinkedList;
import java.util.Queue;

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

public class PopulatingNextRightPointersinEachNodeII {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		int n = 1;
		TreeLinkNode q = null;
		while (!queue.isEmpty()) {
			int ans = 0;
			for (int i = 0; i < n; i++) {
				TreeLinkNode p = queue.poll();
				if (i != n - 1) {
					q = queue.peek();
					p.next = q;
				}
				if (p.left != null) {
					queue.add(p.left);
					ans++;
				}
				if (p.right != null) {
					queue.add(p.right);
					ans++;
				}
			}
			n = ans;
		}
	}
}
