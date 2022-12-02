package Javacoding;

import java.util.Scanner;

public class FindQuotient {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Please enter the first number :");

        int num1= num.nextInt();

        System.out.println("Please enter the second number :");
        int num2= num.nextInt();

        int result= num1/num2;

        int reminder= num1%num2;



        System.out.println("The quotient is :" + result);
        System.out.println("The reminder is "+ reminder);
    }
}
