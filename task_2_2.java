package cl3;

public class task_2_2 {
    public static void main(String[] args) 
    {
        int x = 0x80000000;
        System.out.println("x = " + Integer.toBinaryString(x));
        //int l = Integer.toBinaryString(x);
        //System.out.println(l);
        int i = 1;
        int len = Integer.toBinaryString(x).length();
        while(i < len)
        {
            x >>= 1;
            i+=1;
            System.out.println("x = " + Integer.toBinaryString(x));
        }
    }
}
