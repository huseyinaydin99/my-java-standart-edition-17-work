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

public class _DynamicMethodDispatch{
	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
//		obj=new D();
		
//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();
	
	}
	
	// class Computer
	// {
	//	
	// }
	// class Laptop extends Computer
	// {
	//	
	// }

	static class A
	{
		public void show()
		{
			System.out.println("in A show");
		}
	}

	static class B extends A
	{
		public void show()
		{
			System.out.println("in B show");
		}
	}

	static class C extends A
	{
		public void show()
		{
			System.out.println("in C show");
		}
	}

	static class D
	{
		
	}
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

