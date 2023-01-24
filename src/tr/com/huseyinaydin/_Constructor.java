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

public class _Constructor {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
		
		obj.SetAge(30);
		obj.setName("Hüseyin");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
	
	static class Human
	{
		private int age;
		private String name;
		
		public Human()
		{
			age=12;
			name="John";
			//System.out.println("in constructor");
		}
		public int getAge(){
			return age;
		}
		public void SetAge(int age)
		{
			this.age=age;
		}
		
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
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

