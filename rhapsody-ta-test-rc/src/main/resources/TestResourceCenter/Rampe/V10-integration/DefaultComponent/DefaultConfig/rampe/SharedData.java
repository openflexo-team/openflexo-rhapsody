/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SharedData
//!	Generated Date	: Mon, 18, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/SharedData.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/SharedData.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class SharedData 
public class SharedData implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSharedData = new AnimClass("rampe.SharedData",false);
    //#]
    
    protected Inputs itsInputs;		//## classInstance itsInputs 
    
    protected Outputs itsOutputs;		//## classInstance itsOutputs 
    
    
    // Constructors
    
    //## auto_generated 
    public  SharedData() {
        try {
            animInstance().notifyConstructorEntered(animClassSharedData.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Inputs getItsInputs() {
        return itsInputs;
    }
    
    //## auto_generated 
    public Inputs newItsInputs() {
        itsInputs = new Inputs();
        animInstance().notifyRelationAdded("itsInputs", itsInputs);
        return itsInputs;
    }
    
    //## auto_generated 
    public void deleteItsInputs() {
        animInstance().notifyRelationRemoved("itsInputs", itsInputs);
        itsInputs=null;
    }
    
    //## auto_generated 
    public Outputs getItsOutputs() {
        return itsOutputs;
    }
    
    //## auto_generated 
    public Outputs newItsOutputs() {
        itsOutputs = new Outputs();
        animInstance().notifyRelationAdded("itsOutputs", itsOutputs);
        return itsOutputs;
    }
    
    //## auto_generated 
    public void deleteItsOutputs() {
        animInstance().notifyRelationRemoved("itsOutputs", itsOutputs);
        itsOutputs=null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        itsInputs = newItsInputs();
        itsOutputs = newItsOutputs();
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSharedData; 
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
        
        msg.add("itsInputs", true, true, itsInputs);
        msg.add("itsOutputs", true, true, itsOutputs);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(SharedData.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SharedData.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SharedData.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/SharedData.java
*********************************************************************/

