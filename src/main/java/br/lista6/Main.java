package br.lista6;

import br.lista6.Agricultural;


//criei a classe Main apenas pra testar o codigo. Tive um problema com questao de encapsulamento
//tinha separado os arquivos todos em pacotes difentes, bem organizados, mas ai não conseguia chamar os metodos.
//da uma olhada pra ver se consegue resolverr.

//mudei algumas coisas do algoritimo que fizemos na aula, a proxima coisa a fazer é desenvolver uma forma de cadastramento de produtos, ja tenho em mente como fazer
//temos que fazer tambem os testes unitarios, perdi essa aula ent n faco ideia de como fazer.
public class Main {
    public static void main(String[] args) {
        Agricultural wheat = new Agricultural("Milho", 100.00, 150);

        System.out.println(wheat.calculatePrice());


        Industrialized cheese = new Industrialized("Queijo", 100, 10);

        System.out.println(cheese.calculateFinalPrice());
    }
}
