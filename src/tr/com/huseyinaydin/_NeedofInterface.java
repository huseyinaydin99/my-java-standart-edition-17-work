/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;


public class _NeedofInterface {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
    
    /*

    abstract class Computer
    {
//    	public void code()
//    	{
//    		
//    	}
    	public abstract void code();
    }

    class Laptop extends Computer
    {
    	public void code()
    	{
    		System.out.println("code, compile, run");
    	}

    }

    class Desktop extends Computer
    {
    	public void code()
    	{
    		System.out.println("code, compile, faster");
    	}
    }
    class Developer
    {
//    	public void devApp(Laptop lap)
    	public void devApp(Computer lap)
    	{
    		lap.code();
    	}
    }

    public class Demo {
        public static void main(String[] args) {
//            Laptop lap=new Laptop();
//            Desktop desk=new Desktop();
            
            Computer lap=new Laptop();
            Computer desk=new Desktop();
            
            Developer huso=new Developer();
            huso.devApp(lap);
            
        }
    }
    
    */
    
    interface Computer
    {
    	 void code();
    }

    static class Laptop implements Computer
    {
    	public void code()
    	{
    		System.out.println("code, compile, run");
    	}

    }

    static class Desktop implements Computer
    {
    	public void code()
    	{
    		System.out.println("code, compile, faster");
    	}
    }
    static class Developer
    {
//    	public void devApp(Laptop lap)
    	public void devApp(Computer lap)
    	{
    		lap.code();
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

