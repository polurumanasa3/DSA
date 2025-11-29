class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    // Insert node in BST
    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // Inorder Traversal (sorted order)
    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Preorder Traversal
    public void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Postorder Traversal
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public String Searching(Node root,int key){
        if(root==null){
            return "no data";
        }
        if(root.data==key){
            return "found in root";
    
        }
        if(key<root.data){
            return Searching(root.left,key);
        }else{
            return Searching(root.right,key);
        }


    }
    public int  findminimum(Node root){
        if(root==null){
            System.out.println("tree is empty");
            return -1;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root.data;

    }
    public int  findmaximum(Node root){
        if(root==null){
            System.out.println("tree is empty");
            return -1;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.data;

    }
}

public class BST2{
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {5, 3, 7, 2, 4, 6, 8};

        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        System.out.print("Inorder: ");
        tree.inOrder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preOrder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postOrder(tree.root);
        System.out.println("\nSearching for 4"+tree.Searching(tree.root,4));
       System.out.println("Searching for 10"+tree.Searching(tree.root,10));  
       System.out.println("\n minimum value in the tree"+tree.findminimum(tree.root));
       System.out.println(" minimum value in the tree"+tree.findmaximum(tree.root));
    }
}