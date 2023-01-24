package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/


public class _staticmethod {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		//obj1.name="Phone";
		Mobile.name="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		Mobile.show1(obj1);
		
		//System.out.println(obj1.brand);

	
	}
	
	static class Mobile{
		String brand;
		int price;
		String network;
//		String name;
		static String name;
		
		public void show() {
			System.out.println(brand+" : "+price+" : "+name);
		}
		
		public static void show1(Mobile obj)
		{
//			System.out.println("in static method");
			System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
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

