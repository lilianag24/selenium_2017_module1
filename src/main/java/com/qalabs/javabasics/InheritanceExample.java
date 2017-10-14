package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    //Constructor inicializa el estado del objeto
    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    //Constructor
    MountainBike(String brand) {
        super(brand); //Manda llamar el constructor de super (padre) y configura sus atributos
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}

class RoadBike extends Bike{

    RoadBike(String brand){
        super(brand);
    }

    void speedUp(){
        this.setSpeed(this.getSpeed() + 3);
        System.out.println(String.format("%s speed %d", this.getBrand(), this.getSpeed()));
    }
}


public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike");
        bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        bike = new MountainBike("mountain bike");
        bike.speedUp();

        bike = new RoadBike("Road bike");
        bike.speedUp();
    }
}
