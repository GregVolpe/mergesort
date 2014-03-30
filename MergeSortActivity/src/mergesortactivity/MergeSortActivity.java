/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author HEX
 */
public class MergeSortActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numsTen = new int[10];
        int[] numsHundred = new int[100];
        int[] numsThousand = new int[1000];
        for (int i = 0; i < 10; i++) {
            MergerHelper.RandomNumber(numsTen);
            MergerHelper.RandomNumber(numsHundred);
            MergerHelper.RandomNumber(numsThousand);
            /*
             MergerHelper.printArray(numsTen);
             System.out.println("\n");
             MergerHelper.printArray(numsHundred);
             System.out.println("\n");
             MergerHelper.printArray(numsThousand);
             */
            MergeSort myMerge = new MergeSort();
            MergeSort myMerge2 = new MergeSort();
            MergeSort myMerge3 = new MergeSort();
            int[] numsTenSorted = myMerge.sort(numsTen, 0, numsTen.length - 1);
            System.out.println("Counter 10: " + myMerge.getCounter());
            myMerge.clearCounter();
            //int[] numsHundredSorted = myMerge2.sort(numsHundred, 0, numsHundred.length - 1);
            //int[] numsThousandSorted = myMerge3.sort(numsThousand, 0, numsThousand.length-1);
            int[] numsHundredSorted = myMerge.sort(numsHundred, 0, numsHundred.length - 1);
            System.out.println("Counter 100: " + myMerge.getCounter());
            myMerge.clearCounter();
            int[] numsThousandSorted = myMerge.sort(numsThousand, 0, numsThousand.length - 1);
            System.out.println("Counter 100: " + myMerge.getCounter());
            myMerge.clearCounter();
            /*
             //System.out.println("\n");
             //MergerHelper.printArray(numsTenSorted);
             System.out.println("\n");
             MergerHelper.printArray(numsHundredSorted);
             System.out.println("\n");
             MergerHelper.printArray(numsThousandSorted);
         
             //System.out.println("Counter 10: " + myMerge.getCounter());
             //System.out.println("Counter 100: "+ myMerge2.getCounter());
             //System.out.println("Counter 1000: "+ myMerge3.getCounter());
             */

            myMerge.sort(numsThousandSorted, 0, numsThousandSorted.length - 1);
            System.out.println("Counter Sorted 1000: " + myMerge.getCounter());
        }
    }

}
