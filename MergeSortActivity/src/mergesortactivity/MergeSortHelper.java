/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortactivity;

import java.util.Random;

/**
 *
 * @author HEX
 */
public class MergeSortHelper {

    public MergeSortHelper() {
    }

    public static void RandomNumber(int[] nums) {
        Random rand = new Random();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            nums[i] = rand.nextInt(100);
        }
    }

    public static void printArray(int[] nums) {
        int size = nums.length;

        System.out.println("The array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + ", ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
    }

    public static void fillDescending(int[] nums) {
        int size = nums.length;
        int temp = size;
        for (int i = 0; i < size; i++) {
            nums[i] = temp;
            temp--;
        }
        //printArray(nums);
    }

    public static void fillAscending(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            nums[i] = i;

        }
        //printArray(nums);
    }
    
    public static double expectedTime(int num)
    {
        double result=0;
        
        result = (num)*(Math.log(num));
        return result;
        
    }
    
    public static void printInfo()
    {
        String stuff;
        
        stuff = 
        "The following application will run a mergesort algorithm on several sets "
                + "\nof integers.  The first set will have 10 items, the second will"
                + "\nhave 100 items and the last set will have 1000 items."
                + "\n\nThe application will predict the time effeciency of the"
                + "\nalgorithm which should be approximately O(n log n), as well as"
                + "\ncalculate the actual effeciency based on the input."
                + "\n\nThe application will then run a test of 10 random input sizes"
                + "\nranging from 1-1000 and calculate the average time efficiency.\n\n";
        
        System.out.println(stuff);
    }
}
