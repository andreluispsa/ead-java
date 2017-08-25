package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.43);
        hamburger.addHamburgerAddition3("Cheese", 1.48);
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());
    }
}
