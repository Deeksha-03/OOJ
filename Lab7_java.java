import java.util.*;

class ThreadBMSE extends Thread
{
	String s = new String();
 	Thread t;
 	ThreadBMSE(String name)
	{
 		s = name;
 		t =  new Thread(this,s);
	}
	public void run()
	{
  		try
		{
 			for(int i=0;i<5;i++)
			{
   				System.out.println(s);
   				t.sleep(10000);
   			}
  		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted!");
  		}
 	}
 
}

class ThreadCSE extends Thread
{
 	String s = new String();
 	Thread t;
 	ThreadCSE(String name)
	{
  		s = name;
 		t =  new Thread(this, s);
 	}
	public void run()
	{
  		try
		{
 			for(int i=0;i<5;i++)
			{
   				System.out.println(s);
   				t.sleep(2000);
   			}
  		}
 		catch(InterruptedException ie)
		{
			System.out.println("Interrupted!");
  		}
	}
 
}

class Lab7_java
{
 	public static void main(String args[])
	{
		ThreadBMSE ob1 = new ThreadBMSE("BMS College of Engineering");
 		ThreadCSE ob2 = new ThreadCSE("CSE");
 		ob1.t.start();
 		ob2.t.start();
 	}
}
