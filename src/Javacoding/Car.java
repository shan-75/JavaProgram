package Javacoding;

public class Car {
    String name;
    String color;
    int model;
    int mileage;

    void result(){
        System.out.println("Name of the car is "+ this.name);
        System.out.println("Name of the car is "+ this.color);
        System.out.println("Name of the car is "+ this.model);
        System.out.println("Name of the car is "+ this.mileage);
    }
}
class Carmain{
    public static void main(String[] args) {
        Car c= new Car();
        c.name="Acura";
        c.color="blue";
        c.model=2022;
        c.mileage=35;

        c.result();
    }
}

