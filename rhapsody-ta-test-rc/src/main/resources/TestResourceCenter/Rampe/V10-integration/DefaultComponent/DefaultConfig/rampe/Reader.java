/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Reader
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Reader.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/Reader.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Reader 
public class Reader implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassReader = new AnimClass("rampe.Reader",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Reader() {
        try {
            animInstance().notifyConstructorEntered(animClassReader.getUserClass(),
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
        return animClassReader; 
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
            super(Reader.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Reader.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Reader.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Reader.java
*********************************************************************/

