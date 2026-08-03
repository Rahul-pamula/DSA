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
    public static void all_div_m2(int x,ArrayList<Integer> arrlist){
        for(int i = 1; i<= Math.sqrt(x);i++){
            if (x%i==0){
                
               
             arrlist.add(i);      
               
               if(x/i != i){
                arrlist.add(x/i);     
               }  
                
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        all_div_m2(x, arrlist);
        Collections.sort(arrlist);  
        for (int i =0 ;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+" ");
        }
        System.out.println();


    }
}