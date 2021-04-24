package task9;

import task8.java.A;

abstract  class Animal1 {
    protected String name;
    protected double weight;
    protected String color;
    protected String shape;

    abstract String getValue();

}

class Deer extends Animal1{
    public Deer (String name, double weight, String color, String shape){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.shape=shape;

    }

    @Override
    String getValue() {
        return name + " " + weight + " " + color + " " + shape;
    }

}

class cat extends Animal1 {
    public cat (String name, double weight, String color, String shape) {
        this.name = name;
        this.weight=weight;
        this.color=color;
        this.shape=shape;

    }
    @Override
    String getValue() {
        return name + " " + weight + " " + color + " " + shape;
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal1 A1 = new cat("cat",450,"black","cao to");
        System.out.println(A1.getValue());

        Animal1 A2 = new Deer("huou", 550,"green","cao");
        System.out.println(A2.getValue());

        
    }
}
