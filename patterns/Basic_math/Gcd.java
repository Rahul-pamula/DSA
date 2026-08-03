import java.util.*;
import java.util.Scanner;

public class Gcd{
    public static void gcd(int n1, int n2){
        int ans = 1;
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                ans =i;
                
               
            }
        }
        System.out.println(ans);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1,n2);
    }
}   