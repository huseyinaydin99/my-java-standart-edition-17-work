/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

public class _MultipleThreads {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
    static class A extends Thread
    {
    	public void run()
    	{
    		for(int i=1;i<=100;i++)
    		{
    			System.out.println("Hi");
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

