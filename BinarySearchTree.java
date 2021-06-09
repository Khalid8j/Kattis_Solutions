
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinarySearchTree {

    public static void main(String[] args) throws IOException {

        Tree binaryTree = new Tree();
       // Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(new File("bst.3.in"));
       // BufferedReader reader =new BufferedReader(new FileReader("bst.3.in"));
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));


        //int n = sc.nextInt();
        int n = Integer.parseInt(reader.readLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {

            //binaryTree.insert(sc.nextInt());
            binaryTree.add(Integer.parseInt(reader.readLine()));
            counter += binaryTree.counter;
            System.out.println(counter);
        }


    }
}

class Tree {

    Node root;
    int counter = 0;

    public Tree() {
        root = null;
    }

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            counter++;
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            counter++;
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        counter = 0;
        root = addRecursive(root, value);
    }

    public void insert(int i) {
        counter = 0;
        Node newNode = new Node(i);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (i < current.value) {
                    counter++;
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    counter++;
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

   /* public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }*/

    /*public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }*/

    /*public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }*/

    class Node {

        int value;

        Node left;
        Node right;

        Node(int val) {
            value = val;
            right = null;
            left = null;

        }
    }

}
