class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class treeMethods{
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
public class Avltree{
    public static void main(String[] args) {
        treeMethods tm=new treeMethods();
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.left.left=new Node(3);
        root.left.right=new Node(7);
        System.out.println("Height of tree:"+tm.height(root));

    }
}