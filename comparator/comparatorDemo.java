
import java.util.ArrayList;
import java.util.Comparator;

class stringCompare implements Comparator<String> { //class to compare two strings for sorting Lists

    @Override

    public int compare(String str1, String str2) {

        return str1.compareTo(str2); //use compareTo method to compare second string with first

    }

}

public class comparatorDemo {

    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<>(); //create an array list for string type object

       //Add items in the array list
        cityList.add("Delhi");
        cityList.add("Kolkata");
        cityList.add("Hyderabad");
        cityList.add("Chennai");
        cityList.add("Lucknow");

        System.out.println("Cities Unsorted: " + cityList);

        //sort the array list in alphabetical order
        cityList.sort(new stringCompare()); //new stringComparator object to compare
        System.out.println("Cities Sorted: "+ cityList);

    }

}
