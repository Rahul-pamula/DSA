import java.util.*;
public class Hallow_pyrimid_nums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i= 1; i<=n;i++){

            for(int j =1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if (j==1||j==i||i==n||i==1){
                    System.out.print(j+"  ");
              }
              else {
                System.out.print("   ");
              }
            }
            System.out.println();
        }
    }
}