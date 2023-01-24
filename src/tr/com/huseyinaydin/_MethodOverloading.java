/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

public class _MethodOverloading {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int r1=obj.add(3,4);
		System.out.println(r1);
	}
	
	static class Calculator
	{
		public int add(int n1, int n2, int n3)
		{
			return n1+n2+n3;
		}
		public int add(int n1, int n2)
		{
			return n1+n2;
		}
		public double add(double n1, int n2)
		{
			return n1+n2;
		}
	}
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

