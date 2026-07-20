import java.util.*;
import java.util.Arrays;

public class Basics{
    public static void main(String []args){
        int marks[]= new int[3];
         marks[0]=89;
         marks[1]=98;
         marks[2]=78;

        System.out.println(marks[0]);
        System.out.println(marks.length);


        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int[][] rahul = {{8,7,8},{7,8,9}};
         System.out.println(rahul[0][1]);
         }
}
