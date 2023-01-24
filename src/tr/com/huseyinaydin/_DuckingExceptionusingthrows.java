/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java SE 17 !
 * 
 */

public class _DuckingExceptionusingthrows {
	
	static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {
    	
//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
    	
    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static class HuseyinException extends Exception
    {
    	public HuseyinException(String string)
    	{
    		super(string);
    	}
    }
    
    static class A
    {
    	public void show() throws ClassNotFoundException
    	{
//        	try
//        	{
//        		Class.forName("Calc");
//        	}
//        	catch(ClassNotFoundException e)
//        	{
//        		System.out.println("Not able to find theh class");
//        	}
    		
    		Class.forName("Calc");
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

