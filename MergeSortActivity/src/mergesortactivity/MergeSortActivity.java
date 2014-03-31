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
        randomSets(10);
    }

    private static void randomSets(int num) {
        MergeSort myMerge = new MergeSort();
        int[] counters = new int[num];
        int[] listSizes = new int[num];
        int[][] lists = new int[num][];

        MergerHelper.RandomNumber(listSizes);
        for (int i = 0; i < num; i++) {
            lists[i] = new int[listSizes[i]];

            MergerHelper.RandomNumber(lists[i]);

            myMerge.sort(lists[i], 0, lists[i].length - 1, 0);
            counters[i] = myMerge.getCounter();
            System.out.println("Splits = " + myMerge.getSplitCounter());
            myMerge.clearCounter();
            System.out.println("Input size: " + listSizes[i]);
            System.out.println("Counter = " + counters[i]);
        }
        double averageCounter = 0;
        double inputSizes = 0;
        for (int i = 0; i < counters.length; i++) {
            averageCounter += (double) counters[i];
            inputSizes += (double) listSizes[i];
        }
        inputSizes /= num;
        averageCounter /= num;
        System.out.println("Average Counter = "+ averageCounter);
        System.out.println("Expected Average = "+ MergerHelper.expectedTime((int)inputSizes));
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

        //Create merger
        MergeSort myMerge = new MergeSort();

        int[] numsTenSorted = myMerge.sort(numsTen, 0,
                numsTen.length - 1, 0);
        System.out.println("Counter 10: " + myMerge.getCounter());
        System.out.println("Expected: " + MergerHelper.expectedTime(10));
        myMerge.clearCounter();

        int[] numsHundredSorted = myMerge.sort(numsHundred, 0,
                numsHundred.length - 1, 0);
        System.out.println("Counter 100: " + myMerge.getCounter());
        System.out.println("Expected: " + MergerHelper.expectedTime(100));
        myMerge.clearCounter();

        int[] numsThousandSorted = myMerge.sort(numsThousand, 0,
                numsThousand.length - 1, 0);
        System.out.println("Counter 1000: " + myMerge.getCounter());
        System.out.println("Expected: " + MergerHelper.expectedTime(1000));
        myMerge.clearCounter();
        System.out.println("\n");

        MergerHelper.fillAscending(numsTenSorted);
        MergerHelper.fillAscending(numsHundredSorted);
        MergerHelper.fillAscending(numsThousandSorted);

        myMerge.sort(numsTenSorted, 0,
                numsTenSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 10: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsHundredSorted, 0,
                numsHundredSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 100: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsThousandSorted, 0,
                numsThousandSorted.length - 1, 0);
        System.out.println("Counter Sorted Ascending 1000: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        MergerHelper.fillDescending(numsTenSorted);
        MergerHelper.fillDescending(numsHundredSorted);
        MergerHelper.fillDescending(numsThousandSorted);

        myMerge.sort(numsTenSorted, 0,
                numsTenSorted.length - 1, 0);
        System.out.println("Counter Sorted Descending 10: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsHundredSorted, 0,
                numsHundredSorted.length - 1, 0);
        System.out.println("Counter Sorted Descending 100: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsThousandSorted, 0,
                numsThousandSorted.length - 1, 0);
        System.out.println("Counter Sorted Descending 1000: "
                + myMerge.getCounter());
        myMerge.clearCounter();
    }

}
