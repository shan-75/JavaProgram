package Javacoding;

public class StringWork {
    public static void main(String[] args) {
        String country= "TSA";
        String country1= "USA";
        System.out.println(country.equals(country1));
        System.out.println(country1.charAt(1));

        String fname= "Shankar";
        String lname= "Thapa";
        System.out.println("FullName is "+ fname.concat( lname));
    }
}
