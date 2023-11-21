package cl3;

import java.util.Scanner;

public class task_2_3 {

    public static String CharToString(char c)
    {
        int c_val = Character.getNumericValue(c);
        String res = Integer.toBinaryString(c_val);
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner new_sc = new Scanner(System.in);
        System.out.println("1 char = ");
        char c1 = new_sc.next().charAt(0);
        System.out.println("2 char = ");
        char c2 = new_sc.next().charAt(0);
        System.out.println("3 char = ");
        char c3 = new_sc.next().charAt(0);

        System.out.println(CharToString(c1));
        System.out.println(CharToString(c2));
        System.out.println(CharToString(c3));



    }
    
}
