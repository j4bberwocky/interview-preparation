package it.j4bberwocky.ds;

import org.junit.jupiter.api.Test;

class MyMinHeapTest {

    @Test
    void testMinHeap() {
        MyMinHeap minHeap = new MyMinHeap(100);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
 
        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
    }
    
}
