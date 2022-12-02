package Javacoding;

public class codepoint {
    public static void main(String[] args) {
        String name= "Nepal";
        char index= (char) name.codePointBefore(4);
        System.out.println(index);
    }
}