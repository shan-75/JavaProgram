package Javacoding;

public class Prize {
    public static void main(String[] args) {
//      Declare Variable
        double prize= 500;

        double tax= (prize*10)/100;
        double totalPrize= prize+tax;

//      Print
        System.out.println("The prize is "+prize);
        System.out.println("Total tax is "+tax);
        System.out.println("Total prize with tax "+totalPrize);

    }
}

//public class Prize {
//    public static void main(String[] args) {
//        String email= "sh@gmail.com";
//        String password= "password";
//        boolean login= email==password;
//
//
//        System.out.println("welcome you are logged in");
//        System.out.println("Sorry! Check your credentials");
//    }
//}