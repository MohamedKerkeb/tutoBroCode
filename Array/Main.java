package Array;

public class Main {
    
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String[] cars = {"Renaud", "Peugeot", "Audi", "Mercedes"};

        cars[0] = "Jaguar";

        System.out.println(cars[3]);

        String[] marque = new String[3];

        marque[0] = "Coca Cola";
        marque[1] = "Pepsi";
        marque[2] = "Hamoud";

        for (String string : marque) {
            System.out.println(string);
        }

    }
}
