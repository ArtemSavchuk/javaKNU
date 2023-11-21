package cl3;

import java.util.Scanner;

public class tasl_1_2 {
    public static void main(String[] args) 
    {
        Scanner new_sc = new Scanner(System.in);
        String s1 = new_sc.nextLine();
        String s2 = new_sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
