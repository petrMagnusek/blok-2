package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Lemonade lem1 = new Lemonade("fanta", "pomerancova", 0.7);
        lem1.openBottle();
        //lem1.setFlavor("jahodova");
        System.out.println(lem1.getFlavor());

    }
}