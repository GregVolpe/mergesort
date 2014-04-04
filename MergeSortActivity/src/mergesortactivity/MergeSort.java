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

    private int compCounter;
    private int splitCounter;
    private int swapCounter;

    public MergeSort() {
        compCounter = 0;
        splitCounter = 0;
    }

    /**
     * Method to sort an array of integers
     *
     * @param data the array
     * @param low lowest index
     * @param high highest index
     * @return the sorted array
     */
    public int[] sort(int[] data, int low, int high) {
        int middle = (high + low) / 2;
        if (low == high) {
            int[] data2 = new int[1];
            data2[0] = data[middle];
            return data2;
        } else {
            int[] firstHalfSorted = sort(data, low, middle);
            int[] secondHalfSorted = sort(data, middle + 1, high);
            return (merge(firstHalfSorted, secondHalfSorted));

        }
    }
    /**
     * Method used to merge two halves of an array together
     * @param firstHalfSorted The first sorted half of the array
     * @param secondHalfSorted The second sorted half of the array
     * @return The sorted array
     */
    public int[] merge(int[] firstHalfSorted, int[] secondHalfSorted) {

        int[] SortedArray = new int[firstHalfSorted.length + secondHalfSorted.length];
        int m = 0;
        int n = 0;
        int count = 0;
        while (m < firstHalfSorted.length && n < secondHalfSorted.length) {
            if (firstHalfSorted[m] > secondHalfSorted[n]) {
                SortedArray[count] = secondHalfSorted[n];
                count++; //counter++;
                n++;
                compCounter++;
            } else if (firstHalfSorted[m] <= secondHalfSorted[n]) {
                SortedArray[count] = firstHalfSorted[m];
                count++; //counter++;
                m++;
                compCounter++;
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

    /**
     * Method used to return the counter of the merge method
     * @return The counter
     */
    public int getCounter() {
        return this.compCounter;
    }
    /*
    public int getSplitCounter() {
        return this.splitCounter;
    }
    */
    /**
     * Method used to clear the counter sets
     */
    public void clearCounter() {
        this.compCounter = 0;
        this.swapCounter = 0;
        this.splitCounter = 0;
    }

}
