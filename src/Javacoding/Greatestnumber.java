package Javacoding;

import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
        Scanner numbers= new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = numbers.nextInt();

        System.out.println("Please enter your second number: ");
        int num2 = numbers.nextInt();

        System.out.println("Please enter your third number: ");
        int num3 = numbers.nextInt();

        if (num1>num2 & num1>num3){
            System.out.println("Number 1 is greater i.e "+ num1);

        } else if (num2>num1 & num2>num3) {
            System.out.println("Number 2 is greater i.e "+ num2);

        } else {
            System.out.println("Number 3 is greater i.e " + num3);

        }

    }
}