package com.workintech.Products;

public class Coke extends ProductForSale {
    private boolean isSugarFree;

    public Coke(String type, double price, String description, boolean isSugarFree) {
        super(type, price, description);
        this.isSugarFree = isSugarFree;
    }

    @Override
    public void showDetails() {

        System.out.println(super.toString()+ this);

    }

    @Override
    public String toString() {
        return "Coke{" +
                "isSugarFree=" + isSugarFree +
                '}';
    }
}
