/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Activate_EV
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Activate_EV.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Activate_EV.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event Activate_EV() 
public class Activate_EV extends RiJEvent implements AnimatedEvent {
    
    public static final int Activate_EV_Default_id = 18616;		//## ignore 
    
    
    // Constructors
    
    public  Activate_EV() {
        lId = Activate_EV_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (Activate_EV_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.Activate_EV");
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
          String s="Activate_EV(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Activate_EV.java
*********************************************************************/

