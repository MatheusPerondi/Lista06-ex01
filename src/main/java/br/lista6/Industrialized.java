package br.lista6;

public class Industrialized extends Product {

    protected static final double PROFIT_LOW = 1.12;
    protected static final double PROFIT_MID = 1.105;
    protected static final double PROFIT_HIGH = 1.09;


    protected static final double IPI = 0.05;
    protected static final double ICMS = 0.12;

    protected String name;
    protected Double value;
    protected double quantity;


    public Industrialized(String name, double value, double quantity) {
        super(name, value, quantity);
    }


    @Override
    protected double calculatePrice(){
        if (quantity <= 50){
            return (value * PROFIT_LOW) + calculateTransport();
        } else if (quantity <= 200) {
            return (value * PROFIT_MID) + calculateTransport()
        }else{
            return (value * PROFIT_HIGH) + calculateTransport()
        }
    }


    protected double calculateTransport(){
        if (quantity <= 50){
            double additionalTransport = (0.35 * quantity);
            return additionalTransport;

        } else if (quantity <= 200) {
            double additionalTransport = (0.30 * quantity);
            return additionalTransport;

        }else {
            double additionalTransport = (0.25 * quantity)
            return additionalTransport;
        }

    }


    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
