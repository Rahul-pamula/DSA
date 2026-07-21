import java.util.*;

public class Basic_math{
    public static void Digits(int n){

        while(n>0){
         int lastdigit = n%10;
         System.out.println(lastdigit);
        n=n/10;

        }
        

    }
    public static void Digit_count(int n){
        int count =0;
        while(n>0){
            int lastdigit=n%10;       //o(n)
            n=n/10;
            count++;

        }
        System.out.println(count);
    }

    public static void Digit_count_log(int n){
        int count =(int)Math.log10(n)+1;        // time complexity o(log10(n))
        System.out.println(count);
    }

    

    public static void main(String[] args){
        Digit_count_log(1263);
    }
}