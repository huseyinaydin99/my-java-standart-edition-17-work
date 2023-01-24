package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
class Demo {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Hüseyin");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Aydın");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

