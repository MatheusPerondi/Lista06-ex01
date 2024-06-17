package br.lista6;

public abstract class Product {



    protected String name;
    protected double value;
    protected double quantity;

    public Product(String name, double value, double quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    protected abstract double calculatePrice();

    protected abstract double calculateTransport();

    protected abstract double calculateProfit();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
