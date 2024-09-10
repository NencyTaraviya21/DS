public class PreOrder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode Right;
    
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.Right=null;
    }
}
    public static preOrder(TreeNode root){
        if(root==null) return;

        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
