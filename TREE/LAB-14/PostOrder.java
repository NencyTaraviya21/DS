public class PostOrder {
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
    public static postOrder(TreeNode root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val+" "); 
    }
}