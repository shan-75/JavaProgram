package Javacoding;

public class Computer {
//    properties
    private String brand;
    private String color;
    private int id;
//    constructor
    Computer(String brand, String color, int id) {
        this.brand = brand;
        this.color = color;
        this.id = id;
    }
//    output
    void printDetails(){
        System.out.println("Brand is "+ this.brand);
        System.out.println("color is "+ this.color);
        System.out.println("id is "+ this.id);

    }
//    getter setter
//    public String getBrand() {
//        return brand;
//    }
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
}
//main class
class mainComputer{
    public static void main(String[] args) {
//        object instantiated and parameter defined
        Computer c= new Computer("samsung","blue",1);
//        c.setBrand("apple");
//        c.setColor("black");
//        c.setId(2);

//        System.out.println(c.getBrand());
//        System.out.println(c.getColor());
//        System.out.println(c.getId());

        System.out.println("-----------");

        c.printDetails();

    }

}
