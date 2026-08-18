import java.util.*;

public class Outer_pyrimid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for the outer pyrimid with solid base
        // for(int i=1;i<=n;i++){
        //     for(int s=1;s<=n-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         if(i==1||i==n||j==1||j==2*i-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();


       
        // for the outer pyrimid with base is spaced

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // pattern
            for(int j = 1; j <= 2*i - 1; j++) {

                if(i == n) {
                    // base row: alternate stars
                    if(j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                else if(i == 1 || j == 1 || j == 2*i - 1) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }sc.close();
    }
}
    