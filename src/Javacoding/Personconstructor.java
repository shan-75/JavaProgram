package Javacoding;

public class Personconstructor{
//    properties
    int id;
    String firstname;
    String lastname;

//    constructor
//    arguments
    Personconstructor(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
//        method
        void print() {
            System.out.println("id is " + this.id);
            System.out.println("id is " + this.firstname);
            System.out.println("id is " + this.lastname);
        }
    }


class Man {
    public static void main(String[] args) {
//        call constructor parameters
        Personconstructor p1 = new Personconstructor (1, "hari", "gurung");
        p1.print();
    }
}

