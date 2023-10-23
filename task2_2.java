package cw2;

import java.util.Scanner;
import java.lang.Math;

public class task2_2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Enter x1:");
        int x1 = scaner.nextInt();
        int digit_count = (int) Math.log10(x1) + 1;
        System.out.println("digit amount of x1 by log10: " + digit_count);
        String digit_count_string = Integer.toString(x1);
        System.out.println("digit amount of x1 by string: " + digit_count_string.length());

        System.out.println("Enter x2:");
        int x2 = scaner.nextInt();
        int digit_count_x2 = (int) Math.log10(x2) + 1;
        System.out.println("digit amount of x2 by log10: " + digit_count_x2);
        String digit_count_string_x2 = Integer.toString(x2);
        System.out.println("digit amount of x2 by string: " + digit_count_string_x2.length());

        float harmonic_mean = (float) (2.0 / ( (1.0/x1) +  (1.0/ x2)));
        System.out.printf("harmonic mean of x1 and x2: %.2f", harmonic_mean); 
    }
}
