import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    int maxLength = 0;
    void leftView(TreeNode<Integer> root, List<Integer> arr, int length) {
        if(root == null)
            return;
        
        if(maxLength < length) {
            arr.add(root.data);
            maxLength = length;
        }

        leftView(root.left, arr, length + 1);
        leftView(root.right, arr, length + 1);
    }
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int length = 1;
        Solution instance = new Solution();
        instance.leftView(root, arr, length);

        return arr;
    }
}
