/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: Adrien
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Unpress
//!	Generated Date	: Wed, 14, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Unpress.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Unpress.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event Unpress() 
public class Unpress extends RiJEvent implements AnimatedEvent {
    
    public static final int Unpress_Default_id = 18628;		//## ignore 
    
    
    // Constructors
    
    public  Unpress() {
        lId = Unpress_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (Unpress_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.Unpress");
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
          String s="Unpress(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Unpress.java
*********************************************************************/

