package Javacoding;

import java.util.Scanner;

public class Ptr {
    public static void main(String[] args) {
        Scanner si= new Scanner(System.in);
        System.out.println("Please enter principal amount: ");
        double principal= si.nextDouble();

        System.out.println("Please enter your rate:");
        double rate= si.nextDouble();

        System.out.println("Please enter your time:");
        double time= si.nextDouble();

        double simpleInterest= principal*rate*time;

        System.out.println("Simple Interest:"+ simpleInterest);
    }
}