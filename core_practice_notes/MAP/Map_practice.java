import java.util.*;

public class Map_practice{
    public static void main(String []args){
        // creation of map
        Map<Integer , String> number_name = new HashMap<>();
        // Map<Integer , String> number_name = new LinkedHashMap<>();

        // Map<Integer , String> number_name = new TreeMap<>();

        // Map<Integer , String> number_name = new HashSet<>();

        // Map<Integer , String> number_name = new Hashtable<>();


        // addition of elements
        number_name.put(101,"rahul");
        number_name.put(102,"rohith");

        // retreval of elements only keys
        Set<Integer> keys = number_name.keySet();
        for(Integer key : keys )    {
            System.out.println(key);
        }
        // retreval of only values
        Collection<String> values = number_name.values();
        for(String value : values){
            System.out.println(value);
        }

        //by the key we can get the value
        System.out.println(number_name.get(101));

        // key values both need to print

        for(Integer key : keys){
            System.out.println(key+" : "+ number_name.get(key));
        }

        //entire map print

        System.out.println(number_name);

        // deletion

        number_name.remove(101);
         System.out.println(number_name);

        //contains method
        System.out.println(number_name.containsKey(101));
        System.out.println(number_name.containsKey(102));
        System.out.println(number_name.containsValue("rohith"));

        //size method
        
        System.out.println(number_name.size());
        

        // updation 

        number_name.put(101 , "shruthi");
        System.out.println(number_name);

        number_name.put(102,"rahul");
        System.out.println(number_name);



        // is empty method
        System.out.println(number_name.isEmpty());

       //entryset

       Set<Map.Entry<Integer,String>> entryset = number_name.entrySet();
       for(Map.Entry<Integer,String> entry : entryset){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
       


        
    }
}