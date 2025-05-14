import java.util.Hashtable;
public class hashtable {
 public static void main(String[] args) {

        Hashtable<String, Integer> sthash = new Hashtable<>();

        //put names and marks in the hash table
        sthash.put("Ayan", 65);
        sthash.put("Dipak", 80);
        sthash.put("Joy", 55);
        sthash.put("Tarun", 75);
        sthash.put("Rahul", 70);

        System.out.println("The student hash table: \n" + sthash + "\n\n");

        String maxkey = "";
        int maxMark = 0;

        for (String key : sthash.keySet())
         { //for all keys in the keyset
            if (maxMark < sthash.get(key)) 
            {
                maxkey = key;
                maxMark =sthash.get(key);

            }

        }
        System.out.println("The Student "+ maxkey +" got highest marks, marks: "+maxMark);

    }

}
