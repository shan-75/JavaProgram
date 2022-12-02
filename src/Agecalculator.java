import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
//        System.out.println(ld);

        Scanner dob= new Scanner(System.in);

        System.out.println("Please enter day of birth: ");
        int day= dob.nextInt();

        System.out.println("Please enter month of birth: ");
        int month= dob.nextInt();

        System.out.println("Please enter year of birth: ");
        int year= dob.nextInt();

        int cDay= LocalDate.now().getDayOfMonth();
        int cMonth= LocalDate.now().getMonthValue();
        int cYear= LocalDate.now().getYear();

        if (cDay>=day && cMonth>=month && cYear>=year){
            day=cDay-day;
            month=cMonth-month;
            year=cYear-year;

            System.out.println("You are "+ year + " years " + month +  " month "
                    + day + " day old");
        }
        else {
            day=(cDay+30)-day;
            cMonth--;
            cMonth+=day/30;
            day=cDay%30;

            month=(cMonth+12)-month;
            cYear--;
            cYear+=day/12;
            month=month%12;

            year=cYear-year;


            System.out.println("You are "+ year + " years " + month +  " month "
                    + day + " day old");
        }
    }
}
