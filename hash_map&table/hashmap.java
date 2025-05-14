import java.util.HashMap;
public class hashmap 
{

   public static void main(String[] args) {

   HashMap<Integer, String> employeeHash= new HashMap<Integer, String>();

   //add items in the hashmap

    employeeHash.put(12, "Programmer");
    employeeHash.put(14, "Instructor");
    employeeHash.put(18, "Tester");
    employeeHash.put(13, "Programmer");
    employeeHash.put(21, "Casual");

    System.out.println("The employee hash map: \n" + employeeHash + "\n\n");

    if(employeeHash.containsKey (1)) 
    {
         //checking the key is present or not in the hashmap
         System.out.println("The type of employee: " + employeeHash.get(18));
    }
     else
     {
       System.out.println("The key is not found");
     }
      
    }

}