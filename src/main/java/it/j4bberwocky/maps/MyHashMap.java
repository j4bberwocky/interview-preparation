package it.j4bberwocky.maps;

import java.util.Arrays;

class MyHashMap {

	private class Entry {
		private int key;
		private int value;
		
		public Entry(int key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public int getKey() {
			return key;
		}
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
	}
	
	private Entry[] hashMap;

    /** Initialize your data structure here. */
    public MyHashMap() {
        hashMap = new Entry[]{};
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        boolean found = false;
		for (int i = 0; i < hashMap.length; i++) {
			Entry entry = hashMap[i];
			if (entry.getKey() == key) {
				found = true;
				entry.setValue(value);
				break;
			}
		}
		if (!found) {
			Entry[] newHashMap = new Entry[hashMap.length + 1];
			for (int i = 0; i < hashMap.length; i++) {
				newHashMap[i] = hashMap[i];
			}
			Entry entry = new Entry(key, value);
			newHashMap[newHashMap.length -1] = entry;
			hashMap = newHashMap;
		}
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for (int i = 0; i < hashMap.length; i++) {
			Entry entry = hashMap[i];
			if (entry.getKey() == key) {
				return entry.getValue();
			}
		}
		return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (hashMap.length > 0) {
            if (hashMap[hashMap.length - 1].getKey() == key) {
                hashMap = Arrays.copyOf(hashMap, hashMap.length - 1);
                return;
            }
    
            if (get(key) == -1) {
                return;
            }
    
            Entry[] newHashMap = new Entry[hashMap.length - 1];
            boolean found = false;
            for (int i = 0; i < hashMap.length - 1; i++) {
                Entry entry = hashMap[i];
                if (entry.getKey() == key) {
                    found = true;
                }
                newHashMap[i] = hashMap[found ? i + 1 : i];
            }
            hashMap = newHashMap;
        }
    }
}
