package ToString;

public class Car {
    
    String make = "Ford";
    String model = "Mustang";
    String color = "blue";
    int year = 2021;

    public String toString() {
        String myString = "ma voiture est une " + make + " " + model + " de l'année " + year + " et de coleur " + color;
        return myString;
    }
}
