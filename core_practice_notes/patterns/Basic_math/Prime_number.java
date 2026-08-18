import java.util.*;
import java.util.Scanner;

public class Prime_number{
    public static void prime_number(int n){
        int count =0 ;

        for(int i = 1 ;i<Math.sqrt(n)+1;i++)
{
    if(n%i==0){
        count++;
    }
}

if(count==1)
{
    System.out.println(n+" is a prime number");
}
else{
    System.out.println(n+" is not a prime number");
}

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_number(n);
    }
}