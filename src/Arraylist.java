import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> friends= new ArrayList();
        friends.add("Hari");
        friends.add("Shyam");
        friends.add("Sita");
        friends.add("Gita");
        friends.add("Rita");

        for (String friend:friends){
            System.out.println(friend);
        }
    }

}

