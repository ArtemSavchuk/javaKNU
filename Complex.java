package hw8;

public class Complex {
    private double real;
    private double imaginary;

    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public double getReal() {
        return real;
    }

    
    public double getImaginary() {
        return imaginary;
    }

    
    public static Complex add(Complex c1, Complex c2) {
        double realSum = c1.real + c2.real;
        double imagSum = c1.imaginary + c2.imaginary;
        return new Complex(realSum, imagSum);
    }

    
    public static Complex multiply(Complex c1, Complex c2) {
        double realProduct = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imagProduct = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new Complex(realProduct, imagProduct);
    }

    public static void main(String[] args) {
        int n = 3; 

        
        Complex[] complexArray = new Complex[n];
        complexArray[0] = new Complex(1.0, 2.0);
        complexArray[1] = new Complex(2.0, 3.0);
        complexArray[2] = new Complex(3.0, 4.0);

        
        Complex sum = computeSum(complexArray);
        Complex product = computeProduct(complexArray);

        
        System.out.println("Сума комплексних чисел: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Добуток комплексних чисел: " + product.getReal() + " + " + product.getImaginary() + "i");
    }

    
    private static Complex computeSum(Complex[] array) {
        Complex sum = new Complex(0.0, 0.0);
        for (Complex complex : array) {
            sum = add(sum, complex);
        }
        return sum;
    }

    
    private static Complex computeProduct(Complex[] array) {
        Complex product = new Complex(1.0, 0.0);
        for (Complex complex : array) {
            product = multiply(product, complex);
        }
        return product;
    }
}