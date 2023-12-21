package proj.src;

//package Histogram;

public class Histogram {
    private double minHist;
    private double maxHist;
    private int M;
    private int[] frequency;

    // Конструктор без аргументів
    public Histogram() {
        
    }

    

    // Метод для встановлення мінімального значення
    public void setMin(double m) {
        this.minHist = m;
    }

    // Метод для встановлення максимального значення
    public void setMax(double m) {
        this.maxHist = m;
    }

    // Метод для встановлення кількості стовбців в гістограмі
    public void setM(int M) {
        if (M <= 0) {
            throw new IllegalArgumentException("Invalid value for M. M should be greater than 0.");
        }
        this.M = M;
        this.frequency = new int[M];
    }

    // Метод додавання числа в гістограму (варіант 1)
    public void addNumber1(double value) {
        if (value == maxHist)
        {
            int binIndex = (int) ((value - minHist) / ((maxHist - minHist) / M));
            frequency[binIndex-1]++;
        }
        else if (value >= minHist && value <= maxHist) {
            int binIndex = (int) ((value - minHist) / ((maxHist - minHist) / M));
            frequency[binIndex]++;
        }
    }

    // Метод додавання числа в гістограму (варіант 2)
    public void addNumber2(double value) {
        if (value >= minHist && value <= maxHist) {
            if (value == maxHist) {
                // Додаємо до останнього стовпця
                frequency[M - 1]++;
            } else if (value == minHist) {
                // Додаємо до першого стовпця
                frequency[0]++;
            }
        }
    }

    // Метод додавання числа в гістограму (варіант 3)
    public void addNumber3(double value) 
    {
        if (value < minHist || value > maxHist) {
            // Змінюємо межі
        if (value < minHist) {
                minHist = value;
        } else {
            maxHist = value;
        }
        } else {
            int binIndex = (int) ((value - minHist) / ((maxHist - minHist) / M));
            frequency[binIndex]++;
        }
    }

    // Функція додавання масиву чисел до гістограми
    public void addBatch(double[] data) {
        for (double value : data) {
            addNumber3(value);
        }
    }

    // Функція, яка повертає кількість чисел в гістограмі
    public int num() {
        int totalCount = 0;
        for (int count : frequency) {
            totalCount += count;
        }
        return totalCount;
    }

    // Функція, яка повертає частоту конкретного стовпчика
    public int numHist(int i) {
        if (i < 0 || i >= M) {
            throw new IllegalArgumentException("Invalid index for histogram column.");
        }
        return frequency[i];
    }

    // Функція, яка повертає середнє значення гістограми
    public double mean() {
        int totalCount = num();
        double sum = 0.0;
        for (int i = 0; i < M; i++) {
            sum += (minHist + i * ((maxHist - minHist) / M) + (minHist + (i + 1) * ((maxHist - minHist) / M))) / 2 * frequency[i];
        }
        return sum / totalCount;
    }

    // Функція, яка повертає медіану гістограми
    public double median() {
        int totalCount = num();
        int middle = totalCount / 2;

        int cumulativeCount = 0;
        for (int i = 0; i < M; i++) {
            cumulativeCount += frequency[i];
            if (cumulativeCount >= middle) {
                return minHist + i * ((maxHist - minHist) / M);
            }
        }

        return 0.0; // Якщо гістограма порожня, повертаємо 0.0
    }

    // Функція, яка повертає середнє відхилення гістограми
    public double dev() {
        int totalCount = num();
        double mean = mean();
        double sumSquaredDiff = 0.0;

        for (int i = 0; i < M; i++) {
            double midPoint = minHist + i * ((maxHist - minHist) / M) + (minHist + (i + 1) * ((maxHist - minHist) / M)) / 2;
            sumSquaredDiff += frequency[i] * Math.pow(midPoint - mean, 2);
        }

        return Math.sqrt(sumSquaredDiff / totalCount);
    }

    // Функція, яка повертає дисперсію гістограми
    public double variance() {
        int totalCount = num();
        double mean = mean();
        double sumSquaredDiff = 0.0;

        for (int i = 0; i < M; i++) {
            double midPoint = minHist + i * ((maxHist - minHist) / M) + (minHist + (i + 1) * ((maxHist - minHist) / M)) / 2;
            sumSquaredDiff += frequency[i] * Math.pow(midPoint - mean, 2);
        }

        return sumSquaredDiff / totalCount;
    }

    public void displayHistogram() {
        System.out.println("Histogram:");

        double binWidth = (maxHist - minHist) / M;
        for (int i = 0; i < M; i++) {
            double binStart = minHist + i * binWidth;
            double binEnd = binStart + binWidth;
            System.out.printf("[%f - %f): %d%n", binStart, binEnd, frequency[i]);
        }
    }
    
}
