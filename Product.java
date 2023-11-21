package hw7;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private String producer;
    private double cost;
    private String exp_date;
    private int number;

    
    public Product(int id, String name, String producer, double cost, String exp_date, int number) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.cost = cost;
        this.exp_date = exp_date;
        this.number = number;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public double getCost() {
        return cost;
    }

    public String getExpDate() {
        return exp_date;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product1", "Producer1", 10.99, "2023-01-01", 5));
        products.add(new Product(2, "Product2", "Producer2", 20.49, "2023-02-15", 8));
        products.add(new Product(3, "Product3", "Producer1", 15.79, "2023-03-20", 3));
        products.add(new Product(4, "Product4", "Producer3", 25.99, "2023-04-10", 10));

        
        System.out.println("Список об'єктів з заданим name:");

        printProducts(filterByName(products, "Product2"));

        
        System.out.println("\nМасив об'єктів з заданим name та cost більше 20:");


        printProducts(filterByNameAndCost(products, "Product1", 5));

        
        System.out.println("\nСписок об'єктів, exp_date яких перевищує 2023-03-01:");
        printProducts(filterByExpDate(products, "2023-03-01"));
    }

    
    private static void printProducts(List<Product> productList) 
    {
        for (Product product : productList) 
        {
            System.out.println(product.getId() + ": " + product.getName() + " - " + product.getCost());
        }
    }

    
    private static List<Product> filterByName(List<Product> products, String name) 
    {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) 
        {
            if (product.getName().equals(name)) 
            {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    
    private static List<Product> filterByNameAndCost(List<Product> products, String name, double costThreshold) 
    {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) 
        {
            if (product.getName().equals(name) && product.getCost() > costThreshold) 
            {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    
    private static List<Product> filterByExpDate(List<Product> products, String expDateThreshold) 
    {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) 
        {
            if (product.getExpDate().compareTo(expDateThreshold) > 0)
            {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
