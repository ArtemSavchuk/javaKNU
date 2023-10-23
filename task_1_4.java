package hw1;

public class task_1_4 {
    public static int staticField = 0;
    private int x;

    public task_1_4(int x) {
        this.x = x;
        staticField++;
    }

    public static int getStaticField() {
        return staticField;
    }

    public static void main(String[] args) {
        task_1_4 obj1 = new task_1_4(11);
        task_1_4 obj2 = new task_1_4(22);

        System.out.println("obj1.staticField: " + obj1.getStaticField());
        System.out.println("obj1.x: " + obj1.x);
        System.out.println("obj2.staticField: " + obj2.getStaticField());
        System.out.println("obj2.x: " + obj2.x);

        System.out.println("task_1_4.staticField: " + task_1_4.staticField);
    }
}
