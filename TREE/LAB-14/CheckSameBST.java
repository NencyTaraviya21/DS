public class CheckSameBST {
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

    public static boolean inOrder(TreeNode root1, TreeNode root2 ){
        if(root1 == null && root2==null) return true;
        if(root1==null || root2==null)return false;
        if(root1.value!=root2.value)return false;

        boolean lefttree = inOrder(root1.left, root2.left);
        boolean righttree = inOrder(root1.right, root2.right);

        System.out.println(" "+root1.value+" "+root2.value);
        return lefttree && righttree;

    }

    public static void main(String[] args) {
        int [] tree1={3,2,5,6,7};

        TreeNode root1=null;
        TreeNode root2=null;

        CheckSameBST obj=new CheckSameBST();

        for(int i=0; i<tree1.length; i++){
            root1 = obj.insertData(root1,tree1[i]);
        }

        int [] tree2={3,2,5,6,7};

        for(int i=0; i<tree2.length; i++){
            root2 = obj.insertData(root2,tree2[i]);
        }

        boolean ans = inOrder(root1, root2);
        System.out.println(ans);
    }
}

