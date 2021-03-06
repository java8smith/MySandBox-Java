package com.javasmith.samples1.funny.string;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by Smitha Paramanandan on 4/8/2016.
 * Suppose you have some string S having length N that is indexed from 0 to N−1.
 * You also have some string R that is the reverse of string S. S is funny if the condition
 * | S[j]−S[j−1] |=| R[j]−R[j−1] || S[j]−S[j−1] |=| R[j]−R[j−1] | is true for every j from 1 to N−1.
 * Note: For some string S, S[j] denotes the ASCII value of the jth zero-indexed character in S.
 * The absolute value of some integer x is written as | x |.
 * Input Format: The first line contains an integer, T (the number of test cases).
 * The T subsequent lines each contain a string, where the ith line is string Si.
 * Constraints:
 * 1≤T≤10
 * 0≤i≤T−1
 * 2≤length of Si≤10000
 * Output Format: For each Si, print Funny or Not Funny on a new line.
 * Sample Input:
 * 2
 * acxz
 * bcxz
 * Sample Output:
 * Funny
 * Not Funny
 * Explanation: Test Case 0: S0="acxz"
 * |c−a|=2=|x−z|
 * |x−c|=21=|c−x|
 * |z−x|=2=|a−c|
 * We print Funny.
 * Test Case 1: S1="bcxz"
 * |c−b|=1, but |x−z|=2
 * We stop evaluating the string (as |c−b|≠|x−z||c−b|≠|x−z|), and print Not Funny.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int T = sc.nextInt();
        StringBuilder[] sbArray = new StringBuilder[T];
        if (1 <= T && T <= 10) {
            for (int i = 0; i <= T - 1; i++) {
                StringBuilder sb = new StringBuilder();
                sb = sb.append(sc.next());
                if (sc.hasNextLine()) {
                    sb = sb.append(sc.nextLine());
                }
                sbArray[i] = sb;
            }
        }
        Arrays.asList(sbArray).stream().forEach((sb) -> {
            int N = sb.length();
            if (2 <= N && N <= 10000) {
                String S = sb.toString();
                String R = sb.reverse().toString();
                out.println(isFunny(S, R, N) ? "Funny" : "Not Funny");
            }
        });

    }

    private static boolean isFunny(String S, String R, int N) {
        boolean result = true;
        for (int j = 1; j < N - 1; j++) {
            int Sj = S.charAt(j);
            int Sjminus1 = S.charAt(j - 1);
            int Rj = R.charAt(j);
            int Rjminus1 = R.charAt(j - 1);

            result &= Math.abs(Sj - Sjminus1) == Math.abs(Rj - Rjminus1);
        }
        return result;
    }

}
