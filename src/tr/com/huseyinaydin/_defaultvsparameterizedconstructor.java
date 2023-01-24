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

public class _defaultvsparameterizedconstructor {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		Human obj1=new Human(18, "Hüseyin");
		System.out.println(obj.getName()+" : "+obj.getAge());
//		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
//		obj.SetAge(30);
//		obj.setName("Balbazar");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
	
	static class Human
	{
		private int age;
		private String name;
		
		public Human()
		{
			age=12;
			name="Adnan";
		}
		public Human(String name) {
			this.age=age;
			this.name=name;
		}
		public Human(int age, String name)
		{
			this.age=age;
			this.name=name;
		}
		
		
//		public Human()    //default constructor
//		{
//			age=12;
//			name="Ahmet";
//			//System.out.println("in constructor");
//		}
//		public Human(int a, String n)  //Parameterized constructor
//		{
//			age=a;
//			name=n;
//		}
		
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

