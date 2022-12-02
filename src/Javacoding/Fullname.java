package Javacoding;//import java.util.Scanner;
//
//public class Fullname {
//    public static void main(String[] args) {
//        Scanner fname= new Scanner(System.in);
//        System.out.println("Please enter firstname ");
//        String firstName= fname.nextLine();
//
//        System.out.println("Please enter last name");
//        String lastName=fname.nextLine();
//
//
//
//        System.out.println("Your fullname is "+firstName+ lastName);
//
//
//    }
//}


import java.util.Scanner;

public class Fullname {
    public static void main(String[] args) {
        Scanner fname= new Scanner(System.in);
        System.out.println("Please enter your first nane: ");
        String firstName= fname.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName= fname.nextLine();



        System.out.println("Full name is: "+ firstName. concat(lastName));

    }
}