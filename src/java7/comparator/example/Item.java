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

public class Item {

    private String nameOfTheItem;
    private double priceOfTheItem;
    private int quantityOfTheItem;

    public Item() {
    }

    public Item(String nameOfTheItem, double priceOfTheItem, int quantityOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
        this.priceOfTheItem = priceOfTheItem;
        this.quantityOfTheItem = quantityOfTheItem;
    }

    /**
     * @return the nameOfTheItem
     */
    public String getNameOfTheItem() {
        return nameOfTheItem;
    }

    /**
     * @param nameOfTheItem the nameOfTheItem to set
     */
    public void setNameOfTheItem(String nameOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
    }

    /**
     * @return the priceOfTheItem
     */
    public double getPriceOfTheItem() {
        return priceOfTheItem;
    }

    /**
     * @param priceOfTheItem the priceOfTheItem to set
     */
    public void setPriceOfTheItem(double priceOfTheItem) {
        this.priceOfTheItem = priceOfTheItem;
    }

    /**
     * @return the quantityOfTheItem
     */
    public int getQuantityOfTheItem() {
        return quantityOfTheItem;
    }

    /**
     * @param quantityOfTheItem the quantityOfTheItem to set
     */
    public void setQuantityOfTheItem(int quantityOfTheItem) {
        this.quantityOfTheItem = quantityOfTheItem;
    }

    @Override
    public String toString() {
        return "Item: " + getNameOfTheItem() + ", Value: " + getPriceOfTheItem() + ", Quantity: " + getQuantityOfTheItem();
    }

}
