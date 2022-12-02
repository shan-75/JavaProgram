import java.util.HashMap;

public class Maphash {
    public static void main(String[] args) {
        HashMap<String, Double> details =new HashMap<>();
        details.put("Harish", 1400.0);
        details.put("ram", 1200.0);
        details.put("gita", 1000.0);

//        System.out.println(details.keySet());
//        System.out.println(details.values());
        for (String name: details.keySet()){
            System.out.println(name + " salary is "+ details.get(name));

        }

//        System.out.println(details);
    }
}
