package hw5;

import java.util.Scanner;

public class task_1_9 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        boolean[] array_bool = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            array_bool[i] = false;
        }

        for(int i = 0; i < n; i++)
        {
            int numb = array[i];
            String s = Integer.toString(numb);
            char[] cArray = s.toCharArray();
            boolean per = true;
            //System.out.println("number = " + numb);
            for(int j = 0; j < s.length(); j++)
            {   //System.out.println(cArray[j]);
                for(int k = j+1; k < s.length(); k++)
                {
                    if(cArray[j] == cArray[k])
                    {
                        per = false;
                        //System.out.println(cArray[j]);
                    }
                }
            }
            if(per)
            {
                array_bool[i] = true;
            } 
        }
        //for(int i = 0; i < n; i++)
        //{
        //    System.out.println(array_bool[i]);
        //}
        int max_val = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                if(array_bool[i])
                {
                    max_val = array[i];
                }
            }
            if(array_bool[i] && array[i] > max_val)
            {
                max_val = array[i];
            }
        }
        System.out.println(max_val);
    }
}
