class ThreadClass extends Thread {

    @Override

    public void run() {

        for (int i = 0; i < 10; i++) 
        { //it will execute as newly created thread

            System.out.println("Thread class number: Line: " + i);

            try {

                Thread.sleep(100); //Halt executing thread for 100 miliseconds

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}

public class threadClassExtend {

public static void main(String[] args) {

        ThreadClass tc1 = new ThreadClass();

        tc1.start(); //the new thread will be started

        for (int i = 0; i < 10; i++) //it will execute as main thread
        {
            System.out.println("Main Thread: Line:"+i);
        }


    

}

}
