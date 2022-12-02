package Javacoding;

import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String[] names= new String[5];

        for (String n:names){

            System.out.println("Please enter the name: ");
            n= sc.nextLine();

        }

    }
}
