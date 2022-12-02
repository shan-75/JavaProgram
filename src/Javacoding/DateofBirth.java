package Javacoding;

import java.util.Scanner;
import java.time.LocalDate;

public class DateofBirth {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter year of birth : ");
        int dateBirth= s.nextInt();

        LocalDate ld = LocalDate.now();
        int age= ld.getYear()-dateBirth;

        System.out.println("Your age is "+ age + " Years old");


//        int dateBirth=s.nextInt();
//        int age= LocalDate-dateBirth;

    }
}
