package it.j4bberwocky.maps;

import java.util.Arrays;

class MyHashSet {

	private int[] hashSet;

    /** Initialize your data structure here. */
    public MyHashSet() {
        hashSet = new int[]{};
    }
    
    public void add(int key) {
		if (!contains(key)) {
			int[] newHashSet = Arrays.copyOf(hashSet, hashSet.length + 1);
			newHashSet[hashSet.length] = key;
			hashSet = newHashSet;
		}
    }
    
    public void remove(int key) {
		if (hashSet.length > 0) {
			
			if (hashSet[hashSet.length - 1] == key) {
				hashSet = Arrays.copyOf(hashSet, hashSet.length - 1);
				return;
			}

			int[] newHashSet = new int[hashSet.length - 1];
			boolean foundKey = false;
			for (int i = 0; i < newHashSet.length; i++) {
				if (hashSet[i] == key) {
					foundKey = true;
				} 
				int hashSetIndex = foundKey ? i + 1 : i;
				newHashSet[i] = hashSet[hashSetIndex];
			}
			
			if (foundKey) {
				hashSet = newHashSet;
			} 

		}
    }
    
    public boolean contains(int key) {
		for (int i = 0; i < hashSet.length; i++) {
			if (hashSet[i] == key) {
				return true;
			}
		}
		return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */