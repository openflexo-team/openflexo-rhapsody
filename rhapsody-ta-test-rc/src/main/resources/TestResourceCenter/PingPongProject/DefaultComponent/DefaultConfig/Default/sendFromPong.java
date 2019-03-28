/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: guerinsy
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendFromPong
//!	Generated Date	: Mon, 25, Mar 2019 
	File Path	: DefaultComponent/DefaultConfig/Default/sendFromPong.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/sendFromPong.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event sendFromPong() 
public class sendFromPong extends RiJEvent implements AnimatedEvent {
    
    public static final int sendFromPong_Default_id = 18618;		//## ignore 
    
    
    // Constructors
    
    public  sendFromPong() {
        lId = sendFromPong_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (sendFromPong_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.sendFromPong");
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
          String s="sendFromPong(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/sendFromPong.java
*********************************************************************/

