package Method;

public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon 
        String name = "Mohamed";
        int age = 42;
        hello(name, age);

        int x = 3;
        int y = 4;

        System.out.println("Resultat: " + add(x,y));

    }

    // method qui ne retourn rien mais peu servir pour instance des variables.
    static void hello(String name, int age) {
        System.err.println("Hello " + name + "and You are " + age);
    }

    // Method qui retourn une variable ou un boolean mais 
    static int add(int x , int y) {
        return x + y;
    }
}
;