package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

/*
Wrapper Classes

int -> Integer
char -> Character
double -> Double
*/


public class _Wrapperclass {
    public static void main(String[] args){   
    	
    	int num=7;
//   	Integer num1=new Integer(8);
//    	Integer num1=8;
    	
//    	Integer num1=new Integer(num);     //boxing
    	Integer num1=num;                  // autoboxing
    	
    	int num2=num1.intValue();          // unboxing
    	
//    	System.out.println(num1);
    	System.out.println(num2);
    	
    	String str="12";
    	int num3=Integer.parseInt(str);
    	
    	System.out.println( num3+2);
    }
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

