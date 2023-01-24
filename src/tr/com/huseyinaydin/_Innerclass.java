/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;


public class _Innerclass{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	A.B obj1=new A.B();
    	obj1.config();

    }
    
    static class A
    {
    	int age;
    	
    	public void show()
    	{
    		System.out.println("in show");
    	}
    	
//    	class B
//    	{
//    		public void config()
//    		{
//    			System.out.println("in config");
//    		}
//    	}
    	
    	static class B
    	{
    		public void config()
    		{
    			System.out.println("in config");
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

