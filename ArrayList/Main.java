package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            Arraylist = a resizable array
                        Elements can be added and remove after compilation phase
                        store reference data types
        */

        ArrayList<String> food = new ArrayList<String>();

        // ajout dans la arraylist
        food.add("kebab");
        food.add("hamburger");
        food.add("sandwich");
        food.add("pizza");
        food.add("sushi");

        // modifier la liste
        food.set(0, "curry");
        // enlever un item de la liste
        food.remove(2);
        // supprimer l'interieur de la liste
        food.clear();

        for (String string : food) {
            System.out.println(string);
        }
    }
}
