package com.javasmith.samples1.pangrams;

import java.util.Scanner;

/**
 * Created by Smitha Paramanandan on 4/7/2016.
 * (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 *
 * Given a sentence s, tell Roy if it is a pangram or not.
 * Input Format: Input consists of a string s.
 * Constraints: Length of s can be at most 103103 (1≤|s|≤103)(1≤|s|≤103) and
 * it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a
 * letter are considered the same.
 * Output Format: Output a line containing pangram if s is a pangram, otherwise output not pangram.
 * Sample Input:
 * Input #1
 * "We promptly judged antique ivory buckles for the next prize"
 * Input #2
 * "We promptly judged antique ivory buckles for the prize"
 * Sample Output:
 * Output #1
 * pangram
 * Output #2
 * not pangram
 * Explanation: In the first test case, the answer is pangram because the sentence contains all the letters
 * of the English alphabet.
 */
public class Solution {

    public static void main(String[] args) {
        String sentence = getInput();
        if(isPangram(sentence)){
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }

    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb = sb.append(sc.next());
        if(sc.hasNextLine() ) {
            sb = sb.append(sc.nextLine());
        }
        return sb.toString();
    }

    private static boolean isPangram(String sentence) {
        String allLowerCaseSentence = sentence.toLowerCase();
        for(char i = 'a'; i <= 'z'; i++) {
            if(allLowerCaseSentence.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
}
