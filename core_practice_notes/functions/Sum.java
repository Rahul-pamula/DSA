import java.util.*;

public class Sum{

    public static void sum(int a , int b){
        int sum = a+b;
        System.out.println("The sum of the two numbers is: " + sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        sum(num1, num2);  // function call
        sc.close();
    }
}