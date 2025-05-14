
class MyThreadClass implements Runnable { //this class implements runnable interface

    
    @Override

    public void run() {

        for (int i = 0; i < 10; i++) { //it will execute as newly created thread

            System.out.println("Thread number: " + Thread.currentThread().getId() + ": Line: " + i);
        }
    }
}

public class threadwithRunnable {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThreadClass()); //create thread object with MyThreadClass object
        Thread thread2 = new Thread(new MyThreadClass());

        //starting the threads
        thread1.start();
        thread2.start();

        for (int i = 0; i < 10; i++) //it will execute as main thread
        {
            System.out.println("Main Thread: Line: " + i);
        }

    }

}
