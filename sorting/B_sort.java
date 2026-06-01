package sorting;
import java.util.*;

public class B_sort{

    public static void b_sort(int[] arr){
        int n= arr.length;
        for (int i = 0; i<n-1;i++){
            boolean flag = false;
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                
            }
            if(flag == false){
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        b_sort(arr);
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    } 
}