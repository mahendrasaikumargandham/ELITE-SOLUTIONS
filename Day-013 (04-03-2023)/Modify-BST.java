import java.util.* ;
import java.io.*; 
/********************************************************

    Following is the Binary Tree node structure:
    
	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
    
*********************************************************/

public class Solution {
	public static BinaryTreeNode<Integer> modifyTree(BinaryTreeNode<Integer> root, int low, int high) {
		if(root == null)
			return null;
		
		if(root.data > high) {
			root = modifyTree(root.left, low, high);
		}
		else if(root.data < low) {
			root = modifyTree(root.right, low, high);
		}
		else if(root.data == low) {
			root.left = null;
			root.right = modifyTree(root.right, low, high);
		}
		else if(root.data == high) {
			root.right = null;
			root.left = modifyTree(root.left, low, high);
		}
		else {
			root.left = modifyTree(root.left, low, high);
			root.right = modifyTree(root.right, low, high);
		}

		return root;
 	}
}
