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

    private int counter, timeCounter;

    public MergeSort() {
        timeCounter = counter= 1;
    }

    public int[] sort(int[] data, int low, int high) {
        //timeCounter++;
        int middle = (high + low) / 2;
        if (low == high) {
            int[] data2 = new int[1];
            data2[0] = data[middle];
            counter++;
            return data2;
        } else {
            int[] firstHalfSorted = sort(data, low, middle);
            counter++;
            int[] secondHalfSorted = sort(data, middle + 1, high);
            counter++;
            return (merge(firstHalfSorted, secondHalfSorted));
            
        }
    }

    public int[] merge(int[] firstHalfSorted, int[] secondHalfSorted) {
        int[] SortedArray = new int[firstHalfSorted.length + secondHalfSorted.length];
        int m = 0;
        int n = 0;
        int count = 0;
        while (m < firstHalfSorted.length && n < secondHalfSorted.length) {
            if (firstHalfSorted[m] > secondHalfSorted[n]) {
                SortedArray[count] = secondHalfSorted[n];
                count++;
                n++;
            } else if (firstHalfSorted[m] <= secondHalfSorted[n]) {
                SortedArray[count] = firstHalfSorted[m];
                count++;
                m++;
            }
            timeCounter++;
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

    public int getCounter() {
        return this.counter;
    }
    
    public void clearCounter(){this.counter = 0; this.timeCounter =0;}
    
    public int getTimeCounter(){return this.timeCounter;}

}
