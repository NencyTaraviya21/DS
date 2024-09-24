public class SmallLarge_BST {

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

    public  TreeNode root;

    public  TreeNode insertData(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertData(root.left, value);
        } 
        else if (value > root.value) {
            root.right = insertData(root.right, value);
        }

        return root;
    }

    public void insert(int value) {
        root = insertData(root, value);
    }

    public static int minValue(TreeNode root){
        int minVal = root.value;

        while(root.left!=null){
            minVal = root.left.value;
            root =root.left;
        }
        return minVal;
    }

    public static int maxValue(TreeNode root){
        int maxVal=root.value;

        while(root.right!=null){
            maxVal=root.right.value;
            root=root.right;
        }
        return maxVal;
    }

    public static void main(String [] args) {
        int [] arr = {22,1,3,44,5,2,71,11,9};

        TreeNode root = null;
        SmallLarge_BST obj = new SmallLarge_BST();

        for(int i=0; i<arr.length; i++){
            root = obj.insertData(root,arr[i]);
        }

        int minVal = minValue(root);
        int maxVal = maxValue(root);

        System.out.println("Min "+minVal+ " max "+maxVal);
    }
    
}
