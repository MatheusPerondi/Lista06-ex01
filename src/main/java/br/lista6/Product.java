package br.lista6;

public abstract class Product {
    //classe abstrata que servira de base para a classe dos produtos Agricolas e Industrializados.
    protected String name;
    protected double value;

//Todo produto tera um nome e um custo.

    public Product(String name, double value) {
        this.name = name;
        this.value = value;

    }

    //Sabemos que os dois tipos de produtos precisarão de um metodo para calcular o preço e outro metodo para calcular o valor de transporte.
    protected abstract double calculatePrice();

    protected abstract double calculateTransport();





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


}
