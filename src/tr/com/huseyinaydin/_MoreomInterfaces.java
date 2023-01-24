/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


public class _MoreomInterfaces {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
    	X obj1=new B();
    	obj1.run();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
    
    interface A
    {
//    	public abstract void show();
//    	public abstract void config();
    	int age=44;            // final and static 
    	String area="Türkiye";
    	
    	void show();
    	void config();
    }

    interface X
    {
    	void run();
    }
    interface Y extends X
    {
    	
    }
    
    static class B implements A,Y
    {
    	public void show()
    	{
    		System.out.println("in show");
    	}
    	public void config()
    	{
    		System.out.println("in cofing");
    	}
    	public void run()
    	{
    		System.out.println("running...");
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

