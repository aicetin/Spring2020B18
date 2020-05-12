package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

    // Item item1 = new Item();
    // Item item1 = new Item(2.5);
    Item item1 = new Item("Toilet Paper",25, 100);
    Item item2 = new Item("Paint Brush",3, 5);
    Item item3 = new Item("Canvas",4, 6);
    Item item4 = new Item("Apron", 5,1);
    Item item5 = new Item("Isle", 10, 1);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost = 0;

        // solution 1
        /*
        for( Item each : shoppingList){ // each: item1, item2, item3, item4, item5
            totalCost +=each.calcCost();

        }

         */
        for(int i = 0; i< shoppingList.size(); i++){
            totalCost = shoppingList.get(i).calcCost();


    }
        System.out.println("Total: "+totalCost);

    }
}


