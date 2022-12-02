package Javacoding;

public class Sys {
    String modelname;
    int modelyear;

    Sys(String name, int year){
        this.modelname= name;
        this.modelyear=year;

    }

    void display(){
        System.out.println(modelname);
        System.out.println(modelyear);
    }

}
class sysMain{
    public static void main(String[] args) {
        Sys s= new Sys("Mustang",1969);

        System.out.println(s.modelname + s.modelyear);

        }



}