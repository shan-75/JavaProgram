package Javacoding;

import java.util.Scanner;

public class Arraycontains {
    public static void main(String[] args) {
        boolean found= false;

        Scanner sc= new Scanner(System.in);

        String[] names= {"ram","shyam","hari","gita","sita"};

        System.out.println("Please enter the name: ");
        String userInput= sc.nextLine();

        for (int i=0; i<names.length; i++){
            if (names[i].equals(userInput)){
                found=true;
                break;
            }else{
                found=false;
            }
        }
        if (found==true){
            System.out.println("name found");

        }else {
            System.out.println("name not found");
        }


    }


}


