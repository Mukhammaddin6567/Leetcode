package leetcode;

import java.util.Arrays;

public class Problem26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int index = 0;
        int memory = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] !=memory) {
                nums[index++] = memory;
                memory = nums[i];
            }
        }
        nums[index] = memory;
        System.out.println(Arrays.toString(nums));
        return ++index;
    }
}
