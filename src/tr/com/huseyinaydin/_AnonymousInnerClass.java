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

public class  _AnonymousInnerClass{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("yeni show metodu");
    		}
    	};
    	obj.show();
    }
    
    static class A
    {
    	public void show() 
    	{
    		System.out.println("eski show metodu");
    	}
    }
    //static class B extends A
    //{
//    	public void show()
//    	{
//    		System.out.println("B sınıfı show");
//    	}
    //}
}

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

