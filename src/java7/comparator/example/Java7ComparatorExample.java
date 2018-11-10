/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java7.comparator.example;

/**
 *
 * @author Momir Sarac
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java 7 comparator example, for Java 8 comparator example, please refer to
 * Project Java7 Comparator example
 *
 * @author Momir Sarac
 */
public class Java7ComparatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Item> listOfItems = new ArrayList<Item>();
        listOfItems.add(new Item("Iphone 6s", 849.99, 85));
        listOfItems.add(new Item("Iphone 5s", 549.99, 36));
        listOfItems.add(new Item("Iphone 7", 1299.99, 174));
        listOfItems.add(new Item("Iphone 6", 649.99, 75));

        // print unsorted list
        printItems(listOfItems);

        // sorting a list by a value
        Collections.sort(listOfItems, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return (int) (i1.getPriceOfTheItem() - i2.getPriceOfTheItem());
            }

        });
        // prints all the items by it's value - ascending order
        printItems(listOfItems);

        // prints all the items using condition for 
        // acqusition of all the items which price value is greater than or equals 750
        printItemsUsingCondition(listOfItems, new Condition() {
            @Override
            public boolean testCondition(Item i) {
                return i.getPriceOfTheItem() >= 750;
            }

        });

        // prints all the items using condition for 
        // acqusition of all the items which contain 6s in an item name.
        printItemsUsingCondition(listOfItems, new Condition() {
            @Override
            public boolean testCondition(Item i) {
                return i.getNameOfTheItem().contains("6s");
            }

        });

    }

    /**
     * Prints all the items from a list
     *
     * @param listOfItems
     */
    private static void printItems(List<Item> listOfItems) {
        for (Item i : listOfItems) {
            System.out.println(i.toString());
        }
    }

    /**
     * Prints all condition binded items from a list
     *
     * @param listOfItems
     * @param condition
     */
    private static void printItemsUsingCondition(List<Item> listOfItems, Condition condition) {
        for (Item i : listOfItems) {
            if (condition.testCondition(i)) {
                System.out.println(i.toString());
            }
        }
    }
}
