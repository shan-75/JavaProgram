package Javacoding;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner name= new Scanner(System.in);
        System.out.println("Please enter the string name");

        String name1= name.nextLine();
        char second= name1.charAt(1);

        System.out.println("position of string is "+ second);
    }
}
