package Javacoding;

public class Array {
    public static void main(String[] args) {
        String[] city= {"Texas","Colorado","Boston","California","Tucson"};
        int[] weather= {97,68,65,70,91};

       for (int i=1; i<city.length; i++){
           System.out.println(city[i]+ " weather is "+ weather[0]+ " Degree Fareheit");
       }
    }
}