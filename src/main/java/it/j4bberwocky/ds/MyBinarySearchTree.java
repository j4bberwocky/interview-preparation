package it.j4bberwocky.ds;

public class MyBinarySearchTree {

    private static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            System.out.println("Inserted " + value + " to root ");
            root = new TreeNode(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(TreeNode node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left of " + node.value);
                node.left = new TreeNode(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right of " + node.value);
                node.right = new TreeNode(value);
            }
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            traverseInOrder(root.left);
            visit(root);
            traverseInOrder(root.right);
        }
    }

    private void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            visit(node);
            traverseInOrder(node.right);
        }
    }

    private void visit(TreeNode node) {
        System.out.print(" " + node.value);
    }

}
