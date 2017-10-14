package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank new speed %s", this.speed));
    }

    public void printSpec() {
        System.out.println("Tank printSpec");
    }
}

class Truck implements Vehicle{
    private int speed;

    Truck(){ this.speed = 0; }

    public void speedUp(){
        this.speed += 2;
        System.out.println(String.format("Truck new speed %s", this.speed));
    }

    public void printSpec() {
        System.out.println("Truck printSpec");
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle.printSpec();
        Vehicle myVehicle2 = new Truck();
        myVehicle2.speedUp();
   }
}
