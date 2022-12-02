package Javacoding;

import java.util.Scanner;

public class Zeropositivenegative {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int num = number.nextInt();

        if (num==0){
            System.out.println("The number is Zero");
        } else if (num<0) {
            System.out.println("The number is Negative");

        }else {
            System.out.println("The number is positive");
        }

    }
}