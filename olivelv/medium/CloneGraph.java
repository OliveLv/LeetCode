package olivelv.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors. 


 OJ's undirected graph serialization: 
 Nodes are labeled uniquely. 
 We use # as a separator for each node, and , as a separator for node label and each neighbor of the node. 

 As an example, consider the serialized graph {0,1,2#1,2#2,2}. 

 The graph has a total of three nodes, and therefore contains three parts as separated by #. 
 1.First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 2.Second node is labeled as 1. Connect node 1 to node 2.
 3.Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.


 Visually, the graph looks like the following: 
 1
 / \
 /   \
 0 --- 2
 / \
 \_/


 * 
 * @author olivelv
 * @version time: 2015年4月28日 下午6:48:54
 */
/**
 * Definition for undirected graph. class UndirectedGraphNode { int label;
 * List<UndirectedGraphNode> neighbors; UndirectedGraphNode(int x) { label = x;
 * neighbors = new ArrayList<UndirectedGraphNode>(); } };
 */
class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}

public class CloneGraph {
	public void print(UndirectedGraphNode node) {
		System.out.println(node.label);
		for (UndirectedGraphNode nod : node.neighbors) {
			print(nod);
		}
	}

	// BFS
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		UndirectedGraphNode root = null;
		if (node == null)
			return root;
		Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
		int label = node.label;
		root = new UndirectedGraphNode(label);
		// will occur
		/**
		 * Input: {0,0,0}
		 * 
		 * 
		 * 
		 * Output: Node with label 0 was not copied but a reference to the
		 * original one.
		 * 
		 * 
		 * 
		 * Expected: {0,0,0}
		 */
		// root.neighbors=new ArrayList<UndirectedGraphNode>(node.neighbors);
		map.put(label, root);
		UndirectedGraphNode p = null;
		Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			UndirectedGraphNode nbor = queue.poll();
			label = nbor.label;
			if (map.containsKey(label))
				p = map.get(label);
			else
				p = new UndirectedGraphNode(label);
			// p.neighbors=new ArrayList<UndirectedGraphNode>(nbor.neighbors);
			// map.put(label, p);
			for (UndirectedGraphNode ele : nbor.neighbors) {
				if (!map.containsKey(ele.label)) {
					if (!map.containsKey(ele.label))
						queue.add(ele);
					map.put(ele.label, new UndirectedGraphNode(ele.label));
				}
				p.neighbors.add(map.get(ele.label));

			}
		}
		return root;
	}

	public static void main(String[] args) {
		// 0,0,0
		CloneGraph test = new CloneGraph();
		UndirectedGraphNode node0 = new UndirectedGraphNode(0);
		/*
		 * UndirectedGraphNode node1=new UndirectedGraphNode(1);
		 * UndirectedGraphNode node2=new UndirectedGraphNode(2);
		 * UndirectedGraphNode node3=new UndirectedGraphNode(3);
		 * UndirectedGraphNode node4=new UndirectedGraphNode(4);
		 * UndirectedGraphNode node5=new UndirectedGraphNode(5);
		 */
		node0.neighbors.add(node0);
		node0.neighbors.add(node0);

		/*
		 * node1.neighbors.add(node2); node1.neighbors.add(node5);
		 * 
		 * node2.neighbors.add(node3);
		 * 
		 * node3.neighbors.add(node4); node3.neighbors.add(node4);
		 * 
		 * node4.neighbors.add(node5); node4.neighbors.add(node5);
		 */

		// test.print(node0);
		test.cloneGraph(node0);
	}
}
