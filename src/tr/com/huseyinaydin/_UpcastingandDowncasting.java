package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/


public class _UpcastingandDowncasting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	A obj=new B();
    	obj.show1();
    	
    	B obj1=(B)obj;
    	obj1.show2();
    }
    
    static class A
    {
    	public void show1()
    	{
    		System.out.println("in A show");
    	}
    }
    static class B extends A
    {
    	public void show2()
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

