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
    private int comparisons,swaps;
    public MergeSort()
    {
        //empty constructor
    }

    public static int[] mergesort(int[] data, int low, int high) {
        int middle = (high + low) / 2;
        if (middle == low) {
            int[] data2 = new int[1];
            data2[0] = data[middle];
            return data2;
        } else {
            int[] firstHalfSorted = mergesort(data, low, middle);
            int[] secondHalfSorted = mergesort(data, middle + 1, high);
            return (merge(firstHalfSorted, secondHalfSorted));
        }
    }

    public static int[] merge(int[] firstHalfSorted, int[] secondHalfSorted) {
        int[] SortedArray = new int[firstHalfSorted.length + secondHalfSorted.length];
        int m = 0;
        int n = 0;
        int count = 0;
        while (m < firstHalfSorted.length && n < secondHalfSorted.length) {
            if (firstHalfSorted[m] > secondHalfSorted[n]) {
                SortedArray[count] = secondHalfSorted[n];
                count++;
                n++;
            } else if (firstHalfSorted[m] < secondHalfSorted[n]) {
                SortedArray[count] = firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (m != firstHalfSorted.length) {
            while (m < firstHalfSorted.length) {
                SortedArray[count] = firstHalfSorted[m];
                count++;
                m++;
            }
        }
        if (n != secondHalfSorted.length) {
            while (n < secondHalfSorted.length) {
                SortedArray[count] = secondHalfSorted[n];
                count++;
                n++;
            }
        }
        return SortedArray;
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

    public void clearCounters() {
        this.swaps = 0;
        this.comparisons = 0;
    }
}
