/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: InternalState
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/InternalState.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/InternalState.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class InternalState 
public class InternalState implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassInternalState = new AnimClass("rampe.InternalState",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  InternalState() {
        try {
            animInstance().notifyConstructorEntered(animClassInternalState.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassInternalState; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(InternalState.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            InternalState.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            InternalState.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/InternalState.java
*********************************************************************/

