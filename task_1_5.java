package hw1;

import java.util.Scanner;

public class task_1_5 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.println("Input int:");
            int arg1 = scn.nextInt();
            
            System.out.println("Input float:");
            float arg2 = scn.nextFloat();

            scn.nextLine();
            System.out.println("Input string:");
            String arg3 = scn.nextLine();

            System.out.println("int:" + arg1 + " float:" + arg2 + " string:" + arg3);
        }
    }
}
