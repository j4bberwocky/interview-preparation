package it.j4bberwocky.ds;

public class MyHashSet {
    
    int[] map;

    public MyHashSet() {
        map = new int[1000005];
    }
    
    public void add(int key) {
        map[key] = 1;
    }
    
    public void remove(int key) {
        map[key] = 0;
    }
    
    public boolean contains(int key) {
        return map[key] == 1;
    }

}
