package Javacoding;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        System.out.println("Please enter your email: ");
        String email = login.nextLine();

        System.out.println("Please enter your password: ");
        String password = login.nextLine();


        if (email.equals("shan@gmail.com") && password.equals("password1")){
            System.out.print("You are logged in as :"+email);

        }else {
            System.out.print("Please check your credentials: ");
        }

    }
}