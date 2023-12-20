package hw11;

public class task2_11 {
    public static void main(String[] args) {
        
        String inputString = "! !  * !";

        
        String transformedString = transformString(inputString);

        
        System.out.println("Вхідний рядок: " + inputString);
        System.out.println("Результат: " + transformedString);
    }

    
    private static String transformString(String input) {
        
        String step1 = input.replace("!", ".");

        
        String step2 = step1.replace(".", "...");

        
        String step3 = step2.replace("*", "+");

        return step3;
    }
}