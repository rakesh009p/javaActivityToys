package com.stackroute.javaactivity;

class ToyTrain extends Toy{
    int price;
    String name;
    public int getPrice() {
        return 300;
    }

    public String getName() {
        return "ToyTrain";
    }


    public void move(){
        System.out.println("toytrain moves");
    }

}
