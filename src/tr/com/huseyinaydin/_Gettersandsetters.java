/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Hüseyin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}
	
//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
//	{
//		age=a;
//	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}
}

public class _Gettersandsetters {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		obj.xyz(30);
		obj.SetAge(30);
		obj.setName("Aydın");
//		obj.age=11;
//		obj.name="Hüseyin";
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

