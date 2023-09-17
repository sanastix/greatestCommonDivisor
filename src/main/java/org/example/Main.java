package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int[]nums = new int[amount];

        for (int i = 0; i < amount; i++) {
            nums[i] = in.nextInt();
        }

        int gcd = findGCD(nums, amount);
        System.out.println(gcd);

    }

    public static int findGCD (int[] numArr, int am){
        int result = gcd(numArr[0], numArr[1]);
        for (int i = 2; i < numArr.length; i++) {
            result = gcd(result, numArr[i]);
        }
        return result;
    }

    public static int gcd (int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

}