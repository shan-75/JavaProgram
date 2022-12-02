package Javacoding;

import java.io.File;
public class Createfile {
    public static void main(String[] args) {
        try {
            File f= new File("Shankar.csv");
            if (f.createNewFile()){
                System.out.println("File succesfully created: ");
            }else {
                System.out.println("File not created");
            }


        }catch (Exception Ex){
            System.out.println();
        }
    }
}
