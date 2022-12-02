package Javacoding;

import java.util.Scanner;
public class Exwork {
    public static void main(String[] args) {
        birthYear();

    }

    public static void birthYear() {
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter birthyear:");
            int birthyear= sc.nextInt();
            int age= 2022- birthyear;
            System.out.println(age);
        }catch (Exception Error){
            System.out.println("Please enter integar");
        }

    }
}
