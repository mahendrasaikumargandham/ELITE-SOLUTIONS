import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		class TreeNode {
			int offset;
			BinaryTreeNode root;

			public TreeNode(int offset, BinaryTreeNode root) {
				this.offset = offset;
				this.root = root;
			}
		}

		Queue<TreeNode> queue = new LinkedList<>();
		Map<Integer, Integer> map = new TreeMap<>();
		ArrayList<Integer> arr = new ArrayList<>();

		if(root == null)
			return new ArrayList<>();
		
		queue.offer(new TreeNode(0, root));
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if(!map.containsKey(temp.offset))
				map.put(temp.offset, temp.root.val);

			if(temp.root.left != null)
				queue.offer(new TreeNode(temp.offset-1, temp.root.left));
			
			if(temp.root.right != null)
				queue.offer(new TreeNode(temp.offset+1, temp.root.right));
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			arr.add(entry.getValue());
		}
		return arr;
	}
}
