package hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Insurance {
    private String policyHolder;
    private double coverageAmount;

    public Insurance(String policyHolder, double coverageAmount) {
        this.policyHolder = policyHolder;
        this.coverageAmount = coverageAmount;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public String getDescription() {
        return "Insurance for " + policyHolder + " with coverage amount $" + coverageAmount;
    }
}

class LifeInsurance extends Insurance {
    private int age;

    public LifeInsurance(String policyHolder, double coverageAmount, int age) {
        super(policyHolder, coverageAmount);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getDescription() {
        return "Life " + super.getDescription() + " for age " + age;
    }
}

class CarInsurance extends Insurance {
    private String carModel;

    public CarInsurance(String policyHolder, double coverageAmount, String carModel) {
        super(policyHolder, coverageAmount);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String getDescription() {
        return "Car " + super.getDescription() + " for " + carModel;
    }
}

class PropertyInsurance extends Insurance {
    private String propertyType;

    public PropertyInsurance(String policyHolder, double coverageAmount, String propertyType) {
        super(policyHolder, coverageAmount);
        this.propertyType = propertyType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    @Override
    public String getDescription() {
        return "Property " + super.getDescription() + " for " + propertyType;
    }
}

public class InsuranceDemo {
    public static void main(String[] args) {
        List<Insurance> insurances = new ArrayList<>();
        insurances.add(new LifeInsurance("John Doe", 1000000, 35));
        insurances.add(new CarInsurance("Alice Smith", 50000, "Sedan"));
        insurances.add(new PropertyInsurance("Bob Johnson", 200000, "House"));

        
        System.out.println("Original List:");
        printInsuranceList(insurances);

        
        Collections.sort(insurances, Comparator.comparingDouble(Insurance::getCoverageAmount).reversed());

        
        System.out.println("\nSorted List by Decreasing Coverage Amount:");
        printInsuranceList(insurances);

        
        double minRange = 50000;
        double maxRange = 300000;

        System.out.println("\nInsurances with Coverage Amount in Range $" + minRange + " to $" + maxRange + ":");
        printInsuranceInRange(insurances, minRange, maxRange);
    }

    private static void printInsuranceList(List<Insurance> insurances) {
        for (Insurance insurance : insurances) {
            System.out.println(insurance.getDescription());
        }
    }

    private static void printInsuranceInRange(List<Insurance> insurances, double minRange, double maxRange) {
        for (Insurance insurance : insurances) {
            double coverageAmount = insurance.getCoverageAmount();
            if (coverageAmount >= minRange && coverageAmount <= maxRange) {
                System.out.println(insurance.getDescription());
            }
        }
    }
}