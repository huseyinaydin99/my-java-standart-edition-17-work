/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

public class _RaceCondition {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    	
    	t1.join();
    	t2.join();
    	
    	System.out.println(c.count);
    }
    
    static class Counter
    {
    	int count;
//    	public void increment()
    	public synchronized void increment()
    	{
    		count++;
    	}
    }
}

    


/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

