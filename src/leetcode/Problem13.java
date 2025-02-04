package leetcode;

public class Problem13 {
    public static void main(String[] args) {
        String str1 = "III";
        String str2 = "IV";
        String str3 = "IX";
        String str4 = "LVIII";
        String str5 = "M CM XC IV";

        System.out.println(romanToInt(str1));
        System.out.println(romanToInt(str2));
        System.out.println(romanToInt(str3));
        System.out.println(romanToInt(str4));
        System.out.println(romanToInt(str5));
    }

    // III - 3
    // LVIII - 58
    // MCMXCIV - 1994

    /**
     * Symbol       Value
     * I             1
     * V *           5
     * X             10
     * L *           50
     * C             100
     * D *           500
     * M *           1000
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     */

    private static int romanToInt(String s) {
        char char1, char2;
        int sum = 0;
        for (int i = 0; i < s.length() - 2; i+=2) {
            char1 = s.charAt(i);
            char2 = s.charAt(i + 1);
            if (char1 == 'I') {
                if (char2 == 'V') sum += 4;
                else if (char2 == 'X') sum += 9;
                else sum += 1 + getResultOfRoman(char2);
                i++;
            } else if (char1 == 'X') {
                if (char2 == 'L') sum += 40;
                else if (char2 == 'C') sum += 90;
                else sum += 10 + getResultOfRoman(char2);
                i++;
            } else if (char1 == 'C') {
                if (char2 == 'D') sum += 400;
                else if (char2 == 'M') sum += 900;
                else sum += 100 + getResultOfRoman(char2);
                i++;
            } else {
                sum+=getResultOfRoman(char1) + getResultOfRoman(char2);
                i--;
            }
//            System.out.println(i);
        }
        return sum;
    }

    private static int getResultOfRoman(char roman) {
        switch (roman) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}


