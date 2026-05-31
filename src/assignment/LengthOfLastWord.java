package assignment;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    static int lengthOfLastWord(String s) {

        String[] word = s.trim().split(" ");

        return word[word.length - 1].length();

    }

    static void main() {

        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }
}
