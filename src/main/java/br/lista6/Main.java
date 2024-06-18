package br.lista6;

import br.lista6.Agricultural;
import com.sun.source.doctree.BlockTagTree;

import java.util.ArrayList;
import java.util.List;


//criei a classe Main apenas pra testar o codigo. Tive um problema com questao de encapsulamento
//tinha separado os arquivos todos em pacotes difentes, bem organizados, mas ai não conseguia chamar os metodos.
//da uma olhada pra ver se consegue resolverr.

//mudei algumas coisas do algoritimo que fizemos na aula, a proxima coisa a fazer é desenvolver uma forma de cadastramento de produtos, ja tenho em mente como fazer
//temos que fazer tambem os testes unitarios, perdi essa aula ent n faco ideia de como fazer.
public class Main {
    public static void main(String[] args) {
        Agricultural wheat = new Agricultural("Wheat", 100.00, 150);
        Agricultural sugarCane = new Agricultural("Sugar Cane", 50, 100);
        Agricultural coffe = new Agricultural("Coffe ", 20, 170);
        Agricultural soy = new Agricultural("Soy", 10, 210);

        Industrialized chips = new Industrialized("Chips", 15, 32);
        Industrialized cookie = new Industrialized("Cookie", 17, 190);
        Industrialized pizza = new Industrialized("Pizza", 43, 110);
        Industrialized cheese = new Industrialized("Cheese", 25, 60);

        List<Product> products = new ArrayList<>();
        products.add(wheat);
        products.add(sugarCane);
        products.add(coffe);
        products.add(soy);
        products.add(chips);
        products.add(cookie);
        products.add(pizza);
        products.add(cheese);

        System.out.println(products);

        System.out.println(cookie.calculateFinalPrice());
        System.out.println(cookie.calculateTransport());
        System.out.println(cookie.calculatePrice());

        System.out.println(wheat.calculatePrice());
        System.out.println(wheat.calculateTransport());
    }
}
