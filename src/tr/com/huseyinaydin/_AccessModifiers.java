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

public class _AccessModifiers {
	public static void main(String[] args) {

		A obj = new A();
		System.out.println(obj.marks);
		obj.show();

		B obj1 = new B();
		System.out.println(obj.marks);

	}

	public static class A {
		int marks = 6;

//		protected marks=6;
		public void show() {

		}
	}

	public static class B {
//		private int marks;
		int marks;

	}

	static class C extends A {
		public void abc() {
			System.out.println(marks);
		}
	}

}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

