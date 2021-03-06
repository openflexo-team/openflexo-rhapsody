/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Unlock
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Unlock.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Unlock.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event Unlock() 
public class Unlock extends RiJEvent implements AnimatedEvent {
    
    public static final int Unlock_Default_id = 18623;		//## ignore 
    
    
    // Constructors
    
    public  Unlock() {
        lId = Unlock_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (Unlock_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.Unlock");
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
          String s="Unlock(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Unlock.java
*********************************************************************/

