package Task10;


import java.util.Scanner;

public class Cat extends Animal{
    protected int speed;
    private Rat food;
    public Cat(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public Cat(Rat food) {
        this.food = food;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void eat(Rat food){
        if(food.getWeight()>=100){
            System.out.println("Mum mum! Chuot bao day!");
        }else {
            System.out.println("Mum mum! Chuot hoi gay!");
        }
    }
    public boolean Catch(Rat a){
        return false;
    }
    public void run(){
        System.out.println("Da tom duoc chuot");
    }
    }

