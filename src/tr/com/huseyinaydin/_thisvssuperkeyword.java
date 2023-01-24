package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/



public class _thisvssuperkeyword
{
	public static void main(String a[]) 
	{
		B obj=new B();
//		System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
	
	static class A extends Object
	{
		int num= 1;
	}

	static class B extends A
	{
		int num=2;
		public int getValue()
		{
			int num=3;
//			return this.num;
			return super.num;
		}
	}
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

