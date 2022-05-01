//Worked with Preetam Naik (240014) on the code

import java.util.Stack;

public class InvertedSearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public InvertedSearchTree() {
        this.root = null;
    }

    public void add(T obj) {
        // TODO: implement
        Node<T> presentNode = root;
        while (true) {
            if (root == null) {
                root = new Node<T>(obj);
                return;
            } else if (obj.compareTo(presentNode.data) > 0) {
                if (presentNode.leftChild == null) {
                    presentNode.leftChild = new Node<T>(obj);
                    return;
                } else {
                    presentNode = presentNode.leftChild;
                    continue;
                }
            } else if (obj.compareTo(presentNode.data) < 0) {
                if (presentNode.rightChild == null) {
                    presentNode.rightChild = new Node<T>(obj);
                    return;
                } else {
                    presentNode = presentNode.rightChild;
                    continue;
                }
            } else {
                return;
            }

        }


    }

    public boolean contains(T obj) {
        // TODO: implement
        Node<T> present = root;
        while (true) {
            if (root == null) {
                return false;
            } else if (present.data.compareTo(obj) < 0) {
                root = present.leftChild;
                continue;
            } else if (obj.compareTo(present.data) < 0) {
                root = present.rightChild;
                continue;
            } else return obj.compareTo(present.data) == 0;
        }
    }

    public String toString() {
        // TODO: implement
        String treeString = "";
        if (root == null) {
            return "";
        }
        Stack<Node<T>> treeSet = new Stack<Node<T>>();
        Node<T> presentNode = root;
        while (presentNode != null || treeSet.size() > 0) {
            while (presentNode != null) {
                treeSet.push(presentNode);
                presentNode = presentNode.leftChild;
            }
            presentNode = treeSet.pop();
            treeString = treeString.concat(String.valueOf(presentNode.data)).concat(" ");
            presentNode = presentNode.rightChild;
        }
        return treeString.trim();


    }

    class Node<T> {
        // TODO: implement class
        T data;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

}
