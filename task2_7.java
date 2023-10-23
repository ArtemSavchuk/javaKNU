package cw2;

public class task2_7 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Wrong arguments");
        }
        else{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int d = x*y;
            System.out.println("d=" + d);
        }
    }
}
