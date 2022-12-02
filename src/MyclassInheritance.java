public class MyclassInheritance {
    public static void main(String[] args) {
        Student s= new Student();
        s.name= "hari";
        s.color="white";
        s.height=5.5;
        s.weight=70;
        s.rollno=25;

        s.details();

    }
}
class Person{
    String name;
    String color;
    double height;
    double weight;

    void personDetails(){
        System.out.println("The name of student is "+ name);
        System.out.println("The color of student is "+ color);
        System.out.println("The height of student is "+ height);
        System.out.println("The weight of student is "+ weight);
    }
}
class Student extends Person{
    int rollno;

    void details(){
        personDetails();
        System.out.println("The roll of student is "+ rollno);
    }
}