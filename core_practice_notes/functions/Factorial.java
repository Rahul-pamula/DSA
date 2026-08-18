import java.util.*;
public class Factorial{
    public static int factorial(int n){
        int fact =1;
        for(int i=n;i>0;i--){
            fact = fact*i;

        }
        System.out.println("The factorial of the number is: " + fact);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        factorial(num);  // function call
        sc.close();
    }
}