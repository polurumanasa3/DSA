class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    public void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);  // FIXED
    }

    public void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public int countOfNode(Node node) {
        if (node == null) return 0;

        return 1 + countOfNode(node.left) + countOfNode(node.right);
    }
    //height of tree
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }
    //sum of the node data
    public int sumOfNodes(Node node){
        if(node==null){
            return 0;
        }
        return node.data+sumOfNodes(node.left)+sumOfNodes(node.right);
    }
    public int sumOfLeafNodes(Node node) {
        if (node == null) return 0;
        // If it is a leaf node
        if (node.left == null && node.right == null) {
            return node.data;
        }
        // Otherwise, sum of leaf nodes in left + right subtree
        return sumOfLeafNodes(node.left) + sumOfLeafNodes(node.right);
    }
    public Node deleteNode(Node root, int key) {
    if (root == null) return null;

    // Step 1: Traverse the tree
    if (key < root.data) {
        root.left = deleteNode(root.left, key);
    } 
    else if (key > root.data) {
        root.right = deleteNode(root.right, key);
    } 
    else {
        // Node found → handle 3 cases

        // Case 1: No child
        if (root.left == null && root.right == null) {
            return null;
        }

        // Case 2: One child
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        // Case 3: Two children → replace with inorder successor
        Node successor = minValueNode(root.right);
        root.data = successor.data;
        root.right = deleteNode(root.right, successor.data);
    }
    return root;
}
// Find the minimum value in a subtree (for successor)
private Node minValueNode(Node node) {
    Node current = node;
    while (current.left != null) {
        current = current.left;
    }
    return current;
}

}

public class Tree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        System.out.println("InOrder");
        bt.inOrder(bt.root);     // 4 2 5 1 6 3 7

        System.out.println("\nPreOrder");
        bt.preOrder(bt.root);    // 1 2 4 5 3 6 7

        System.out.println("\nPostOrder");
        bt.postOrder(bt.root);   // 4 5 2 6 7 3 1
        
        System.out.println("\nCount of Nodes = " + bt.countOfNode(bt.root)); // 7
        System.out.println("\nHeight of Tree:"+bt.height(bt.root));
        System.out.println("\nsum of all nodes:"+bt.sumOfNodes(bt.root));
        System.out.println("\nSum of Leaf Nodes = " + bt.sumOfLeafNodes(bt.root));
    }
}