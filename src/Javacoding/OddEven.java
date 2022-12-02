package Javacoding;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Please enter the number");

        int num= number.nextInt();
        if (num>0){
            if (num%2==0){
                System.out.println("The number is Even");
            }else {
                System.out.println("The number is odd");

            }

        }else {
            System.out.println("Please enter positive number");
        }
    }
}
