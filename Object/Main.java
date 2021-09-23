package Object;

public class Main {
    public static void main(String[] args) {
        
        // * object = an instance of a class that may contain attributes and methods
        // * example: (phone , desk, computer, coffe cup)
        // * Attributes is caracteristic that object has
        // * Methods is action can perform


        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();


    }
}
