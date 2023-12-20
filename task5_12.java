package hw12_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task5_12 {
    
    private static Map<String, Integer> carCounts = new HashMap<>();

    
    private static void processCarInformation(String filePath, String targetBrand) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("\\s+");

                
                String brand = parts[0];
                String number = parts[1];
                String owner = parts[2];

                
                findOwnersAndNumbersByBrand(targetBrand, brand, number, owner);
                updateCarCounts(brand);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void findOwnersAndNumbersByBrand(String targetBrand, String brand, String number, String owner) {
        if (brand.equals(targetBrand)) {
            System.out.println("Brand: " + brand + ", Number: " + number + ", Owner: " + owner);
        }
    }

    
    private static void updateCarCounts(String brand) {
        carCounts.put(brand, carCounts.getOrDefault(brand, 0) + 1);
    }

    
    private static void printCarCounts() {
        System.out.println("Car Counts:");
        for (Map.Entry<String, Integer> entry : carCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        
        String filePath = "D:\\java_unik\\lesson1\\pr1\\src\\hw12_2\\cars.txt";

        
        String targetBrand = "Abrams";

        
        processCarInformation(filePath, targetBrand);

        
        printCarCounts();
    }
}