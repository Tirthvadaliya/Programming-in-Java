import java.util.*;

class queuedemo
{
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();// queue object for the type link list
        // push item into the stack 
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);

        System.out.println("the Queuesize :"+myQueue.size());
        System.out.println("the first element of the Queue :"+myQueue.peek());
        
        while(!myQueue.isEmpty())
        {
            System.out.println("remove items :"+myQueue.remove());

        }

    }
}