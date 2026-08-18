import java.util.*;

public class Pract_1{

    public static void main(String []args){

        Vector<String> V1 = new Vector<>();
        
        V1.add("Rahul");
        V1.add(0,"Shruthi");
        V1.add(0,"ramesh");
        
        System.out.println(V1);
        System.out.println(V1.size());
        System.out.println(V1.capacity());


        Vector<String> V2 = new Vector<>();
        V2.add("Ramesh__");
        V2.add("Shruthi__");


        System.out.println(V2);

    // for (int i = 0; i<V2.size();i++){
    //     V1.add(V2.get(i));
    // }

    V1.addAll(V2);
    System.out.println(V1);

    System.out.println(V1.capacity());
    System.out.println(V1.size());

    System.out.println(V1.get(0));
    System.out.println(V1.get(1));

    V1.remove("ramesh");
    System.out.println(V1);

    V1.removeAll(V2);
     System.out.println(V1);
    // V1.clear();

    // System.out.println(V1);

    V1.set(0,"Rohith");
    V1.add("Rahul");
    System.out.println(V1);

    System.out.println(V1.indexOf("Rahul"));
    System.out.println(V1.lastIndexOf("Rahul"));

    System.out.println(V1.firstElement());
    System.out.println(V1.lastElement());

    }
   

    
    
} 