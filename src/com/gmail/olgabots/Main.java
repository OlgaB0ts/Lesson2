package com.gmail.olgabots;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {

    public static void main(String[] args) {
        printJavaForever();

        int firstVal = 1, secondVal = 2;
        System.out.println("First val = " + firstVal + " second val = " + secondVal);
        printSum(firstVal, secondVal);
        printMult(firstVal, secondVal);
        printSumMultAndSum(firstVal, secondVal);
    }

    static void printJavaForever() {
        System.out.println("Java forever");
    }

    static void printSum(int firstVal, int secondVal) {
        System.out.println("sum is " + getSum(firstVal, secondVal));
    }

    static int getSum(int firstVal, int secondVal) {
        int sum = firstVal + secondVal;
        return sum;
    }

    static void printMult(int firstVal, int secondVal) {
        System.out.println("multiplication is " + getMult(firstVal, secondVal));
    }

    static int getMult(int firstVal, int secondVal) {
        int mult = firstVal * secondVal;
        return mult;
    }

    static void printSumMultAndSum(int firstVal, int secondVal) {
        int sum = getSum(firstVal, secondVal) + getMult(firstVal, secondVal);
        System.out.println("Summ of summ and mult = " + sum);
    }

}
