package it.j4bberwocky.ds;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MyBinarySearchTreeTest {

    @Test
    void testBinarySearchTree() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(2);
        bst.insert(4);
        bst.insert(8);
        bst.insert(6);
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        assertNotNull(bst);
        System.out.println("Traversing tree in order: ");
        bst.traverseInOrder();
    }
    
}
