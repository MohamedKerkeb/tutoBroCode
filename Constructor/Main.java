package Constructor;

public class Main {
    public static void main(String[] args) {
        // * constructor = special method that is called when an object is instantiated (created)

        Human human1 = new Human("Abdou", 36, 90);
        Human human2 = new Human("Adam", 10, 25);


        //System.out.println(human2.name);
        human1.drink();
        human2.eat();
    }
}
