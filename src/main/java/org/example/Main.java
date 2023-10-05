package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        long[]nums = new long[amount];

        for (int i = 0; i < amount; i++) {
            nums[i] = in.nextInt();
        }

        long gcd = findGCD(nums, amount);
        System.out.println(gcd);

    }

    public static long findGCD (long[] numArr, int am){
        long result = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            result = gcd(result, numArr[i]);
        }
        return result;
    }

    public static long gcd (long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}