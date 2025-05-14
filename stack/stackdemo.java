import java.util.*;

class stackdemo
{
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();// define the stak for integer type
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);

        System.out.println("the stacksize :"+mystack.size());
        System.out.println("the top element of the stack :"+mystack.peek());
        
        while(!mystack.isEmpty())
        {
            System.out.println("pop items :"+mystack.pop());

        }

    }
}