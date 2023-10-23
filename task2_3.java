package cw2;

import java.util.Scanner;
import java.lang.Math;

public class task2_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        float[] val = new float[2];

        for (int i=0; i < val.length; i++){
            val[i] = scaner.nextFloat();
        }

        System.out.println("your numbers:" + val[0] + " " + val[1]);

        float geometric_mean = (float) Math.sqrt(val[0] * val[1]);
        System.out.printf("Geometric mean: %f \n", geometric_mean);
        System.out.printf("Geometric mean: %e", geometric_mean);
    }
}
