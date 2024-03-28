package org.example.model;

public class Chocolate extends ProductForSale{
   boolean bitter = true;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println();
    }
}
