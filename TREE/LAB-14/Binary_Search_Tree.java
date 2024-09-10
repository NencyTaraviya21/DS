public class Binary_Search_Tree{
    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            value = data;
            left = null;
            right = null;
        }
    }

    public TreeNode root;

    public Binary_Search_Tree() {
        root = null;
    }

    public TreeNode insertData(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertData(root.left, value);
        } else if (value > root.value) {
            root.right = insertData(root.right, value);
        }

        return root;
    }

    public void insert(int value) {
        root = insertData(root, value);
    }

    public void search(int value) {
        boolean found = searchData(root, value);
        if (found) {
            System.out.println(value + " is found in the tree.");
        } else {
            System.out.println(value + " is not found in the tree.");
        }
    }

    public boolean searchData(TreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.value) {
            return true;
        } else if (value > root.value) {
            return searchData(root.right, value);
        } else {
            return searchData(root.left, value);
        }
    }

    private TreeNode deletNode(TreeNode root, int key){
        System.out.println("Hello");
        if(root==null){
            return root;
        }
        if(key < root.value ){
            root.left= deletNode(root.left,key);
        }
        else if(key > root.value){
            root.right=deletNode(root.right,key);
        }
        else{
            
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.value=minValue(root.right);
            root.right=deletNode(root.right, key);
        }
        return root;
    }

    private int minValue(TreeNode root){
        int minVal=root.value;
        while(root.left!=null){
            minVal=root.left.value;
            root=root.left;
        }
        return minVal;
    }

    public void delete(int key){
        root=deletNode(root,key);
    }

    public void display() {
        display(root);
    }

    private void display(TreeNode root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.value);
            display(root.right);
        }
    }

    public static void main(String[] args) {
        Binary_Search_Tree a = new Binary_Search_Tree();
        a.insert(23);
        a.insert(2);
        a.insert(3);
        a.insert(13);
        a.insert(32);
        a.insert(43);
        a.insert(6);

        System.out.println("Tree elements in-order:");
        a.display(
        );

        a.search(6);
        a.search(12);
        a.search(32);

        a.delete(2);
        a.delete(32);
        System.out.println("after deletion");
        a.display();
    }
}