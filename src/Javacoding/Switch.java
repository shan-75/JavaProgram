package Javacoding;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number: ");
        int noOfmonth=sc.nextInt();

        switch (noOfmonth){
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
