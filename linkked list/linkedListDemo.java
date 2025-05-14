import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListDemo {


  public static void main(String[] args) 
  {

     //create a linked list for integer type data

      LinkedList<Integer> intList = new LinkedList<>();

      //insert integer data into the list

      intList.add(10);
      intList.add(20);
      intList.add(30);
      intList.add(40);
      intList.add(50);

     System.out.println("The linked list size: "+intList.size()+"\ncontent:" + intList +"\n");

      int[] array ={5, 15, 30, 80, 60, 25}; // an array of integers

       //create another array list with all of the items in the list

       ArrayList<Integer> arrList = new ArrayList<>();

       for(int item: array)
       {
          arrList.add(item);
       }

        System.out.println("The linked list size: "+arrList.size()+"\ncontent:" + arrList +"\n");

         //add arrayList directly to the linked list, at the index, 2

         intList.addAll(2, arrList);
         System.out.println("The linked list size: "+intList.size()+"\ncontent:" + intList+"\n");

    }
}