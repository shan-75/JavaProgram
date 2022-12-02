package Javacoding;

import java.util.Scanner;

public class Insertstrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] names= new String[5];


        for (int i=0; i<5; i++){
            System.out.println("Enter the name for index: " +i);
            names[i]= sc.nextLine();

        }
        for (int i=0; i<5; i++){
            System.out.println(names[i]);
        }
    }
}