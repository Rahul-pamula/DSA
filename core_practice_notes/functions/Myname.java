import java.util.*;
public class Myname{

    public static void myName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        myName(name);  // function call
        sc.close();

    }
}