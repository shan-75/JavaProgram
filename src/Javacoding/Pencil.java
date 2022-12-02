package Javacoding;

public class Pencil {
    String name;
    String color;
    double size;

//    constructor
    Pencil(String name, String color, double size){
        this.name=name;
        this.color=color;
        this.size=size;
    }

    void display(){
        System.out.println("Name is "+ name);
        System.out.println("Name is "+ color);
        System.out.println("Name is "+ size);
    }
}
class pencilBody{
    public static void main(String[] args) {
        Pencil p1= new Pencil("H&B","Black",5.5);
        Pencil p2= new Pencil("H&B","Blue",5.5);
        Pencil p3= new Pencil("C&D","Green", 7.2);



        p1.display();
        System.out.println("------------");
        p2.display();
        System.out.println("------------");
        p3.display();
    }
}
