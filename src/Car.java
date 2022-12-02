public class Car {
    String name;
    double speed;
    double mileage;
    String color;
//   constructor 1
    Car(String name, double speed, double mileage, String color){
        this.name=name;
        this.speed=speed;
        this.mileage= mileage;
        this.color=color;

    }
//    constructor 2 but with different data types. constructor overloading.
    Car(String name, int speed, double mileage, String color){
        this.name=name;
        this.speed=speed;
        this.mileage= mileage;
        this.color=color;
    }

    void display(){
        System.out.println("The name of the car is: "+ name);
        System.out.println("The speed of the car is: "+ speed+ " miles per hour");
        System.out.println("The mileage of the car is: "+ mileage+ " miler per hour");
        System.out.println("The color of the car is: "+ color);
    }

}
class carDetails{
    public static void main(String[] args) {
        Car c= new Car("Audi",300,35,"Black");
        Car c1= new Car("bmw", 200,25,"Blue");

        c.display();
        System.out.println("---------------");
        c1.display();

    }
}