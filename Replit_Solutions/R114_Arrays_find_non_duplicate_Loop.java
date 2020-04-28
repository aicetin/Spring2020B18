package Replit_Solutions;
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */

import java.util.*;

public class R114_Arrays_find_non_duplicate_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println(nums[i]);
            }
        }
    }
}

