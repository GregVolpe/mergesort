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
public class MergerHelper {

    public MergerHelper() {
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
}