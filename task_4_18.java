package hw4;

import java.util.Scanner;

public class task_4_18 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true)
        {
            String str = sc.nextLine();
            String[] parts = str.split("=");
            String number = parts[1];
            int number1 = Integer.parseInt(number);
            //System.out.println(number1);
            sum = sum + number1;
            if(number1 == 0)
            {break;}
        }

        System.out.println(sum);
    }
}
