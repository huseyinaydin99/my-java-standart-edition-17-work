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

public class _Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Aydın");
//		obj.age=11;
//		obj.name="Hüseyin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
	
	static class Human
	{
		//int age;
		//private int age=11;
		private int age;
		//String name;
		//private String name="Navin";
		private String name;
		
		public int getAge()
		{
			return age;
		}
		public void SetAge(int a)
		{
			age=a;
		}
		
		
		public String getName()
		{
			return name;
		}
		public void setName(String n)
		{
			name=n;
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

