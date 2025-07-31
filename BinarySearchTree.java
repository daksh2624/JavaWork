public class BinarySearchTree {
    class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
    }

    public Node root;

    public int getHeight(Node node){
        if(node == null) return -1;

        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;

        return node;
    }

    public void populate(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            this.insert(arr[i]);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root Node : ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left Node of " + node.value + " : ");
        display(node.right, "Right Node of " + node.value + " : ");
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.populate(new int[] {5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
        tree.display();
    }
}