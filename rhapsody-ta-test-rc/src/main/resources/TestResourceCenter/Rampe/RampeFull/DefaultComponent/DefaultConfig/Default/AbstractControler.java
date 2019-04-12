/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: AbstractControler
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/AbstractControler.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/AbstractControler.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class AbstractControler 
public abstract class AbstractControler {
    
    protected AbstractControler.internalOpen_C internalOpen;		//## ignore 
    
    protected AbstractControler.internalClose_C internalClose;		//## ignore 
    
    protected AbstractControler.pilotOpen_C pilotOpen;		//## ignore 
    
    protected AbstractControler.pilotClose_C pilotClose;		//## ignore 
    
    protected AbstractControler.externalOpen_C externalOpen;		//## ignore 
    
    protected AbstractControler.externalClose_C externalClose;		//## ignore 
    
    protected AbstractControler.inhibition_C inhibition;		//## ignore 
    
    
    // Constructors
    
    //## auto_generated 
    public  AbstractControler() {
        initRelations();
    }
    
    //## auto_generated 
    public AbstractControler.internalOpen_C getInternalOpen() {
        return internalOpen;
    }
    
    //## auto_generated 
    public AbstractControler.internalOpen_C get_internalOpen() {
        return internalOpen;
    }
    
    //## auto_generated 
    public AbstractControler.internalOpen_C newInternalOpen() {
        internalOpen = new AbstractControler.internalOpen_C();
        return internalOpen;
    }
    
    //## auto_generated 
    public void deleteInternalOpen() {
        internalOpen=null;
    }
    
    //## auto_generated 
    public AbstractControler.internalClose_C getInternalClose() {
        return internalClose;
    }
    
    //## auto_generated 
    public AbstractControler.internalClose_C get_internalClose() {
        return internalClose;
    }
    
    //## auto_generated 
    public AbstractControler.internalClose_C newInternalClose() {
        internalClose = new AbstractControler.internalClose_C();
        return internalClose;
    }
    
    //## auto_generated 
    public void deleteInternalClose() {
        internalClose=null;
    }
    
    //## auto_generated 
    public AbstractControler.pilotOpen_C getPilotOpen() {
        return pilotOpen;
    }
    
    //## auto_generated 
    public AbstractControler.pilotOpen_C get_pilotOpen() {
        return pilotOpen;
    }
    
    //## auto_generated 
    public AbstractControler.pilotOpen_C newPilotOpen() {
        pilotOpen = new AbstractControler.pilotOpen_C();
        return pilotOpen;
    }
    
    //## auto_generated 
    public void deletePilotOpen() {
        pilotOpen=null;
    }
    
    //## auto_generated 
    public AbstractControler.pilotClose_C getPilotClose() {
        return pilotClose;
    }
    
    //## auto_generated 
    public AbstractControler.pilotClose_C get_pilotClose() {
        return pilotClose;
    }
    
    //## auto_generated 
    public AbstractControler.pilotClose_C newPilotClose() {
        pilotClose = new AbstractControler.pilotClose_C();
        return pilotClose;
    }
    
    //## auto_generated 
    public void deletePilotClose() {
        pilotClose=null;
    }
    
    //## auto_generated 
    public AbstractControler.externalOpen_C getExternalOpen() {
        return externalOpen;
    }
    
    //## auto_generated 
    public AbstractControler.externalOpen_C get_externalOpen() {
        return externalOpen;
    }
    
    //## auto_generated 
    public AbstractControler.externalOpen_C newExternalOpen() {
        externalOpen = new AbstractControler.externalOpen_C();
        return externalOpen;
    }
    
    //## auto_generated 
    public void deleteExternalOpen() {
        externalOpen=null;
    }
    
    //## auto_generated 
    public AbstractControler.externalClose_C getExternalClose() {
        return externalClose;
    }
    
    //## auto_generated 
    public AbstractControler.externalClose_C get_externalClose() {
        return externalClose;
    }
    
    //## auto_generated 
    public AbstractControler.externalClose_C newExternalClose() {
        externalClose = new AbstractControler.externalClose_C();
        return externalClose;
    }
    
    //## auto_generated 
    public void deleteExternalClose() {
        externalClose=null;
    }
    
    //## auto_generated 
    public AbstractControler.inhibition_C getInhibition() {
        return inhibition;
    }
    
    //## auto_generated 
    public AbstractControler.inhibition_C get_inhibition() {
        return inhibition;
    }
    
    //## auto_generated 
    public AbstractControler.inhibition_C newInhibition() {
        inhibition = new AbstractControler.inhibition_C();
        return inhibition;
    }
    
    //## auto_generated 
    public void deleteInhibition() {
        inhibition=null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        internalOpen = newInternalOpen();
        internalClose = newInternalClose();
        pilotOpen = newPilotOpen();
        pilotClose = newPilotClose();
        externalOpen = newExternalOpen();
        externalClose = newExternalClose();
        inhibition = newInhibition();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class internalOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  internalOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class internalClose_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  internalClose_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class pilotOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  pilotOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class pilotClose_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  pilotClose_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class externalOpen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  externalOpen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class externalClose_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  externalClose_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class inhibition_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  inhibition_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectAbstractControler(AbstractControler) 
        public void connectAbstractControler(AbstractControler part) {
            //#[ operation connectAbstractControler(AbstractControler) 
            //#]
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/AbstractControler.java
*********************************************************************/

