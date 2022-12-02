package Javacoding;

public class Sumofarray {
    public static void main(String[] args) {
        int[] num= {10,20,30,40,60,90};
        int sum= 0;
        int avg=0;

        for (int i=0; i<num.length; i++) {
           sum+=num[i];
           avg=sum/num.length;

        }
        System.out.println(sum);
        System.out.println(avg);



    }
}