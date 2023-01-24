package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/


public class _WhatisInterface {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
    
    interface A
    {
//    	public abstract void show();
//    	public abstract void config();
    	int age=44;            // final and static 
    	String area="Mumbai";
    	
    	void show();
    	void config();
    }

    static class B implements A
    {
    	public void show()
    	{
    		System.out.println("in show");
    	}
    	public void config()
    	{
    		System.out.println("in cofing");
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

