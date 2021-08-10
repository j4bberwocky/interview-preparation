package it.j4bberwocky.ds;

public class MyBinaryTree {

    /*
     * A full binary tree is a tree in which every node has either 0 or 2 children.
     * 
     * In a complete binary tree every level, except possibly the last, is completely 
     * filled, and all nodes in the last level are as far left as possible.
     * 
     * A balanced binary tree is a binary tree structure in which the left and right 
     * subtrees of every node differ in height by no more than 1.
     * 
     * A perfect binary tree is a tree with all leaves are at the same level, and 
     * every parent has two children.
     * 
     * A binary search tree is a binary tree in which for each node, the left child 
     * is less than or equal to the node, and the right child is greater than or equal to the node.
     */


    private static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public MyBinaryTree() {
        root = null;
    }

    private void visit(TreeNode node) {
        System.out.println(node.value);
    }

    /** Visit the left branch, than the current node and finally the right node */
    void inOrderTraversal(TreeNode node) {
        // when performed on a binary search tree it visti the nodes in ascending order
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);   
        }
    }

    /** Visit the current node BEFORE its child nodes */
    void preOrderTraversal(TreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /** Visit the current node AFTER its child nodes */
    void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    /** Is a valid Binary Search Tree */
    public boolean isValidBinarySearchTree(TreeNode root) {
        if (root == null) {
             return true;
        }
        return isValidSubtree(root, null, null);
    }

    private boolean isValidSubtree (TreeNode root, Integer min, Integer max) {
        if (root == null) {
           return true;
        }
        if ((min != null && root.value <= min) ||  (max != null && root.value >= max)) {
            return false;
        } 
        return isValidSubtree(root.left, min, root.value) && isValidSubtree(root.right, root.value, max);
    }

    /** is simmetric binary tree */
    public boolean isSymmetric() {
        return root == null || isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode node1, TreeNode node2) {
        
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.value != node2.value) {
            return false;
        }

        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

}
