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

public class _enumifandswitch {
    public static void main(String[] args) {

    	Status s=Status.Pending;
    	
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	if(s==Status.Running)
    		System.out.println("All Good");
    	else if(s==Status.Failed)
    		System.out.println("Try Again");
    	else if ( s==Status.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
    
    enum Status{
    	Running, Failed, Pending, Success;
    }
}

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

