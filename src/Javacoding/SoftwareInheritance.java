package Javacoding;

public class SoftwareInheritance {
    String name;
    double version;
    int date;

    void display(){
        System.out.println(name);
        System.out.println(version);
        System.out.println(date);
    }
}

class msWord extends SoftwareInheritance {
    int fontsize;
    int noofPage;
    String documentName;

    void display() {
        super.display();
        System.out.println(fontsize);
        System.out.println(noofPage);
        System.out.println(documentName);
    }
}

class Msexcel extends SoftwareInheritance {
    int noOfSheet;
    int noOfrows;
    int noOfColumn;


    void display() {
        super.display();
        System.out.println(noOfSheet);
        System.out.println(noOfColumn);
        System.out.println(noOfrows);
    }
}

class Sy{
    public static void main(String[] args) {




//        msWord c= new msWord();
//        c.name="abc";
//        c.version=1;
//        c.date=2022;
//
//        c.fontsize=10;
//        c.noofPage=2;
//        c.documentName="file";
//
//        Msexcel d= new Msexcel();
//        d.name="def";
//        d.version=5;
//        d.date= 2023;
//
//        d.noOfColumn= 5;
//        d.noOfrows=11;
//        d.noOfSheet=2;
//
//        d.display();
//        System.out.println("--------");
//        c.display();
//


    }
}
