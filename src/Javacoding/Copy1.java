package Javacoding;

public class Copy1 {
    String name;
    int id;
    int price;

    void display(){
        System.out.println("Name is "+ this.name);
        System.out.println("Name is "+ this.id);
        System.out.println("Name is "+ this.price);
    }

}
//best practice is to make seprate main file
class Main1 {
    public static void main(String[] args) {
        Copy1 c1= new Copy1();
        c1.name= "Eagle";
        c1.id= 1;
        c1.price= 250;

        c1.display();

        Copy1 c2= new Copy1();
        c2.name= "Lotus";
        c2.id= 2;
        c2.price=300;
        c2.display();

    }
}


