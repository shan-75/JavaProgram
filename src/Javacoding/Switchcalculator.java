package Javacoding;

import java.util.Scanner;

public class Switchcalculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int n1 = num.nextInt();

        System.out.println("Please enter the second number:");
        int n2 = num.nextInt();

        System.out.println("Please select the mode of operation");
        System.out.println("1 for adittion");
        System.out.println("2 for deletion");

        int userInput = num.nextInt();

        switch (userInput) {
            case 1:
            int sum = n1 + n2;
                System.out.println("The sum total is: "+ sum);
                break;
            case 2:
                int sub= n1-n2;
                System.out.println("The deletion is: "+ sub);
                break;
            default:
                System.out.println("No operation found");
        }
    }
}