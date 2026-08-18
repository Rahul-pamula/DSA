import java.util.*;
public class Sum_of_all_odd_numbers{
    public static void sum(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(i%2 !=0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to "+(n-1)+" is "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }}