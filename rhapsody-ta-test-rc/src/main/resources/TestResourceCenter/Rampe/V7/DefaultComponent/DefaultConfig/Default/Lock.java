/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Lock
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Lock.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Lock.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event Lock() 
public class Lock extends RiJEvent implements AnimatedEvent {
    
    public static final int Lock_Default_id = 18624;		//## ignore 
    
    
    // Constructors
    
    public  Lock() {
        lId = Lock_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (Lock_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.Lock");
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
          String s="Lock(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Lock.java
*********************************************************************/

