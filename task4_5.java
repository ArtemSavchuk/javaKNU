package cw2;

import java.util.Scanner;
import java.lang.Math;

public class task4_5 {

    public static float triangle_area(int x1, int x2,  int y1, int y2, int z1, int z2) {
        float a = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        float b = (float) Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
        float c = (float) Math.sqrt(Math.pow(z2-z1, 2) + Math.pow(x2-x1, 2));
        float p = (float) (a+b+c)/2;
        float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int a1 = scaner.nextInt();
        int a2 = scaner.nextInt();

        System.out.print("Enter B: ");
        int b1 = scaner.nextInt();
        int b2 = scaner.nextInt();

        System.out.print("Enter C: ");
        int c1 = scaner.nextInt();
        int c2 = scaner.nextInt();

        System.out.println("\n Your dots: " + a1 + " " + a2 + " " +  b1 + " " +  b2 + " " +  c1 + " " + c2);

        float area = triangle_area(a1, a2, b1, b2, c1, c2);
        System.out.println("Area = "+ area);
        

    }
}
