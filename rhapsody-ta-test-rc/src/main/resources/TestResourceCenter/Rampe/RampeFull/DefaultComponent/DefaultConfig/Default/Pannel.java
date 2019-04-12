/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: teodorci
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pannel
//!	Generated Date	: Mon, 12, Jun 2017 
	File Path	: DefaultComponent/DefaultConfig/Default/Pannel.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Pannel.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Pannel 
public class Pannel implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected Pannel.openPort_C openPort;		//## ignore 
    
    protected Pannel.closePort_C closePort;		//## ignore 
    
    protected PushButton itsCloseButton;		//## classInstance itsCloseButton 
    
    protected PushButton itsOpenButton;		//## classInstance itsOpenButton 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Pannel(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
    }
    
    //## auto_generated 
    public Pannel.openPort_C getOpenPort() {
        return openPort;
    }
    
    //## auto_generated 
    public Pannel.openPort_C get_openPort() {
        return openPort;
    }
    
    //## auto_generated 
    public Pannel.openPort_C newOpenPort() {
        openPort = new Pannel.openPort_C();
        return openPort;
    }
    
    //## auto_generated 
    public void deleteOpenPort() {
        openPort=null;
    }
    
    //## auto_generated 
    public Pannel.closePort_C getClosePort() {
        return closePort;
    }
    
    //## auto_generated 
    public Pannel.closePort_C get_closePort() {
        return closePort;
    }
    
    //## auto_generated 
    public Pannel.closePort_C newClosePort() {
        closePort = new Pannel.closePort_C();
        return closePort;
    }
    
    //## auto_generated 
    public void deleteClosePort() {
        closePort=null;
    }
    
    //## auto_generated 
    public PushButton getItsCloseButton() {
        return itsCloseButton;
    }
    
    //## auto_generated 
    public PushButton newItsCloseButton(RiJThread p_thread) {
        itsCloseButton = new PushButton(p_thread);
        return itsCloseButton;
    }
    
    //## auto_generated 
    public void deleteItsCloseButton() {
        itsCloseButton=null;
    }
    
    //## auto_generated 
    public PushButton getItsOpenButton() {
        return itsOpenButton;
    }
    
    //## auto_generated 
    public PushButton newItsOpenButton(RiJThread p_thread) {
        itsOpenButton = new PushButton(p_thread);
        return itsOpenButton;
    }
    
    //## auto_generated 
    public void deleteItsOpenButton() {
        itsOpenButton=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        openPort = newOpenPort();
        closePort = newClosePort();
        itsCloseButton = newItsCloseButton(p_thread);
        itsOpenButton = newItsOpenButton(p_thread);
        {
            
            getClosePort().setItsDefaultProvidedInterface(itsCloseButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsCloseButton.getPort().setItsDefaultRequiredInterface(getClosePort().getItsDefaultRequiredInterface());
            
        }
        {
            
            getOpenPort().setItsDefaultProvidedInterface(itsOpenButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsOpenButton.getPort().setItsDefaultRequiredInterface(getOpenPort().getItsDefaultRequiredInterface());
            
        }
        {
            
            getOpenPort().setItsDefaultProvidedInterface(itsCloseButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsCloseButton.getPort().setItsDefaultRequiredInterface(getOpenPort().getItsDefaultRequiredInterface());
            
        }
        {
            
            getClosePort().setItsDefaultProvidedInterface(itsOpenButton.getPort().getItsDefaultProvidedInterface());
            
        }{
            
            itsOpenButton.getPort().setItsDefaultRequiredInterface(getClosePort().getItsDefaultRequiredInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCloseButton.startBehavior();
        done &= itsOpenButton.startBehavior();
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class openPort_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  openPort_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class closePort_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  closePort_C() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Pannel.java
*********************************************************************/

