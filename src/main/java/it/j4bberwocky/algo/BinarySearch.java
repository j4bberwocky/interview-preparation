package it.j4bberwocky.algo;

public class BinarySearch {
    
    public static int binarySearchRecursive(int[] array, int target) {
        return binarySearchRecursive(array, 0, array.length - 1, target);
    }

    private static int binarySearchRecursive(int[] array, int left, int right, int target) {
        if (array.length == 0) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (target == array[mid]) {
            return mid; 
        } else if (target < array[mid]) {
            return binarySearchRecursive(array, left, mid - 1, target);
        } else {
            return binarySearchRecursive(array, mid + 1, array.length - 1, target);
        }
    }

}
