/*************************************************************

    Following is the Binary Tree node structure:

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/
import java.util.*;
public class Solution {
    int maxLength = 0;
    void traverse(BinaryTreeNode<Integer> root, List<Integer> arr, int length) {
        if(root == null)
            return;
        
        if(maxLength < length) {
            arr.add(root.data);
            maxLength = length;
        }
        traverse(root.right, arr, length + 1);
        traverse(root.left, arr, length + 1);
    }
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {
       // Write your code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int length = 1;
        if(root == null)
            return new ArrayList<>();
        
        Solution instance = new Solution();
        instance.traverse(root, arr, length);

        return arr;
    }
}
