package it.j4bberwocky.ds;

public class MyTree {

    private static class TreeNode {
        private int value;
        private TreeNode[] children;
        private TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public MyTree() {
        root = null;
    }
    
}
