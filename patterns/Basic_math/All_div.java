import java.util.*;
import java.util.Scanner;
public class All_div{

    public static void all_div(int n){
    for (int i=1;i<=n;i++){
        if(n % i == 0){
            System.out.print(i+" ");
        }  
    }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        all_div(n);
    }
}