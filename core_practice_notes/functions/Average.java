import java.util.*;

public class Average{
    public static void average(int a,int b, int c){
        int average = a+b+c/3;
        System.out.println("average of "+a+", "+b+" and "+c+" is "+average) ;
           }

          public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          average(a,b,c);
          sc.close();
          }
}