package br.lista6.ex01;

public class Industrialized extends Product {
    //a classe Industrialized extende a classe Product, herdando os parametros nome e valor, e os metodos abstratos que iremos implementar nessa classe, calculatePrice e calculateTransport.

    //aqui deinimos as 3 margens de lucro possiveis.
    protected static final double PROFIT_LOW = 1.12;
    protected static final double PROFIT_MID = 1.105;
    protected static final double PROFIT_HIGH = 1.09;

    //definimos aqui os impostos IPI e ICMS, os produtos agricolas não possuem esses impostos.
    protected static final double IPI = 1.05;
    protected static final double ICMS = 1.12;

    //os pordutos industrializados serão contados por unidade, enquanto os agricolas é por KG.
    protected double unity;


    public Industrialized(String name, double value, double unity) {
        super(name, value);
        this.unity = unity;
    }

    //calculamos o preco da mesma forma que calculamos na classe Agricultural, a unica diferenca que aqui utilizamos o parametro uniti ao inves de KG.
    @Override
    private double calculatePrice(){
        if (unity <= 50){
            return (value * PROFIT_LOW) + calculateTransport();
        } else if (unity <= 200) {
            return (value * PROFIT_MID) + calculateTransport();
        }else{
            return (value * PROFIT_HIGH) + calculateTransport();
        }
    }

    //calculamos o adicional de transporte da mesma forma, mas aqui utilizamos o parametro unity.
    public double calculateTransport(){
        if (unity <= 50){
            return (0.35 * unity);

        } else if (unity <= 200) {
            return (0.30 * unity);

        }else {
            return (0.25 * unity);
        }

    }

    //aqui implementamos um metodo que não foi herdado da classe Product, pois os produtos industrializados possuem os impostos IPI e ICMS
    //enquanto os produtos agricolas não.
    //o metodo calculateFinalPrice calcula o preço final do produto levando em conta os impostos.
    public double calculateFinalPrice(){
        return calculatePrice() * ICMS * IPI;
    }


    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getUnity() {
        return unity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setUnity(double unity) {
        this.unity = unity;
    }

    @Override
    public String toString() {
        return "Industrialized{" +
                "unity=" + unity +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
