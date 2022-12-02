import java.util.Collections;
import java.util.HashMap;
public class Hashmapwork {
    public static void main(String[] args) {
        HashMap<String, Double> daysExpenses= new HashMap<String, Double>();
        daysExpenses.put("Sunday", 150.0);
        daysExpenses.put("Monday", 120.60);
        daysExpenses.put("Tuesday", 50.560);
        daysExpenses.put("Wednesday", 250.20);


        for (String day : daysExpenses.keySet()) {

            System.out.println(  day + " value is: " + daysExpenses.get(day));

        }

    }
}
