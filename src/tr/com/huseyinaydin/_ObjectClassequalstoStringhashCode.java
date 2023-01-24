/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;
	
public class _ObjectClassequalstoStringhashCode{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Lenevo Y510p";
    	obj.price=1000;
    	
    	Laptop obj2=new Laptop();
    	obj2.model="Lenevo Y510p";
 //   	obj2.model="Lenevo Y510p";
    	obj2.price=1000;
    	
    	boolean result = obj.equals(obj2);
    	
    	System.out.println(obj.toString());
//   	System.out.println(obj);
    	
    }
    
    static class Laptop
    {
    	String model;
    	int price;
//    	String serial;
    	
    	public String toString()
    	{
//    		return "Hey";
    		return model+ " : "+price;
    	}
    	public boolean equals(Laptop that)
    	{
//    		if(this.model.equals(that.model) && this.price==that.price) 
//    			return true;
//    		else
//    			return false;
    		
    		return this.model.equals(that.model) && this.price==that.price ;
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

