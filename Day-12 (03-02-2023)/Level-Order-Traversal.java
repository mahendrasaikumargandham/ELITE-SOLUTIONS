import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    ArrayList<Integer> arr = new ArrayList<>();
	Queue<BinaryTreeNode> queue = new LinkedList<>();
	if(root == null)
		return arr;
	queue.offer(root);

	while(!queue.isEmpty()) {
		int size = queue.size();
		for(int i=1;i<=size;i++) {
			BinaryTreeNode element = queue.poll();
			arr.add(element.val);
			if(element.left != null)
				queue.offer(element.left);
			
			if(element.right != null)
				queue.offer(element.right);
		}
	}
	return arr;
  }

}
