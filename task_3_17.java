package hw2;

import java.util.Scanner;


public class task_3_17 {
    public static void main(String[] args) 
    {

        Scanner new_sc = new Scanner(System.in);
        String number_line = new_sc.nextLine();
        //System.out.println(number_line);
        int l = number_line.length();
        String number = "";
        for(int i = 0; i < l; i++)
        {
            if(number_line.charAt(i) != '*' && number_line.charAt(i) != ' ')
            {
                number = number + number_line.charAt(i);
            }
        }

        float number_float = Float.parseFloat(number);
        System.out.println(number_float*number_float*number_float);
    }
    
}
