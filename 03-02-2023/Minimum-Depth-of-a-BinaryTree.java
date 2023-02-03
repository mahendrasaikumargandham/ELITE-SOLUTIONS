import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
public class Solution {
    public static int minDepth(BinaryTreeNode<Integer> root) {
        // Write your code here.
		if(root == null)
			return 0;

		if(root.left == null && root.right == null)
			return 1;
		
		int left = minDepth(root.left);
		int right = minDepth(root.right);
	
		int result = (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
		return result;
    }
}
