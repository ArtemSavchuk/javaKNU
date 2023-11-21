package hw6;

import java.util.Scanner;

public class task_2_14 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введіть розмір матриці N: ");
        int N = scanner.nextInt();

        
        int[][] matrix = new int[N][N];
        System.out.println("Введіть елементи матриці (0 або 1):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        if (isBooleanMatrix(matrix, N)) {
            System.out.println("Матриця є булевою.");
        } else {
            int[] changeElement = findChangeElement(matrix, N);
            if (changeElement.length == 1) {
                System.out.println("Змініть елемент (" + changeElement[0] + ", " + changeElement[1] + ").");
            } else {
                System.out.println("Потрібно змінити більше, ніж 1 елемент.");
            }
        }
    }

    
    private static boolean isBooleanMatrix(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum % 2 != 0 || colSum % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    
    private static int[] findChangeElement(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] ^= 1; 
                if (isBooleanMatrix(matrix, N)) {
                    return new int[]{i + 1, j + 1}; 
                }
                matrix[i][j] ^= 1; 
            }
        }
        return new int[0]; 
    }
}
