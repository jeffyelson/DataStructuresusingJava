import java.util.Queue;
//Worked with Preetam Naik (240014) on the code

public class MyBinaryTree extends BinaryTree<Integer> {

    public MyBinaryTree(Integer element) {
        super(element);
    }

    public static void main(String[] args) {
        // TODO: test cases
    }

    public MyBinaryTree getLeft() {
        return (MyBinaryTree) super.getLeft();
    }

    public MyBinaryTree getRight() {
        return (MyBinaryTree) super.getRight();
    }

    public int height() {
        // TODO: implement
        int leftHeight = 0;
        int rightHeight = 0;
        int maxSum = 0;
        if (getRight() != null) {
            rightHeight = getRight().height();
        }
        if (getLeft() != null) {
            leftHeight = getLeft().height();
        }
        maxSum = Math.max(rightHeight, leftHeight) + 1;
        return maxSum;

    }

    public int maxSum() {
        // TODO: implement

        return Math.max(getLeft().add(), getRight().add());
    }

    public int add() {
        int leftsum = 0;
        int rightsum = 0;
        if (getLeft() != null) {
            leftsum = getLeft().add();
        }
        if (getRight() != null) {
            rightsum = getRight().add();
        }
        return getElement() + leftsum + rightsum;
    }

    public int maxPathSum() {
        // TODO: implement
        int leftpath = 0;
        int rightpath = 0;
        boolean check = true;
        if (getLeft() != null) {
            leftpath = getElement() + getLeft().maxPathSum();
        } else {
            check = false;
        }
        if (getRight() != null) {
            rightpath = getElement() + getRight().maxPathSum();
        } else {
            return leftpath;
        }
        if (check == false) {
            return rightpath;
        }
        return Math.max(leftpath, rightpath);
    }

    public int maxWidth() {
        // TODO: implement
        BinaryTree<Integer> Node = this;
        int maxwidth = 0;
        int widthOfTree = 0;
        Node.setElement(getElement());
        int heightOfTree = height();
        for (int i = 1; i <= heightOfTree; i++) {
            widthOfTree = getWidth(Node, i);
            if (widthOfTree > maxwidth)
                maxwidth = widthOfTree;
        }
        return maxwidth;
    }

    int getWidth(BinaryTree<Integer> node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(node.getLeft(), level - 1) + getWidth(node.getRight(), level - 1);
        }
        return 0;
    }

}
