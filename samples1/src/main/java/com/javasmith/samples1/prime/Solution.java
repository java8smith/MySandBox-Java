package com.javasmith.samples1.prime;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Smitha Paramanandan on 6/9/2016.
 */
public class Solution {

    public static void main(String [] args) {
        System.out.println(isPrime(getInput()) ? "Prime number" : "Not a prime number");
    }

    private static int getInput() {
        Scanner sc = new Scanner(in);
        return sc.nextInt();
    }

    private static boolean isPrime(int userInput) {
        boolean isPrime = true;
        for(int i = 2; i < userInput; i++) {
            if(userInput % i == 0) {
             isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
