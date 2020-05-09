import java.util.*;

class X
{
      private int materials;
      private boolean available = false;
      public synchronized int get()
      {
            while (available == false)
            {
                  try
                  {
                        wait(); //Consumer Thread waits while stack is empty
                  }
                  catch (InterruptedException ie)
                  {
                  }
            }
            available = false;
            notify();
            return materials;
      }
      public synchronized void put(int value)
      {
            while (available == true)
            {
                  try
                  {
                        wait(); //Producer Thread waits while stack is full
                  }
                  catch (Exception e)
                  {
                        e.printStackTrace();
                  }
            }
            materials = value;
            available = true;
            notify();
      }
}
//Function called by Consumer Thread
class Consumer extends Thread
{
      private X Shop;
      public Consumer(X a, int number)
      {
            Shop = a;
      }
      public void run()
      {
            int value = 0;
            for (int i = 0; i < 10; i++)
            {
                  value = Shop.get();
                  System.out.println("Consumer Value : " + value);
            }
      }
}
//Function called by Producer Thread
class Producer extends Thread
{
      private X Shop;
      public Producer(X a, int number)
      {
            Shop = a;
      }
      public void run()
      {
            for (int j = 0; j < 10; j++)
            {
            	Random rand=new Random();
            	int i=rand.nextInt(100);
                  Shop.put(i);
                  System.out.println("Producer Value : "+ i);
                  try
                  {
                        sleep((int)(Math.random() * 100));
                  }
                  catch (Exception e)
                  {
                        e.printStackTrace();
                  }
            }
      }
}
public class MultiThreading
{
      public static void main(String[] args)
      {
            X a = new X();   //Object of the class that has both Producer and Consumer methods
            Producer p1 = new Producer(a, 1); //Creating a Producer Thread
            Consumer c1 = new Consumer(a, 1); //Creating a Consumer Thread
            //Starting both the Producer and Consumer Threads
            p1.start();
            c1.start();
      }
}