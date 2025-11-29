class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTreeMethods{
    Node root=null;
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if(root.data>data){
            root.left=insert(root.left, data);
        }else{
            root.right=insert(root.right, data);
        }
        return root;
    }
    // Inorder Traversal (Left, Root, Right)
    public void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Preorder Traversal (Root, Left, Right)
    public void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Postorder Traversal (Left, Right, Root)
    public void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    //searching a node
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return search(root.left, key) || search(root.right, key);
    }

}
public class BST1{
    public static void main(String[] args) {
        BinarySearchTreeMethods bst=new BinarySearchTreeMethods();
        bst.root=new Node(1);
        bst.root.left=new Node(2);
        bst.root.right=new Node(3);
        bst.root.left.left=new Node(4);
        bst.root.left.right=new Node(5);
        bst.root.right.left=new Node(6);
        bst.root.right.right=new Node(7);
        //We can store the data in the form of array
        /*int [] arr={1,2,3,4,5,6,7};
        for(int i:arr){
        tree.root=tree.insert(tree.root,val);
        }
        */
        System.out.print("Inorder: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("Preorder: ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("Postorder: ");
        bst.postOrder(bst.root);
        System.out.println();
        System.out.println("Searching 5: " + bst.search(bst.root, 5));
        System.out.println("Searching 10: " + bst.search(bst.root, 10));
    }
}