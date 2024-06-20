package br.lista6.ex01;

import java.util.ArrayList;
import java.util.List;



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
