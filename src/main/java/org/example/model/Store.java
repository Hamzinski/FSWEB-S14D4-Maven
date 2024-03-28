package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Antep Fıstıklı", 10, "Muazzam");
        products[1] = new Coke("Zero", 15, "0 kalori");
        products[2] = new Bread("Tam Buğday Unlu", 20, "Şekeri azaltılmış.");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}