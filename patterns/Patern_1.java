import java.util.*;
import java.util.Scanner;
public class Patern_1 {
    
    public static void pyr1(int n){
        for(int i = 0;i<n;i++){
            for (int j = 0;j<n-i+1;j++){
                System.out.print(" ");
            }
             for (int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println();
    }

    public static void pyr2(int n){
        for(int i = n;i>0;i--){
            for (int j = 0;j<n-i+1;j++){
                System.out.print(" ");
            }
             for (int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println();
    }

     public static void pyr3(int n){

          for(int i = 0;i<n;i++){
            for (int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
             for (int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
          } 
          for(int i = n;i>0;i--){
            for (int j = 0;j<n-i+1;j++){
                System.out.print(" ");
            }
             for (int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

     }

    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        pyr2(n);
        
    }
}