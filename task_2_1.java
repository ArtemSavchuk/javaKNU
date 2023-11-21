package cl3;

public class task_2_1 {
    public static void main(String[] args) 
    {
        int x = 0xAAAAAAAA;
        int y = 0x10000000;

        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));

        System.out.println("x ^ y = " + Integer.toBinaryString(x ^ y));
        System.out.println("x | y = " + Integer.toBinaryString(x | y));
        System.out.println("x & y = " + Integer.toBinaryString(x & y));
        System.out.println("~y = " + Integer.toBinaryString(~x));
        System.out.println("~y = " + Integer.toBinaryString(~y));

        System.out.println("x>>2 = " + Integer.toBinaryString(x>>2));
        System.out.println("x<<2 = " + Integer.toBinaryString(x<<2));
        System.out.println("y>>2 = " + Integer.toBinaryString(y>>2));
        System.out.println("y<<2 = " + Integer.toBinaryString(y<<2));

        System.out.println("x>>>2 = " + Integer.toBinaryString(x>>>2));
        System.out.println("y>>>2 = " + Integer.toBinaryString(y>>>2));
    }
}
