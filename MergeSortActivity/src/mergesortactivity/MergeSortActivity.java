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

        MergerHelper.RandomNumber(numsTen);
        MergerHelper.RandomNumber(numsHundred);
        MergerHelper.RandomNumber(numsThousand);
        MergerHelper.printArray(numsTen);
        System.out.println("\n");
        MergerHelper.printArray(numsHundred);
        System.out.println("\n");
        MergerHelper.printArray(numsThousand);

        MergeSort myMergeTen = new MergeSort(numsTen);
        MergeSort myMergeHundred = new MergeSort(numsHundred);
        MergeSort myMergeThousand = new MergeSort(numsThousand);

        myMergeTen.sort();
        myMergeHundred.sort();
        myMergeThousand.sort();
        System.out.println("\n");
        System.out.println("Ten");
        // MergerHelper.printArray(numsTen);
        System.out.println("Swaps:");
        System.out.println(myMergeTen.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeTen.getComparisons());
        System.out.println("\n");

        System.out.println("Hundred");
        // MergerHelper.printArray(numsHundred);
        System.out.println("Swaps:");
        System.out.println(myMergeHundred.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeHundred.getComparisons());
        System.out.println("\n");
        
        System.out.println("Thousand");
        // MergerHelper.printArray(numsThousand);
        System.out.println("Swaps:");
        System.out.println(myMergeThousand.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeThousand.getComparisons());

        myMergeTen.clearCounters();
        myMergeHundred.clearCounters();
        myMergeThousand.clearCounters();

        myMergeTen.sort();
        myMergeHundred.sort();
        myMergeThousand.sort();
        
        
        System.out.println("\n");
        // MergerHelper.printArray(numsTen);
        System.out.println("Ten");
        System.out.println("Swaps:");
        System.out.println(myMergeTen.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeTen.getComparisons());
        System.out.println("\n");

        // MergerHelper.printArray(numsHundred);
        System.out.println("Hundred");
        System.out.println("Swaps:");
        System.out.println(myMergeHundred.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeHundred.getComparisons());
        System.out.println("\n");

        // MergerHelper.printArray(numsThousand);
        System.out.println("Thousand");
        System.out.println("Swaps:");
        System.out.println(myMergeThousand.getSwaps());
        System.out.println("Comparisons:");
        System.out.println(myMergeThousand.getComparisons());

    }

}
