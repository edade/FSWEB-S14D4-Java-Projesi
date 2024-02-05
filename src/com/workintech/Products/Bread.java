package com.workintech.Products;

public class Bread extends ProductForSale{
    private String size;
    public Bread(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;

    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+ this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "size='" + size + '\'' +
                '}';
    }
}
