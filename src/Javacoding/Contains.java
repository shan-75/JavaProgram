package Javacoding;//The Java String class contains() method searches the sequence of characters in this string.
//It returns true if the sequence of char values is found in this string otherwise returns false.


//The Java String class equals() method compares the two given strings based on the content of the string.
//If any character is not matched, it returns false. If all characters are matched, it returns true.

//The String equals() method overrides the equals() method of the Object class.


public class Contains{
    public static void main(String[] args) {
       String name= "what do you do";
       String name1= "I work";

        System.out.println(name.contains(name1));
    }
}
