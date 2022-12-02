import java.util.LinkedList;
import java.util.Collections;
public class ListLinked {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("hari");
        names.add("shyam");
        names.add("gita");
        names.add("sita");
        Collections.sort(names);

        System.out.println(names);
    }
}
