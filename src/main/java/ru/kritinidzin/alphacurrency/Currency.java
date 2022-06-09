package ru.kritinidzin.alphacurrency;

public class Currency {
    private double price;

    public Currency() {
    }

    public Currency(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
