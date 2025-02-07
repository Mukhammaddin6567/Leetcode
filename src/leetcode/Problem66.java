package leetcode;

import java.util.Arrays;

public class Problem66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{8, 9, 9, 9, 9})));
    }

    //9,8,7,6,5,4,3,2,1,0
    //9,8,9,6,5,4,3,2,1,9
    public static int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1];
        if (lastDigit != 9) {
            digits[digits.length - 1] = lastDigit + 1;
            return digits;
        } else {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9) digits[i] = 0;
                else {
                    digits[i] = digits[i] + 1;
                    if (i != 0) return digits;
                }
            }
        }
        if (digits[0] == 0) {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            return newResult;
        } else return digits;
    }
}
