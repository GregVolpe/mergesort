/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

/**
 * This class sorts an array, using the merge sort algorithm.
 */
public class MergeSort {

    private int swaps = 0;
    private int comparisons = 0;
    private int[] a;

    /**
     * Constructs a merge sorter.
     *
     * @param anArray the array to sort
     */
    public MergeSort(int[] anArray) {
        a = anArray;

    }

    /**
     * Sorts the array managed by this merge sorter.
     */
    public void sort() {
        if (a.length <= 1) {
            return;
        }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        // Copy the first half of a into first, the second half into second
        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
            this.increaseComparison();
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
            this.increaseComparison();
        }
        MergeSort firstSorter = new MergeSort(first);
        MergeSort secondSorter = new MergeSort(second);
        firstSorter.sort();
        secondSorter.sort();
        merge(first, second);
    }

    /**
     * Merges two sorted arrays into the array managed by this merge sorter.
     *
     * @param first the first sorted array
     * @param second the second sorted array
     */
    private void merge(int[] first, int[] second) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

      // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into a
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
                //this.increaseSwaps();
            } else {
                a[j] = second[iSecond];
                iSecond++;
                //this.increaseSwaps();
            }
            j++;
            //this.increaseComparison();
        }

      // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
            //this.increaseSwaps();
            //this.increaseComparison();
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
            //this.increaseSwaps();
           // this.increaseComparison();
        }
    }

    private void increaseComparison() {
        this.comparisons++;
    }

    private void increaseSwaps() {
        this.swaps++;
    }

    public int getSwaps() {
        return this.swaps;
    }

    public int getComparisons() {
        return this.comparisons;
    }
    public void clearCounters()
    {
        this.swaps = 0;
        this.comparisons = 0;
    }
}
