package Javacoding;

public class Bankaccount {
    public static void main(String[] args) {
        Bank ram= new Bank();
        ram.deposit(600);
        ram.deposit(1000);
        ram.withdraw(1000);
        ram.withdraw(200);
        System.out.println("Your total balance is "+ ram.getBalance());

    }
}

class Bank{
    private double balance=0;

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        balance= balance+amount;

    }
    void withdraw(double amount){
        if (amount<=balance){
            balance= balance-amount;

        }else{
            System.out.println("Sorry insuffient balance");
        }


    }
}