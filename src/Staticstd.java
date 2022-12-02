public class Staticstd {
    public static void main(String[] args) {
//        school is static meaning can be used by any object.
        Std.school= "Texas Uni";

        Std s= new Std();
        s.name="Harry";
        s.address="Texas";
        s.id=7;
        s.ph=9856;

        Std s1= new Std();
        s1.name= "potter";
        s1.address="Arizona";
        s1.id=8;
        s1.ph=9876;

        System.out.println("School of "+ s.name+ ":" + s.school);
        System.out.println("School of "+ s1.name+ ":"+ s1.school);


    }

}

class Std{
    String name;
    String address;
    int id;
    int ph;
    static String school;
}
