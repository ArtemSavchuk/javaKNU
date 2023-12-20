package hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_20 {
    public static void main(String[] args) {
        
        String inputString = "Today is 11/25/2023 and tomorrow is 12/01/2023.";

        
        String convertedString = convertDates(inputString);

        
        System.out.println("Вхідний рядок: " + inputString);
        System.out.println("Результат: " + convertedString);
    }

    
    private static String convertDates(String input) {
        
        String regex = "\\b(\\d{2}/\\d{2}/\\d{4})\\b";

        
        Pattern pattern = Pattern.compile(regex);

        
        Matcher matcher = pattern.matcher(input);

        
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String americanDate = matcher.group(1);
            String[] parts = americanDate.split("/");
            String ukrainianDate = parts[1] + "/" + parts[0] + "/" + parts[2];
            matcher.appendReplacement(result, ukrainianDate);
        }
        matcher.appendTail(result);

        return result.toString();
    }
}
