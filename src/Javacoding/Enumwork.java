package Javacoding;

enum Gender{Male, Female, Others}
public class Enumwork {
    public static void main(String[] args) {
        Per p= new Per();
        p.gender= Gender.Male;
        p.name="Hari";
        p.display();

    }
}
class Per{
    String name;
    Gender gender;

    void display(){
        System.out.println("Gender is "+ gender);
        System.out.println("Name is "+ name);
    }
}
