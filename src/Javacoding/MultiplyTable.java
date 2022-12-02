package Javacoding;

import java.util.Scanner;

public class MultiplyTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+ "*" + j + "=" +(i*j));
            }
            System.out.println("\n");
        }
    }
}

//import java.util.Scanner;
//
//public class Multiplytable {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Please enter multiplication of: ");
//        int num= sc.nextInt();
//        for (int i=1; i<=10; i++){
//            System.out.println(num+ "*" + i + "="+ num*i);
//        }
//
//    }
//}
