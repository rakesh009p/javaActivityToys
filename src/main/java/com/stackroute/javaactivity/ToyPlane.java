package com.stackroute.javaactivity;

class ToyPlane extends Toy{
    int price;
    String name;
    public int getPrice() {
        return 500;
    }

    public String getName() {
        return "ToyPlane";
    }


    public void fly(){
        System.out.println("toy flies");
    }

}
