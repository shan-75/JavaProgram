package Javacoding;

import java.util.Scanner;

public class Noofmonth {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Please enter the month");
        String monthly= num.nextLine();
        
        if (monthly.equals("jan")){
            System.out.println("It is 1st month");

        } else if (monthly.equals("Feb")){
            System.out.println("It is 2nd month");
        }else {
            System.out.println("Invalid month");
        }
    }
}
