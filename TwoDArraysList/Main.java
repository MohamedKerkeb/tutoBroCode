package TwoDArraysList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> grocerylist = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("chips");
        produceList.add("nutella");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        grocerylist.add(bakeryList);
        grocerylist.add(produceList);
        grocerylist.add(drinksList);


        System.out.println(grocerylist);
        // avoir qu'une seule liste de la liste 
        System.out.println(grocerylist.get(0));
        // avoir un seul element d'une liste dans la liste 
        System.out.println(grocerylist.get(1).get(2));


    }
}
