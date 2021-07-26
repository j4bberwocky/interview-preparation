package it.j4bberwocky.ds;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import it.j4bberwocky.ds.MyGraph.Node;

class MyGraphTest {

    @Test
    void testMyGraph() {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n0.addEdge(n1);
        n1.addEdge(n0);
        n1.addEdge(n3);
        n1.addEdge(n2);
        n2.addEdge(n1);
        n2.addEdge(n4);
        n3.addEdge(n1);
        n3.addEdge(n4);
        n3.addEdge(n5);
        n4.addEdge(n2);
        n4.addEdge(n3);
        n5.addEdge(n3);

        assertNotNull(n0);

        MyGraph myGraph = new MyGraph();

        System.out.println("DFS:");
        myGraph.dfs(n0);

        System.out.println("DFS iterative:");
        myGraph.dfsIterative(n0);

        System.out.println("BFS:");
        myGraph.bfs(n0);
    }
    
}
