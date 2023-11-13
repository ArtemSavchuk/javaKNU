package hw2;

import java.lang.Math;
import java.util.Scanner;

public class task_4_6z {

    public static double identity(double x)
    {
        double res = x*(1 / (1 + Math.exp(-x)));
        return res;
    }
    public static double identity_derivative(double x)
    {
        double res = (1 - Math.exp(-x) + x*Math.exp(-x)) / Math.pow((1 + Math.exp(-x)),2);
        return res;
    }
    public static void main(String[] args) 
    {
        System.out.println("Число: ");
        Scanner new_sc = new Scanner(System.in);
        double x = new_sc.nextDouble();

        
        System.out.println("Функція: " + identity(x));
        System.out.println("Похідна: " + identity_derivative(x));

    }
}
