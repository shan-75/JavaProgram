public class Algebrainheritance {
    public static void main(String[] args) {
//      Triangle has inheritated the property and method of rectangle so create
//        object of triangle.
        Triangle t= new Triangle();
        t.height=2.5;
        t.width=1.5;

//      method printall contains the method of print as well so display both area
        t.printall();

//  we dont have to create Triangle object seprately since square has all its property.
        Square s= new Square();
        s.length=2.5;
        s.width=1.5;
        s.height=2.5;
        s.display();





    }
}

class Rectangle{
    double height;
    double width;

    void print(){
        System.out.println("The area of Rectangle is "+ (height*width)+ " cm square.");
    }
}

class Triangle extends Rectangle{

    void printall(){
//      print() is the method of Rectangle so when we call printall() displays both area.
        print();
        System.out.println("The area of Triangle is "+ (height*width)/2+ " cm square.");
    }

}

class Square extends Triangle{
    double length;

    void display(){
       printall();
       System.out.println("The area of square is "+ (height*width*length));
    }


}
