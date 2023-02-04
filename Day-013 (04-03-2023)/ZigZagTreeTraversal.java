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
    public static ArrayList<Integer> zigzagTreeTraversal(TreeNode<Integer> root) 
    {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList arr = new ArrayList<>();

        boolean isForward = true;

        if(root == null)
            return arr;
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList newArr = new ArrayList<>();
            for(int i=1;i<=size;i++) {
                TreeNode ele = queue.poll();
                if(isForward)
                    newArr.add(ele.data);
                else    
                    newArr.add(0, ele.data);
                
                if(ele.left != null)
                    queue.offer(ele.left);
                if(ele.right != null)
                    queue.offer(ele.right);
            }
            for(int i=0;i<newArr.size();i++) {
                arr.add(newArr.get(i));
            }
            isForward = !isForward;
        }
        return arr;
    }
}
