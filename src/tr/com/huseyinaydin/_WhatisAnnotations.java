package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/


public class _WhatisAnnotations {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
    
    @Deprecated
    static class A
    {
    	public void showTheDataWhichBelongsToThisClass()
    	{
    		System.out.println("in show A");
    	}
    }

    static class B extends A 
    {
    	@Override
//    	public void showTheDataWhichBelongToThisClass()
    	public void showTheDataWhichBelongsToThisClass()

    	{
    		System.out.println("in show B");
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

