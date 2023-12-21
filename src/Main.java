package proj.src;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

import proj.src.Histogram;

public class Main 
{
    public static void main(String[] args) {


        // Example usage
        Histogram histogram = new Histogram();
        System.out.println("Enter 1 for consol and 2 for file");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        scanner.close();
        if(var == 1)
        {

            int m;
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("min = ");
            m = scanner3.nextInt();
            histogram.setMin(1.5);
        
            System.out.println("max = ");
            m = scanner3.nextInt();
            histogram.setMax(9.2);

            System.out.println("m = ");
            m = scanner3.nextInt();
            histogram.setM(4);

            System.out.println("size = ");
            int size = scanner3.nextInt();
            // Створіть масив заданого розміру
            double[] array = new double[size];
            // Зчитайте елементи масиву з консолі
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) 
            {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner3.nextDouble();
            }

            histogram.addBatch(array);

            System.out.println("number = ");
            double s = scanner3.nextDouble();
            histogram.addNumber2(s);

            System.out.println("number = ");
            s = scanner3.nextDouble();
            histogram.addNumber3(s);
            

            // Display the histogram
            histogram.displayHistogram();
            System.out.println("Total Number of Values: " + histogram.num());
            System.out.println("Frequency of Column 2: " + histogram.numHist(2));
            System.out.println("Mean: " + histogram.mean());
            System.out.println("Median: " + histogram.median());
            System.out.println("Standard Deviation: " + histogram.dev());
            System.out.println("Variance: " + histogram.variance());
            scanner3.close();
        }
        else
        {
            try{
            // Вказати шлях до файлу
            File inputFile = new File("D:\\java_unik\\lesson1\\pr1\\src\\proj\\tests\\input.txt");
            Scanner scanner1 = new Scanner(inputFile);

            // Створити об'єкт гістограми
            //Histogram histogram = new Histogram();

            // Зчитування min
            System.out.print("min = ");
            double min = scanner1.nextDouble();
            histogram.setMin(min);

            // Зчитування max
            System.out.print("max = ");
            double max = scanner1.nextDouble();
            histogram.setMax(max);

            // Зчитування m
            System.out.print("m = ");
            int m = scanner1.nextInt();
            histogram.setM(m);

            // Зчитування розміру масиву
            System.out.print("size = ");
            int size = scanner1.nextInt();
            // Створити масив заданого розміру
            double[] array = new double[size];

            // Зчитування елементів масиву
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner1.nextDouble();
            }

            // Додавання масиву до гістограми
            histogram.addBatch(array);

            // Зчитування числа та додавання його до гістограми
            System.out.print("number = ");
            double number1 = scanner1.nextDouble();
            histogram.addNumber2(number1);

            // Зчитування числа та додавання його до гістограми
            System.out.print("number = ");
            double number2 = scanner1.nextDouble();
            histogram.addNumber3(number2);

            // Відображення гістограми
            histogram.displayHistogram();
            System.out.println("Total Number of Values: " + histogram.num());
            System.out.println("Frequency of Column 2: " + histogram.numHist(2));
            System.out.println("Mean: " + histogram.mean());
            System.out.println("Median: " + histogram.median());
            System.out.println("Standard Deviation: " + histogram.dev());
            System.out.println("Variance: " + histogram.variance());

            // Закриття Scanner
            scanner1.close();
            }catch(FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        }
    }
}
