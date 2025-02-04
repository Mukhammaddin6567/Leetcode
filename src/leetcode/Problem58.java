package leetcode;

public class Problem58 {
    public static void main(String[] args) {
        String s1 = "   fly me   to   the moon  ";
        String s2 = "Hello World";
        String s3 = " ";

        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("aaaa"));
    }

    public static int lengthOfLastWord(String s) {
        int counter = 0;
        boolean isFirstSpace = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') counter++;
            else {
                if (!isFirstSpace && counter == 0) isFirstSpace = true;
                else if (counter != 0) return counter;
            }
        }
        return counter;
    }
}
