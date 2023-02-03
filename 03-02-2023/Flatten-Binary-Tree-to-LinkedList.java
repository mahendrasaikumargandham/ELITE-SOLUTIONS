import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
	static void inorder(TreeNode<Integer> root, List<Integer> arr) {
		if(root == null)
			return;
		
		arr.add(root.data);
		inorder(root.left, arr);
		inorder(root.right, arr);
	}
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
		List<Integer> arr = new ArrayList<>();
        if(root == null)
			return null;
		
		inorder(root, arr);
		TreeNode temp = new TreeNode(arr.get(0));
		TreeNode curr = temp;
		for(int i=1;i<arr.size();i++) {
			temp.right = new TreeNode(arr.get(i));
			temp.left = null;
			temp = temp.right;
		}
		return curr;
    }
}
