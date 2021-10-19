/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-10-2021
 *   Time: 01:06
 *   File: bitObyte.java
 */

package BITOBYTE;

import java.util.Scanner;

public class bitObyte {


    ///2305843009213693952
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numOfTestCases = sc.nextInt();
        for (int j = 0; j < numOfTestCases; j++) {
            int test = sc.nextInt();
            printOutput(test);
        }

    }

    private static void printOutput(int n) {
        int remaining = (n - 1) % 26;
        int i = (n - 1) / 26;

        if (remaining >= 10 && remaining < 26) {
            System.out.println(0 + " " + 0 + " " + (long) (Math.pow(2, i)));
            return;
        }

        if (remaining >= 2 && remaining < 10) {
            System.out.println(0 + " " + (long) (Math.pow(2, i)) + " " + 0);
            return;
        }

        if (remaining >= 0 && remaining < 2) {
            System.out.println((long) (Math.pow(2, i)) + " " + 0 + " " + 0);
            return;
        }


    }
}

