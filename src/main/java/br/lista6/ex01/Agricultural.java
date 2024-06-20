package br.lista6.ex01;


public class Agricultural extends Product {
//a classe Agricultural extende a classe Product, herdando os parametros nome e valor, e os metodos abstratos que iremos implementar nessa classe, calculatePrice e calculateTransport.


    //aqui definimos as 3 margens de lucro possiveis.
    protected static final double PROFIT_LOW = 1.08;
    protected static final double PROFIT_MID = 1.05;
    protected static final double PROFIT_HIGH = 1.035;

    //para os produtos agricolas utilizaremos KG.
    protected double kg;

    public Agricultural(String name, double value, double kg) {
        super(name, value);
        this.kg = kg;
    }


    //agora vamos calcular o preço do produto.
//para calcular vamos primeiro verifcar se o produto vai é menor ou igual a 100KG, menor ou igual a 200KG ou acima de 200KG, após verificar, vamos pegar o custo do produto
//e multiplicar com a margem de lucro, que varia de acordo com os KG, depois vamos apenas somar o adicional de transporte.
    @Override
    public double calculatePrice() {
        if (kg <= 100){
            return (value * PROFIT_LOW) + calculateTransport();

        } else if (kg <= 200) {
            return (value * PROFIT_MID) + calculateTransport();

        }else{
            return (value * PROFIT_HIGH) + calculateTransport();
        }
    }


    //para calcular o adicional de transporte vamos primeiro veriicar se o produto é menor ou igual a 100, 200 ou mais, após isso vamos multiplicar o valor do adicional de transporte
//de acordo com quantos KG o produto tem.
    @Override
    public double calculateTransport() {
        if (kg <= 100){
            return (0.10 * kg);

        } else if (kg <= 200) {
            return (0.08 * kg);
        }else{
            return (0.05 * kg);
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


    @Override
    public String toString() {
        return "Agricultural{" +
                "kg=" + kg +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
