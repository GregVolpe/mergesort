/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

/**
 *
 * @author HEX
 */
public class MergeSortActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //randomSets();
        TenToOneThousand();
    }

    private static void randomSets() {
        MergeSort myMerge = new MergeSort();
        int[] counters = new int[10];
        int[] listSizes = new int[10];
        int[][] lists = new int[10][];
        MergerHelper.RandomNumber(listSizes);
        for (int i = 0; i < 10; i++) {
            lists[i] = new int[listSizes[i]];
            //int[] tempList = new int[listSizes[i]];
            MergerHelper.RandomNumber(lists[i]);

            myMerge.sort(lists[i], 0, lists[i].length - 1, 0);
            counters[i] = myMerge.getCounter();
            System.out.println("Splits = " + myMerge.getSplitCounter());
            myMerge.clearCounter();
            System.out.println("Input size: " + listSizes[i]);
            System.out.println("Counter = " + counters[i]);

        }
    }

    private static void TenToOneThousand() {
        //Initialize
        int[] numsTen = new int[10];
        int[] numsHundred = new int[100];
        int[] numsThousand = new int[1000];
        //Fill arrays with random numbers
        MergerHelper.RandomNumber(numsTen);
        MergerHelper.RandomNumber(numsHundred);
        MergerHelper.RandomNumber(numsThousand);

        MergeSort myMerge = new MergeSort();
        MergeSort myMerge2 = new MergeSort();
        MergeSort myMerge3 = new MergeSort();
       
        int[] numsTenSorted = myMerge.sort(numsTen, 0,
                numsTen.length - 1, 0);
        System.out.println("Counter 10: " + myMerge.getCounter());
        myMerge.clearCounter();
        
        int[] numsHundredSorted = myMerge.sort(numsHundred, 0,
                numsHundred.length - 1, 0);
        System.out.println("Counter 100: " + myMerge.getCounter());
        myMerge.clearCounter();
        
        int[] numsThousandSorted = myMerge.sort(numsThousand, 0,
                numsThousand.length - 1, 0);
        System.out.println("Counter 1000: " + myMerge.getCounter());
        myMerge.clearCounter();
        System.out.println("\n");
        
        myMerge.sort(numsTenSorted, 0,
                numsTenSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 10: " + 
                myMerge.getCounter());
        myMerge.clearCounter();
        
        myMerge.sort(numsHundredSorted, 0,
                numsHundredSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 100: " + 
                myMerge.getCounter());
        myMerge.clearCounter();
        
        myMerge.sort(numsThousandSorted, 0,
                numsThousandSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 1000: " + 
                myMerge.getCounter());
        myMerge.clearCounter();
    }

}
