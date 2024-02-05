package com.workintech.Products;

public class Chocolate extends ProductForSale{
    private String brand;
    public Chocolate(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+ this);
    }

    @Override
    public String toString() {
        return "com.workintech.Products.Chocolate{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
