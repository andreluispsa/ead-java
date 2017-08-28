package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.43);
        hamburger.addHamburgerAddition3("Cheese", 1.48);
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.76);
        healthyBurger.addHealthyAddition1("Lettuce", 0.54);
        healthyBurger.addHealthyAddition2("Tomato", 0.25);
        healthyBurger.addHamburgerAddition1("Cheese", 0.49);
        System.out.println("Total Healthy Burger price is: " + healthyBurger.itemizeHamburger());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Egg", 5.43);
        System.out.println("Total Deluxe Burger price is: " + db.itemizeHamburger());

    }
}
