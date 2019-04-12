/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evtPush
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/evtPush.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/evtPush.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## event evtPush() 
public class evtPush extends RiJEvent implements AnimatedEvent {
    
    public static final int evtPush_rampe_id = 14225;		//## ignore 
    
    
    // Constructors
    
    public  evtPush() {
        lId = evtPush_rampe_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evtPush_rampe_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("rampe.evtPush");
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
          String s="evtPush(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/evtPush.java
*********************************************************************/

