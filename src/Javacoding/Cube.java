package Javacoding;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner cube1= new Scanner(System.in);
        System.out.println("Please enter the number :");

        // Declare variable and input
        int num= cube1.nextInt();
        int result= num*num*num;


        //  print the output
        System.out.println("The cube is :" + result);
    }
}
