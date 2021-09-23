package TwoDArrays;

public class Main {
    public static void main(String[] args) {
        // 2D Array = an array of array;

        /* 
        String[][] cars = new String[3][3];

        cars[0][0] = "Porsche";
        cars[0][1] = "Mercedes";
        cars[0][2] = "Ferrari";
        cars[1][0] = "Audi";
        cars[1][1] = "Volkswagen";
        cars[1][2] = "Opel";
        cars[2][0] = "Aston Martin";
        cars[2][1] = "Jaguar";
        cars[2][0] = "Maserati";
        */

        String[][] cars = {
                            {"Porsche","Mercedes","Ferrari"},
                            {"Audi","Volkswagen", "Opel"},
                            {"Aston Martin","Jaguar","Maserati"}
                        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j]+ " ");
            }
        }

    } 
}
