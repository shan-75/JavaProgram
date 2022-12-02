package Javacoding;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner vowel= new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String name= vowel.nextLine();


        if (name.contains("a") || name.contains("e")
                || name.contains("i") || name.contains("o")
                || name.contains("u") ){
            System.out.println("word is vowel");

        }else {
            System.out.println("word is consonant");
        }
    }
}