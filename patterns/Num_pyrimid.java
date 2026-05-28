import java.util.*;
public class Num_pyrimid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // outer loop 1 to n rows 
        
        for (int i =1;i<=n;i++){

            //  inner loop for spaces n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // inner loop for column num 1 to i
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}