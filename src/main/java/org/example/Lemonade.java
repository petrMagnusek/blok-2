package org.example;

public class Lemonade {

    private String flavor;

    private String name;


    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void openBottle() {
        System.out.println("You have opened bottle!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Lemonade(String name, String flavor, double volume) {
        this.flavor = flavor;
        this.name = name;
        this.volume = volume;
    }
}
