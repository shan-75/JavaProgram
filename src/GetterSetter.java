//Write a java program to create a class Camera with private properties
//[id, brand, color, price]. Create a getter and setter to get and
//set values. Also, create 3 objects of it and print all details.
public class GetterSetter {
    public static void main(String[] args) {
        Camera c= new Camera();
        c.setBrand("Nikon");
        c.setColor("Black");
        c.setId(12354);
        c.setPrice(34989.98);

        System.out.println(c.getPrice());
        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getId());




    }

}
class Camera{
    private String brand;
    private String color;
    private int id;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    void display(){
//        System.out.println(brand);
//        System.out.println(color);
//        System.out.println(id);
//        System.out.println(price);
//    }
}
