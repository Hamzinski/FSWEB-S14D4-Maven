package org.example.model;

public class Coke extends ProductForSale{
    boolean pepsi = true;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
    }
}
