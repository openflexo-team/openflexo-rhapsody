/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EV_Stopped
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/EV_Stopped.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EV_Stopped.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EV_Stopped() 
public class EV_Stopped extends RiJEvent implements AnimatedEvent {
    
    public static final int EV_Stopped_Default_id = 18619;		//## ignore 
    
    
    // Constructors
    
    public  EV_Stopped() {
        lId = EV_Stopped_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EV_Stopped_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EV_Stopped");
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
          String s="EV_Stopped(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EV_Stopped.java
*********************************************************************/

