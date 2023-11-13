package hw4;

import java.util.Scanner;

public class task_3_10 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double center_x = sc.nextDouble(); // Координата x центра кола
        double center_y = sc.nextDouble(); // Координата y центра кола
        double radius = sc.nextDouble();  // Радіус кола
        double a = sc.nextDouble();      // Параметр a прямої
        double b = sc.nextDouble();     // Параметр b прямої

        
        double discriminant = Math.pow((a *center_x + b*center_y), 2) - (a*a + b*b) * (center_x*center_x + center_y*center_y - radius*radius);

        if (discriminant > 0) {
            System.out.println("Пряма перетинає коло у двох точках.");
        } else if (discriminant == 0) {
            System.out.println("Пряма дотикається кола в одній точці.");
        } else {
            System.out.println("Пряма не перетинає коло.");
        }
    }
}
