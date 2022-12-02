package Javacoding;

public class SchoolInheritance {
    String name;
    String address;

    void display(){
        System.out.println("The name of the school is "+ name);
        System.out.println("The address is "+ address);
    }
}
//super class is schoolInheritance
//studentinfo has all the properties of schoolinheritance.
class studentInfo extends SchoolInheritance{
    String fname;
    String lname;
    int rollno;

    @Override
    void display() {
        super.display();
        System.out.println("Full name is "+ fname+ lname);
        System.out.println("Roll no is "+ rollno);
    }
}
//super class is student info
// studentcontact has all properties of studentinfo including schoolinheritance.
class studentContact extends studentInfo{
    String stdaddress;
    int phonenumb;

    @Override
    void display() {
        super.display();
        System.out.println("Home address is "+ stdaddress);
        System.out.println("Phone number is "+ phonenumb);
    }
}

class Resume{
    public static void main(String[] args) {
        studentInfo s = new studentInfo();
        s.name="Texas University";
        s.address="Dallas";
        s.fname="Shan";
        s.lname="Thapa";
        s.rollno=57;


        s.display();


    }
}
