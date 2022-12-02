package Javacoding;

import java.util.Scanner;

public class Birth {
    public static void main(String[] args) {

//      import scanner for object
        Scanner birth= new Scanner(System.in);
        System.out.print("Please enter your birth year: ");

//      Declare variable
        int birthYear= birth.nextInt();
        int age= 2022-birthYear;

//      Print output
        System.out.println("You are  "+ age+ " years old.");
    }
}
