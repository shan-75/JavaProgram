package Javacoding;
//public class TipCalculator {
//    public static void main(String[] args) {
//        float bill= 1500;
//
//        float tip= (bill*1.75f)/100;
//
//        float totalBill= bill+tip;
//
//
//
//        System.out.println(totalBill);
//    }
//}

//import java.util.Scanner;
//public class Practice {
//    public static void main(String[] args) {
//        Scanner billAmount = new Scanner(System.in);
//        System.out.println("Enter Bill amount ");
//        float bill = billAmount.nextFloat();
//
//
//        Scanner tip = new Scanner(System.in);
//        System.out.println("Enter the tip");
//        float tip1 = tip.nextFloat();
//
//
//        float total = bill+tip1;
//
//        System.out.println("Total bill amount=" + total);
//
//
//    }
//}

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args){
        Scanner billAmount= new Scanner(System.in);
        System.out.println("Please enter the Bill amount");
        float bill= billAmount.nextFloat();
//        tip= x%of billAmount

        Scanner tip1= new Scanner(System.in);
        System.out.println("Please enter tip %");
        float tip2= tip1.nextFloat();
        if ( tip2==10.0/100.0){
            System.out.println("tip is "+tip2*bill);


        }else if (tip2==20.0/100.0){
            System.out.println("tip is "+tip2*bill);
        }else if (tip2==30.0/100.0){
            System.out.println("tip is "+tip2*bill);
        }


        float totalBill=bill+tip2;
        System.out.println("Your total bill is "+totalBill);










    }
}
