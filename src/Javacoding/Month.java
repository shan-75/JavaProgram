package Javacoding;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner month= new Scanner(System.in);
        System.out.println("Please enter number of month");
        int noOfmonth= month.nextInt();

        if (noOfmonth==1){
            System.out.println("Month is january");

        } else if (noOfmonth==2) {
            System.out.println("Month is February");

        } else if (noOfmonth==3) {
            System.out.println("Month is march");


        } else if (noOfmonth==4) {
            System.out.println("Month is April");

        } else if (noOfmonth==5) {
            System.out.println("Month is May");

        } else if (noOfmonth==6) {
            System.out.println("Month is June");

        } else if (noOfmonth==7) {
            System.out.println("Month is July");

        } else if (noOfmonth==8) {
            System.out.println("Month is August");

        } else if (noOfmonth==9) {
            System.out.println("Month is September");

        } else if (noOfmonth==10) {
            System.out.println("Month is October");

        } else if (noOfmonth==11) {
            System.out.println("Month is November");

        } else if (noOfmonth==12) {
            System.out.println("Month is December");

        }else {
            System.out.println("Invalid month");
        }
    }
}
