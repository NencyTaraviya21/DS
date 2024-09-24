public class BinaryTreePrePost{

    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        
        
        TreeNode(int data) {
            this.value=data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode root;

    int preIndex = 0;
    int postIndex = 0;

    public TreeNode constructBT(int [] preorder, int[] postorder){
        return constructBT(preorder, postorder);
    }
    
    private TreeNode constructFromPrePostHelper(int [] preorder, int[] postorder){
        TreeNode root = new TreeNode(preorder[preIndex++]);

        if(root.value!= postorder[postIndex]){
            root.left=constructFromPrePostHelper(preorder, postorder);
        }

        if(root.value!= postorder[postIndex]){
            root.right=constructFromPrePostHelper(preorder, postorder);
        }

        postIndex++;
        return root;
    }

    public void printInorder(TreeNode root){
        if(root==null) return;

        printInorder(root.left);

        System.out.println(root.value+" ");

        printInorder(root.right);

    }
    public static void main(String[] args) {
        int [] preorder =  {10,5,8,7,6,15,11,13};
        int [] postorder =  {7,8,6,5,11,13,15,10};

        BinaryTreePrePost tree = new BinaryTreePrePost();
        root = tree.constructFromPrePostHelper(preorder, postorder);
        tree.printInorder(root);
    }
}