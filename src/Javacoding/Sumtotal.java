package Javacoding;

public class Sumtotal {
    public static void main(String[] args) {
        add(1,5);
        add(10,20);

    }
    public static void add(int start, int end){
        int sum=0;
        for (int i=start; i<=end; i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}