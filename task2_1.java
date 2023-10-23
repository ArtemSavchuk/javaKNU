package cw2;

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        System.out.println("Введіть прізвище:");
        Scanner scaner = new Scanner(System.in);
        String last_name = scaner.nextLine();
        System.out.println("Привіт, " + last_name);
    }
}
