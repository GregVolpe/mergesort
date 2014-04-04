/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

import java.util.Random;

/**
 * Main activity for the mergesort program
 *
 * @author Greg Volpe
 */
public class MergeSortActivity {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MergeFrame().setVisible(true);
            }
        });
    }

    /**
     * Method used to run the random sets program. Called by the run random test
     * button
     *
     * @param num number of sets to run
     * @return
     */
    public static String randomSets(int num, int listSize) {
        String output = " ";
        //Random rand = new Random();
        MergeSort myMerge = new MergeSort();
        int[] counters = new int[num];
        // int[] expectedCounters = new int[num];
        int[] listSizes = new int[num];
        int[][] lists = new int[num][];

        //MergeSortHelper.RandomNumber(listSizes);
        for (int i = 0; i < num; i++) {

            listSizes[i] = listSize;

            lists[i] = new int[listSizes[i]];

            //MergeSortHelper.RandomNumber(lists[i]);

            myMerge.sort(lists[i], 0, lists[i].length - 1);
            counters[i] = myMerge.getCounter();
            myMerge.clearCounter();

            output += ("\nInput size: " + listSizes[i]);
            output += ("\nCounter = " + counters[i]);

        }
        double averageCounter = 0;
        double expectedCounter = 0;
        double inputSizes = 0;
        for (int i = 0; i < counters.length; i++) {
            averageCounter += (double) counters[i];
            expectedCounter += MergeSortHelper.expectedTime(listSizes[i]);
            //inputSizes += (double) listSizes[i];
        }
        expectedCounter /= num;
        averageCounter /= num;
        output += ("\nAverage Counter = " + averageCounter);
        output += ("\nExpected Average = " + expectedCounter);
        output += "\n\n";
        return output;
    }

    public static String TenToOneThousand() {
        //Initialize
        String output = " ";
        int[] numsTen = new int[10];
        int[] numsHundred = new int[100];
        int[] numsThousand = new int[1000];
        //Fill arrays with random numbers
        MergeSortHelper.RandomNumber(numsTen);
        MergeSortHelper.RandomNumber(numsHundred);
        MergeSortHelper.RandomNumber(numsThousand);

        //Create merger
        MergeSort myMerge = new MergeSort();

        int[] numsTenSorted = myMerge.sort(numsTen, 0,
                numsTen.length - 1);
        output += ("\nCounter 10: " + myMerge.getCounter());
        output += ("\nExpected: " + MergeSortHelper.expectedTime(10));
        myMerge.clearCounter();

        int[] numsHundredSorted = myMerge.sort(numsHundred, 0,
                numsHundred.length - 1);
        output += ("\nCounter 100: " + myMerge.getCounter());
        output += ("\nExpected: " + MergeSortHelper.expectedTime(100));
        myMerge.clearCounter();

        int[] numsThousandSorted = myMerge.sort(numsThousand, 0,
                numsThousand.length - 1);
        output += ("\nCounter 1000: " + myMerge.getCounter());
        output += ("\nExpected: " + MergeSortHelper.expectedTime(1000));
        myMerge.clearCounter();
        output += ("\n");

        MergeSortHelper.fillAscending(numsTenSorted);
        MergeSortHelper.fillAscending(numsHundredSorted);
        MergeSortHelper.fillAscending(numsThousandSorted);

        myMerge.sort(numsTenSorted, 0,
                numsTenSorted.length - 1);
        output += ("\nCounter Sorted Ascending 10: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsHundredSorted, 0,
                numsHundredSorted.length - 1);
        output += ("\nCounter Sorted Ascending 100: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsThousandSorted, 0,
                numsThousandSorted.length - 1);
        output += ("\nCounter Sorted Ascending 1000: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        MergeSortHelper.fillDescending(numsTenSorted);
        MergeSortHelper.fillDescending(numsHundredSorted);
        MergeSortHelper.fillDescending(numsThousandSorted);

        myMerge.sort(numsTenSorted, 0,
                numsTenSorted.length - 1);
        output += ("\nCounter Sorted Descending 10: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsHundredSorted, 0,
                numsHundredSorted.length - 1);
        output += ("\nCounter Sorted Descending 100: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        myMerge.sort(numsThousandSorted, 0,
                numsThousandSorted.length - 1);
        output += ("\nCounter Sorted Descending 1000: "
                + myMerge.getCounter());
        myMerge.clearCounter();

        output += "\nRandom sets size ten:";
        output+=randomSets(10, 10);
        output += "\nRandom sets size One Hundred:";
        output+=randomSets(10, 100);
        output += "\nRandom sets size One Thousand:";
        output+=randomSets(10, 1000);

        return output;
    }

}
