/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: e3
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/e3.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/e3.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## event e3() 
public class e3 extends RiJEvent implements AnimatedEvent {
    
    public static final int e3_rampe_id = 14228;		//## ignore 
    
    
    // Constructors
    
    public  e3() {
        lId = e3_rampe_id;
    }
    
    public boolean isTypeOf(long id) {
        return (e3_rampe_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("rampe.e3");
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
          String s="e3(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/e3.java
*********************************************************************/

