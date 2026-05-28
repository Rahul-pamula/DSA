import java.util.*;
public class Is_prime_not{
    public static void is_prime_not(int n){
        if (n <= 1){
            System.out.println(n + " is not a prime number.");
            return;
        }
        else if(n > 1){
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    System.out.println(n + " is not a prime number.");
                    return;
                }
            }
            System.out.println(n + " is a prime number.");
        }
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        is_prime_not(num);  // function call
        sc.close();
    }
}