package it.j4bberwocky.algo;

public class MergeSort {

    public void sort(int[] unsorted) {
        if (unsorted.length < 2) {
            return;
        }

        int mid = unsorted.length / 2;
        int[] l = new int[mid];
        int[] r = new int[unsorted.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = unsorted[i];
        }

        for (int i = mid; i < unsorted.length; i++) {
            r[i - mid] = unsorted[i];
        }

        sort(l);
        sort(r);

        merge(unsorted, l, r, mid, unsorted.length - mid);
    }

    private void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }

        while (j < right) {
            a[k++] = r[j++];
        }

    }

}
