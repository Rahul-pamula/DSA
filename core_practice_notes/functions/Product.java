import java.util.*;
public class Product{
    public static void product(int a, int b){
        int product= a*b;
        System.out.println("The product of the two numbers is: " + product);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        product(num1, num2);  // function call
        sc.close();
    }
}