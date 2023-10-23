package hw1;

import java.util.Scanner;

public class task_1_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input 3 float nnumbers:");
        float n1 = scn.nextFloat();
        float n2 = scn.nextFloat();
        float n3 = scn.nextFloat();
        float sum = n1 + n2 + n3;
        System.out.println("Sum: " + sum );
    }
}
