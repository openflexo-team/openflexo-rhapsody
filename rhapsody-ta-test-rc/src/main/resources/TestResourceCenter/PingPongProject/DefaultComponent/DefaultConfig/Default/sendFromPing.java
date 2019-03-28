/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: guerinsy
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendFromPing
//!	Generated Date	: Mon, 25, Mar 2019 
	File Path	: DefaultComponent/DefaultConfig/Default/sendFromPing.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/sendFromPing.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event sendFromPing() 
public class sendFromPing extends RiJEvent implements AnimatedEvent {
    
    public static final int sendFromPing_Default_id = 18617;		//## ignore 
    
    
    // Constructors
    
    public  sendFromPing() {
        lId = sendFromPing_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (sendFromPing_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.sendFromPing");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="sendFromPing(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/sendFromPing.java
*********************************************************************/

