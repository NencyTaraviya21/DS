public class InOrder {
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
public static inOrder(TreeNode root){
    if (root==null) return;
        postOrder(root.left);
        System.out.println(root.val+" "); 
        postOrder(root.right);
}
}
