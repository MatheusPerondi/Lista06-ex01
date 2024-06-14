package br.lista6;


public class Agricultural extends Product{

    protected static final double PROFIT_LOW = 1.08;
    protected static final double PROFIT_MID = 1.05;
    protected static final double PROFIT_HIGH = 1.035;

    protected String name;
    protected Double value;
    protected double quantity;

    public Agricultural(String name, double value, double quantity) {
        super(name, value, quantity);
    }


    @Override
    protected double calculatePrice() {
        if (quantity <= 100){
            double additionalTransport = 0.10 * quantity;

            return (value * PROFIT_LOW) + additionalTransport;
        } else if (quantity <= 200) {
            double additionalTransport = 0.08 * quantity;

            return (value * PROFIT_MID) + additionalTransport;
        }else{
            double additionalTransport = 0.05 * quantity;

            return (value * PROFIT_HIGH) + additionalTransport;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public double getQuantityIndustrialized() {
        return quantity;
    }

    public void setQuantityIndustrialized(double quantityIndustrialized) {
        this.quantity = quantityIndustrialized;
    }
}
