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

public class _Abstractandanonymousinnerclass {
	public static void main(String[] args) {
		// A obj=new B();
		A obj = new A() {

			@Override
			public void show() {
				System.out.println("Selam show() ");
			}

			@Override
			public void config() {
				System.out.println("Selam config() ");
			}
		};
		obj.show();
	}

	public static abstract class A {
		public abstract void show();

		public abstract void config();
	}
	// static class B extends A
	// {
//  	public void show()
//  	{
//  		System.out.println("in B show");
//  	}
	// }
}
/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

