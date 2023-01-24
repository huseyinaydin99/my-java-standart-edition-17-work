package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/


public class _ThreadPriorityandSleep {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority());
    	
    	obj1.start();
    	try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    	obj2.start();
    }
    
    static class A extends Thread
    {
    	public void run()
    	{
    		for(int i=1;i<=100;i++)
    		{
    			System.out.println("Hi");
    			try {
    				Thread.sleep(10);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    }

    static class B extends Thread
    {
    	public void run()
    	{
    		for(int i=1;i<=100;i++)
    		{
    			System.out.println("Hello");
    			try {
    				Thread.sleep(10);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
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

