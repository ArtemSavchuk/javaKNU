package hw3;
//package Dog;
import hw3.Dog;

public class task_1_6 {
    public static void main(String[] args) 
    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.say = "Ruff!";

        dog2.name = "scruffly";
        dog2.say = "Wurf!";

        System.out.println("Для 1 собаки");
        System.out.println("name = " + dog1.name + " say = " + dog1.say);

        System.out.println("Для 2 собаки");
        System.out.println("name = " + dog2.name + " say = " + dog2.say);

        Dog dog3 = dog1;
        System.out.println(dog1 == dog3);
        System.out.println(dog1.equals(dog3));

    } 
}
