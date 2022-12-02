package Javacoding;

public class Laptopclassobject{
//    properties/attributes/field(not a main class)
    String name;

    String color;
    int ram;
    int hdd;
    int size;

//    method
    void display(){
        System.out.println("name is "+ this.name);
        System.out.println("color is "+ this.color);
        System.out.println("ram is "+ this.color+ " GB");
        System.out.println("name is "+ this.hdd+ " 1TB");
        System.out.println("name is "+ this.size+ " inch");
    }
}



class Monitorwork{
    public static void main(String[] args) {
        //creating object inside main class
        //className c1= new className
        Laptopclassobject p1= new Laptopclassobject();

//        using userinput method
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Please enter the name of laptop");
        p1.name="Macbook";
        p1.color="Black";
        p1.ram= 4;
        p1.size=16;
        p1.hdd=500;

        Laptopclassobject p2= new Laptopclassobject();
        p2.name="Dell";
        p2.color="Black";
        p2.ram= 4;
        p2.size=8;
        p2.hdd=250;

        p1.display();
        System.out.println("-----------------");
        p2.display();
    }

}

