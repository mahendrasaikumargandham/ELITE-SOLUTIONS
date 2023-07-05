private void inorder(List<Integer> arr, Node root) {
        if(root == null)
            return;
        
        inorder(arr, root.left);
        arr.add(root.data);
        inorder(arr, root.right);
    }

boolean checkBST(Node root) {
    if(root == null)
        return true;
    
    List<Integer> arr = new ArrayList<>();
    inorder(arr, root);
    
    
    for(int i=0;i<arr.size()-1;i++) {
        if(arr.get(i) >= arr.get(i+1))
            return false;
    }
    return true;
}
