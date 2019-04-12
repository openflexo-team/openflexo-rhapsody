/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Lock
//!	Generated Date	: Tue, 12, Sep 2017 
	File Path	: DefaultComponent/DefaultConfig/rampe/Lock.java
*********************************************************************/

package rampe;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// rampe/Lock.java                                                                  
//----------------------------------------------------------------------------

//## package rampe 


//## class Lock 
public class Lock implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassLock = new AnimClass("rampe.Lock",false);
    //#]
    
    protected Lock.toDoor_C toDoor;		//## ignore 
    
    protected Lock.command_C command;		//## ignore 
    
    
    // Constructors
    
    //## auto_generated 
    public  Lock() {
        try {
            animInstance().notifyConstructorEntered(animClassLock.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Lock.toDoor_C getToDoor() {
        return toDoor;
    }
    
    //## auto_generated 
    public Lock.toDoor_C get_toDoor() {
        return toDoor;
    }
    
    //## auto_generated 
    public Lock.toDoor_C newToDoor() {
        toDoor = new Lock.toDoor_C();
        return toDoor;
    }
    
    //## auto_generated 
    public void deleteToDoor() {
        toDoor=null;
    }
    
    //## auto_generated 
    public Lock.command_C getCommand() {
        return command;
    }
    
    //## auto_generated 
    public Lock.command_C get_command() {
        return command;
    }
    
    //## auto_generated 
    public Lock.command_C newCommand() {
        command = new Lock.command_C();
        return command;
    }
    
    //## auto_generated 
    public void deleteCommand() {
        command=null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        toDoor = newToDoor();
        command = newCommand();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class toDoor_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  toDoor_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLock(Lock) 
        public void connectLock(Lock part) {
            //#[ operation connectLock(Lock) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class command_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  command_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectLock(Lock) 
        public void connectLock(Lock part) {
            //#[ operation connectLock(Lock) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassLock; 
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
            super(Lock.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Lock.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Lock.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/rampe/Lock.java
*********************************************************************/

