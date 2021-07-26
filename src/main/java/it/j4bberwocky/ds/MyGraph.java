package it.j4bberwocky.ds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class MyGraph {
    
    public static class Node {
	
        int value;
        List<Node> neighbors;
    
        public Node(int value) {
            this.value = value;
            neighbors = new ArrayList<>();
        }
        
        public void addEdge(Node to) {
            neighbors.add(to);
        }
    }


    public void dfs(Node startNode) {
        dfsRecursive(startNode, new HashSet<Integer>());
    }

    private void dfsRecursive(Node startNode, Set<Integer> visited) {
        visit(startNode);
        visited.add(startNode.value);
        
        for (Node n : startNode.neighbors) {
            if (!visited.contains(n.value)) {
                dfsRecursive(n, visited);
            }
        }
    }

    public void dfsIterative(Node startNode) {
        
        Deque<Node> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        
        stack.push(startNode);
        
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            
            if (!visited.contains(currentNode.value)) {
                visit(currentNode);
                visited.add(currentNode.value);
            }
            
            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    stack.push(n);
                }
            }
        }
    }

    public void bfs(Node startNode) {
        
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(startNode);
        visited.add(startNode.value);
        
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            visit(currentNode);
            
            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    queue.add(n);
                    visited.add(n.value);
                }
            }
        }
    }

    public void visit(Node node) {
        System.out.println(node.value);
    }

}
