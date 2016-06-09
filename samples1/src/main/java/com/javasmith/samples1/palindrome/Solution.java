package com.javasmith.samples1.palindrome;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by Smitha Paramanandan on 6/9/2016.
 */
public class Solution {

    public static void main(String [] args) {
        out.println(isPalindrome(getInput()) ? "Palindrome string" : "Not a palindrome string");
    }

    private static String getInput() {
        Scanner sc = new Scanner(in);
        StringBuilder sb = new StringBuilder();
        sb = sb.append(sc.next());
        if(sc.hasNextLine() ) {
            sb = sb.append(sc.nextLine());
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String userInput) {
        if(userInput.length() == 0 || userInput.length() == 1){
            return true;
        }
        if(userInput.charAt(0) == userInput.charAt(userInput.length()-1)) {
            return isPalindrome(userInput.substring(1, userInput.length()-1));
        }
        return false;
    }
}
