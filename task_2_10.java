package hw3;

import java.util.Scanner;

public class task_2_10 {
    public static void main(String[] args) 
    {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть 2 числа");   
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int carry;

    while(num2 != 0) {
        carry = num1 & num2;  
        num1 = num1 ^ num2;   
        num2 = carry << 1;    
    }

        System.out.println("Сума: " + num1);
}}
