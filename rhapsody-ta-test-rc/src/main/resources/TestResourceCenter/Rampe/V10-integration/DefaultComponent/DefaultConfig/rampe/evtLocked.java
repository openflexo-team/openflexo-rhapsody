/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evtLocked
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/evtLocked.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/evtLocked.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## event evtLocked() 
public class evtLocked extends RiJEvent implements AnimatedEvent {
    
    public static final int evtLocked_rampe_id = 14219;		//## ignore 
    
    
    // Constructors
    
    public  evtLocked() {
        lId = evtLocked_rampe_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evtLocked_rampe_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("rampe.evtLocked");
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
          String s="evtLocked(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/evtLocked.java
*********************************************************************/

