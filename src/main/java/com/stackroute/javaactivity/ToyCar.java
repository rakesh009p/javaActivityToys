package com.stackroute.javaactivity;

class ToyCar extends Toy{
    int price;
    String name;


    public int getPrice() {
        return 120;
    }

    public String getName() {
        return "ToyCar";
    }



        public void move(){
            System.out.println("toycar moves");
        }

}
