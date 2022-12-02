package Javacoding;

import java.util.Scanner;

public class Yesnocalculator {
    public static void main(String[] args) {
        boolean again = false;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        while (again) {
            System.out.println("Please enter the first number: ");
            int n1 = sc.nextInt();

            System.out.println("Please enter the second number:");
            int n2 = sc.nextInt();

            System.out.println("Please select the mode of operation");
            System.out.println("+ for adition");
            System.out.println("_ for deletion");
            String userInput = sc1.nextLine();

            switch (userInput) {

                case "+":
                    int sum = n1 + n2;
                    System.out.println("The sum total is: " + sum);
                    break;
                case "-":
                    int sub = n1 - n2;
                    System.out.println("The deletion is: " + sub);
                    break;

                default:
                    System.out.println("No operation found");

            }
            System.out.println("Do you want to perform operation again: [y/n]");
            String userInput2 = sc1.nextLine();
            if (userInput2.toLowerCase().equals("y")) {
                again = true;

            } else {
                again = false;
            }
        }
    }

}