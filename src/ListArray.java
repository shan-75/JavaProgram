import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Hari gurung");
        names.add("Sital shahi");
//        names.remove("Sital shahi");


        for (String name:names){
            System.out.println(name);
            System.out.println("--------");
            System.out.println(names.get(1));
        }
    }
}
