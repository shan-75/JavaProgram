import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Dateandtime {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        System.out.println(ld);

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your full date of birth: ");
        int dob= sc.nextInt();

        int age = ld.getYear()-dob;
        System.out.println("You are "+ age + " Years old");


    }
}
